package com.example.constraintlayout2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Formmenu extends AppCompatActivity {

    //Deklarasi Variabel dengan tipe Edittext
    EditText edtNama, edtAlamat, edtEmail, edtPassword, edtrepass;

    //Deklarasi variabel dengan tipe data floating action button
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formmenu);

        edtNama = findViewById(R.id.edNama);
        edtAlamat = findViewById(R.id.edAlamat);
        edtEmail = findViewById(R.id.edEmail);
        edtPassword = findViewById(R.id.edPass);
        edtrepass = findViewById(R.id.edrepass);
        fab = findViewById(R.id.fabsimpan);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Membuat kondisi untuk mengecek apakah EditText kosong atau tidak
                if (edtNama.getText().toString().isEmpty() ||
                        edtAlamat.getText().toString().isEmpty() ||
                        edtEmail.getText().toString().isEmpty() ||
                        edtPassword.getText().toString().isEmpty() ||
                        edtrepass.getText().toString().isEmpty())
                {
                    //menampilkan pesan notifikasi jika seluruh EditText wajib diisi
                    Snackbar.make(view, "Wajib isi seluruh data !!!", Snackbar.LENGTH_LONG).show();
                }
                else
                {
                    if (edtPassword.getText().toString().equals(edtrepass.getText().toString()))
                    {
                        Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil...",
                                Toast.LENGTH_LONG).show();
                        Intent a = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(a);

                    }
                    else
                    {
                        Snackbar.make(view, "Password dan Repassword harus sama!!!",
                                Snackbar.LENGTH_LONG).show();
                    }

                }
            }
        });
    }
}
package com.example.constraintlayout2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Deklarasi variabel untuk button
    Button btnLogin;

    //Deklarasi variabel untuk editText
    EditText edEmail, edPassword;

    //deklarasi variabel untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // mengubunkan variabel btnLoin dengan componen button pada layout
        btnLogin = findViewById(R.id.btSignin);

        // mengubunkan variabel edemail dengan componen button pada layout
        edEmail = findViewById(R.id.edEmail);

        // mengubunkan variabel edemail dengan componen button pada layout
        edPassword = findViewById(R.id.edPassword);


        //membuat fungsi onclick pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //menyimpan input user di edittext email kedalam variabel nama
                nama = edEmail.getText().toString();

                //menyimpan input user di edittext password kedalam variabel password
                password = edPassword.getText().toString();

                //membuat variabel toast dan membuat toast dengan menambakan variabel nama dan password
                if (nama.equals("admin@mail.com") && password.equals("123")) {
                    Toast.makeText(MainActivity.this, "Login Berhasil", Toast.LENGTH_SHORT).show();
                } else if (nama.equals("admin@mail.com") && password.equals(password)) {
                    Toast.makeText(MainActivity.this, "Password Salah", Toast.LENGTH_SHORT).show();
                } else if (nama.equals(nama) && password.equals("123")) {
                    Toast.makeText(MainActivity.this, "Email Berhasil", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Email dan Password Salah", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
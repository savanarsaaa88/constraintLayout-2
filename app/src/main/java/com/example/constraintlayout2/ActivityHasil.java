package com.example.constraintlayout2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ActivityHasil extends AppCompatActivity {
    TextView txEmail, txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Hasil_Activity);

        txEmail = findViewById(R.id.edAlamat);
        txPassword = findViewById(R.id.edPassword);

        Bundle bundle = getIntent().getExtras();

        String email = bundle.getString("a");

        String pass = bundle.getString("b");

        txEmail.setText(email);
        txPassword.setText(pass);
    }
}
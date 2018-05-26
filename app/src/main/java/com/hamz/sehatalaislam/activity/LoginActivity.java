package com.hamz.sehatalaislam.activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.hamz.sehatalaislam.R;

public class LoginActivity extends AppCompatActivity {

    Button btnMasuk, btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initVIews();

    }

    private void initVIews() {
        btnMasuk = (Button) findViewById(R.id.btn_masuk);
        btnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                masuk();
            }
        });
        btnDaftar = (Button) findViewById(R.id.btn_daftar);
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "Coming soon", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private Activity getActivity() {
        return LoginActivity.this;
    }

    private void masuk() {
        Intent main = new Intent(getActivity(), MainActivity2.class);
        startActivity(main);
    }
}

package com.sisempresa.arqdsis.sistemaempresa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CriarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar);
    }

    public void criado(View view) {

        Toast.makeText(this, "Criado", Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

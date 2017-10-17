package com.sisempresa.arqdsis.sistemaempresa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FazerLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fazer_login);
    }

    public void submit(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

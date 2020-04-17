package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NewActvity extends AppCompatActivity {

    private TextView txtMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_actvity);
        txtMensagem = findViewById(R.id.text_mensagem);
        Intent intent = getIntent();
        int count = intent.getIntExtra(MainActivity.COUNT, 0);
        txtMensagem.setText(String.valueOf(count));
    }
}

package com.example.counterhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.String.valueOf;

public class MainActivity extends AppCompatActivity {

    private int contador = 0;
    private TextView txtNumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNumero = findViewById(R.id.txtNumero);
        //txtNumero.onSaveInstanceState();
        Log.d("teste", "onCreate()");
        if(savedInstanceState != null){
            contador = savedInstanceState.getInt("txtNumero");
            txtNumero.setText(valueOf(contador));
        }

    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("txtNumero", contador);
    }


    public void incrementar(View view) {
        contador++;
        txtNumero.setText(valueOf(contador));
    }
}

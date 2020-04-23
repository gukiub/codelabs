package com.example.homework42;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox choco;
    private CheckBox amora;
    private CheckBox potato;
    private CheckBox doce;
    private CheckBox pascoa;

    private String mensagem = "sobremesas: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        choco = findViewById(R.id.check_choco);
        amora = findViewById(R.id.check_amora);
        potato = findViewById(R.id.check_potato);
        doce = findViewById(R.id.check_doce);
        pascoa = findViewById(R.id.check_pascoa);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    public void showToast(View view) {
        if(choco.isChecked()){
            mensagem += " " + choco.getText().toString();
        }
        if(potato.isChecked()){
            mensagem += " " + potato.getText().toString();
        }
        if(doce.isChecked()){
            mensagem += " " + doce.getText().toString();
        }
        if(pascoa.isChecked()){
            mensagem += " " + pascoa.getText().toString();
        }
        if(amora.isChecked()){
            mensagem += " " + amora.getText().toString();
        }
        displayToast(mensagem);
        if(!mensagem.isEmpty()){
            mensagem = "sobremesas: ";
        }
    }
}

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText val1, val2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        val1=(EditText) findViewById(R.id.valor1txt);
        val2=(EditText) findViewById(R.id.valor2txt);
    }
    public void suma(View view){
        double total = 0;
        String valor1s = val1.getText().toString();
        double valor1i = Integer.valueOf(valor1s);
        String valor2s = val2.getText().toString();
        double valor2i = Integer.valueOf(valor2s);
        if(valor1s.isEmpty()||valor2s.isEmpty()){
            if(valor1s.isEmpty())
                val1.setError("ingresa el valor 1");
            if(valor2s.isEmpty())
                val2.setError("ingresa el valor 2");
        }else{
            int n1 = Integer.valueOf(valor1s);
            int n2 = Integer.valueOf(valor2s);
            total = valor1i + valor2i;
            Toast.makeText(this, "La suma es " + total, Toast.LENGTH_SHORT).show();
        }
    }
    public void resta(View view){
        double total=0;
        String valor1s = val1.getText().toString();
        double valor1i =Integer.valueOf(valor1s);
        String valor2s = val2.getText().toString();
        double valor2i =Integer.valueOf(valor2s);
        if(valor1s.isEmpty()||valor2s.isEmpty()){
            if(valor1s.isEmpty())
                val1.setError("ingresa el valor 1");
            if(valor2s.isEmpty())
                val2.setError("ingresa el valor 2");
        }else{
            int n1 = Integer.valueOf(valor1s);
            int n2 = Integer.valueOf(valor2s);
            total= valor1i-valor2i;
            Toast.makeText(this, "La resta es "+ total, Toast.LENGTH_SHORT).show();
        }
    }
    public void multi(View view){
        double total=0;
        String valor1s = val1.getText().toString();
        double valor1i =Integer.valueOf(valor1s);
        String valor2s = val2.getText().toString();
        double valor2i =Integer.valueOf(valor2s);
        if(valor1s.isEmpty()||valor2s.isEmpty()){
            if(valor1s.isEmpty())
                val1.setError("ingresa el valor 1");
            if(valor2s.isEmpty())
                val2.setError("ingresa el valor 2");
        }else{
            int n1 = Integer.valueOf(valor1s);
            int n2 = Integer.valueOf(valor2s);
            total= valor1i*valor2i;
            Toast.makeText(this, "La multi es "+ total, Toast.LENGTH_SHORT).show();
        }

    }
    public void divi(View view){
        double total=0;
        String valor1s = val1.getText().toString();
        double valor1i =Integer.valueOf(valor1s);
        String valor2s = val2.getText().toString();
        double valor2i =Integer.valueOf(valor2s);
        if(valor1s.isEmpty()||valor2s.isEmpty()){
            if(valor1s.isEmpty())
                val1.setError("ingresa el valor 1");
            if(valor2s.isEmpty())
                val2.setError("ingresa el valor 2");
        }else{
            int n1 = Integer.valueOf(valor1s);
            int n2 = Integer.valueOf(valor2s);
            total= valor1i/valor2i;
            Toast.makeText(this, "La divi es "+ total, Toast.LENGTH_SHORT).show();
        }
    }
    public void limp(View view) {
        val1.setText("");
        val2.setText("");
        }
}
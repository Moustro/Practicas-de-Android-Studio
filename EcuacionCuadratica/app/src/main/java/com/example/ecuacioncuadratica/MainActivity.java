package com.example.ecuacioncuadratica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText val1, val2, val3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val1 = (EditText) findViewById(R.id.TCuadratico);
        val2 = (EditText) findViewById(R.id.TLineal);
        val3 = (EditText) findViewById(R.id.TIndependiente);
    }

    public void ecuacion(View view){

        double x1, x2, total = 0;

        String valora = val1.getText().toString();
        double valor1 = Integer.valueOf(valora);
        String valorb = val2.getText().toString();
        double valor2 = Integer.valueOf(valorb);
        String valorc = val1.getText().toString();
        double valor3 = Integer.valueOf(valorc);

        int n1 = Integer.valueOf(valora);
        int n2 = Integer.valueOf(valorb);
        int n3 = Integer.valueOf(valorc);
        total = ((n2*n2)-4*n1*n3);

        if (total<0){
            Toast.makeText(this, "No existen dentro de los reales", Toast.LENGTH_SHORT).show();
        }
        else{
            x1 = (-n2+Math.sqrt(total))/(2*n1);
            x2 = (-n2-Math.sqrt(total))/(2*n1);
            Toast.makeText(this, "El resultado de X1:  " + x1 + "\nEl resultado de X2:  " + x2, Toast.LENGTH_SHORT).show();
        }
    }
}
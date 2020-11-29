package com.example.appcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button b00, b01, b02, b03, b04, b05, b06, b07, b08, b09;
    Button bsum, bres, bmulti, bdivi, blimp, bigual;
    TextView resultado;
    String op, num , acum;
    double total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b00 = (Button) findViewById(R.id.cero);
        b01 = (Button) findViewById(R.id.uno);
        b02 = (Button) findViewById(R.id.dos);
        b03 = (Button) findViewById(R.id.tres);
        b04 = (Button) findViewById(R.id.cuatro);
        b05 = (Button) findViewById(R.id.cinco);
        b06 = (Button) findViewById(R.id.seis);
        b07 = (Button) findViewById(R.id.siete);
        b08 = (Button) findViewById(R.id.ocho);
        b09 = (Button) findViewById(R.id.nueve);
        bsum = (Button) findViewById(R.id.suma);
        bres = (Button) findViewById(R.id.resta);
        bmulti = (Button) findViewById(R.id.multiplicacion);
        bdivi = (Button) findViewById(R.id.divicion);
        blimp = (Button) findViewById(R.id.limpiar);
        bigual = (Button) findViewById(R.id.igual);
        resultado = (TextView) findViewById(R.id.valortxt);

        b00.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num = resultado.getText().toString();
                num = num + "0";
                resultado.setText(num);
            }
        });

        b01.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num = resultado.getText().toString();
                num = num + "1";
                resultado.setText(num);
            }
        });

        b02.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num = resultado.getText().toString();
                num = num + "2";
                resultado.setText(num);
            }
        });

        b03.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num = resultado.getText().toString();
                num = num + "3";
                resultado.setText(num);
            }
        });

        b04.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num = resultado.getText().toString();
                num = num + "4";
                resultado.setText(num);
            }
        });

        b05.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num = resultado.getText().toString();
                num = num + "5";
                resultado.setText(num);
            }
        });

        b06.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num = resultado.getText().toString();
                num = num + "6";
                resultado.setText(num);
            }
        });

        b07.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num = resultado.getText().toString();
                num = num + "7";
                resultado.setText(num);
            }
        });

        b08.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num = resultado.getText().toString();
                num = num + "8";
                resultado.setText(num);
            }
        });

        b09.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num = resultado.getText().toString();
                num = num + "9";
                resultado.setText(num);
            }
        });

        bsum.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                acum = resultado.getText().toString();
                op = "+";
                resultado.setText("");
            }
        });

        bres.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                acum = resultado.getText().toString();
                op = "-";
                resultado.setText("");
            }
        });

        bmulti.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                acum = resultado.getText().toString();
                op = "*";
                resultado.setText("");
            }
        });

        bdivi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                acum = resultado.getText().toString();
                op = "/";
                resultado.setText("");
            }
        });

        blimp.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num = "";
                resultado.setText(num);
                acum = "";
                op = "";
            }
        });

        bigual.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num = resultado.getText().toString();
                num = num + "1";
                if(op.equals("-")){
                    total = Double.parseDouble(acum) - Double.parseDouble(resultado.getText().toString());
                    resultado.setText(String.valueOf(total));
                }
                if(op.equals("+")){
                    total = Double.parseDouble(acum) + Double.parseDouble(resultado.getText().toString());
                    resultado.setText(String.valueOf(total));
                }
                if(op.equals("/")){
                    total = Double.parseDouble(acum) / Double.parseDouble(resultado.getText().toString());
                    resultado.setText(String.valueOf(total));
                }
                if(op.equals("*")){
                    total = Double.parseDouble(acum) * Double.parseDouble(resultado.getText().toString());
                    resultado.setText(String.valueOf(total));
                }
            }
        });
    }
}
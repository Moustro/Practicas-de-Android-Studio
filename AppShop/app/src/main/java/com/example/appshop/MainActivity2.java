package com.example.appshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button agregar = (Button) findViewById(R.id.button01);
        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent01 = new Intent (v.getContext(), MainActivity3.class);
                startActivityForResult(intent01, 0);
            }
        });
        Button modificar = (Button) findViewById(R.id.button02);
        modificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent01 = new Intent (v.getContext(), MainActivity4.class);
                startActivityForResult(intent01, 0);
            }
        });
        Button eliminar = (Button) findViewById(R.id.button03);
        eliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent01 = new Intent (v.getContext(), MainActivity5.class);
                startActivityForResult(intent01, 0);
            }
        });
    }
}
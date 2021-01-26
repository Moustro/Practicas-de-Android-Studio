package com.example.appshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {
    EditText codigo01;
    EditText nombre01;
    EditText cantidad01;
    EditText descripcion01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        codigo01 = (EditText)findViewById(R.id.editTextNumber11);
        nombre01 = (EditText)findViewById(R.id.editTextTextPersonName11);
        cantidad01 = (EditText)findViewById(R.id.editTextTextPersonName12);
        descripcion01 = (EditText)findViewById(R.id.editTextTextPersonName13);
        Button salir = (Button) findViewById(R.id.button12);
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent01 = new Intent (v.getContext(), MainActivity2.class);
                startActivityForResult(intent01, 0);
            }
        });
    }
    public void agregar (View v){
        basedatos bdD = new basedatos(this, "db1",null,1);
        SQLiteDatabase BaseDatos = bdD.getWritableDatabase();

        String codigon = codigo01.getText().toString();
        String nombren = nombre01.getText().toString();
        String cantidan = cantidad01.getText().toString();
        String descripcionn = descripcion01.getText().toString();

        ContentValues registro = new ContentValues();
        registro.put("codigo",codigon);
        registro.put("nombre",nombren);
        registro.put("cantida",cantidan);
        registro.put("descripcion",descripcionn);

        BaseDatos.insert("productos", null, registro);
        BaseDatos.close();
    }
}

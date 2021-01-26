package com.example.appshop;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    EditText codigo01;
    TextView nombre01;
    TextView cantidad01;
    TextView descripcion01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        codigo01 = (EditText)findViewById(R.id.editTextNumber31);
        nombre01 = (TextView)findViewById(R.id.textView32);
        cantidad01 = (TextView)findViewById(R.id.textView33);
        descripcion01 = (TextView)findViewById(R.id.textView34);
        Button salir = (Button) findViewById(R.id.button32);
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent01 = new Intent (v.getContext(), MainActivity2.class);
                startActivityForResult(intent01, 0);
            }
        });
    }
    public void buscar (View v){
        basedatos bdD = new basedatos(this, "db1",null,1);
        SQLiteDatabase BaseDatos = bdD.getWritableDatabase();
        String codigon = codigo01.getText().toString();
        Cursor fila = BaseDatos.rawQuery
                ("select nombre, from productos where codigo= " + codigo01,null);

        codigo01.setText(fila.getString(0));
        BaseDatos.close();
    }
    public void eliminar (View v){
        basedatos bdD = new basedatos(this, "db1",null,1);
        SQLiteDatabase BaseDatos = bdD.getWritableDatabase();

        String codigon = codigo01.getText().toString();

        BaseDatos.delete("productos", "codigo= " + codigo01, null);
        BaseDatos.close();
    }
}
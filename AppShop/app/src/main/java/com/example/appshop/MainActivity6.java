package com.example.appshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {
    private EditText correo;
    private EditText contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        correo = (EditText)findViewById(R.id.editTextTextEmailAddress41);
        contraseña = (EditText)findViewById(R.id.editTextTextPassword41);
        SharedPreferences preferences1 = getSharedPreferences("datos", Context .MODE_PRIVATE);
        correo.setText( preferences1.getString("nombre","")   );

        if(preferences1.contains("nombre")) {
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
            finish();
        }
    }
    public void entrar(View view) {
        //SharedPreferences preferences = getSharedPreferences("dato",0);
        SharedPreferences preferences1 = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences1.edit();

        String datosN = correo.getText().toString();
        String Cont = contraseña.getText().toString();

        editor.putString("nombre",datosN);
        editor.putString("contrasena",Cont);
        editor.commit();

        Toast.makeText(this, "Bienvenido", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
        finish();
        editor.clear();
    }

}
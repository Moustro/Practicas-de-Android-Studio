package com.example.appshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getApplicationContext(), "Bienvenido", Toast.LENGTH_SHORT).show();
                Intent cambio = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(cambio);
                finish();
            }
        }, 5000);
    }
}

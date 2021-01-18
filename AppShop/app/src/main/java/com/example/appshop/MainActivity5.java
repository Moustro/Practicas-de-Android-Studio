package com.example.appshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Button salir = (Button) findViewById(R.id.button32);
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent01 = new Intent (v.getContext(), MainActivity2.class);
                startActivityForResult(intent01, 0);
            }
        });
    }
}
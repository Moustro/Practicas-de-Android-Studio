package com.example.web01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText link;
    Button buscar;
    WebView sitio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        link = findViewById(R.id.ruta);
        buscar = findViewById(R.id.ir);
        sitio = findViewById(R.id.pagina);
        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = link.getText().toString();
                sitio.getSettings().setLoadsImagesAutomatically(true);
                sitio.getSettings().setJavaScriptEnabled(true);
                sitio.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                sitio.setWebViewClient(new myWebViewClient());
                sitio.loadUrl(url);
            }
        });
    }
    private class myWebViewClient extends WebViewClient {
        public boolean shouldOverrideUrlLoading (WebView view, String url){
            sitio.loadUrl(url);
            return true;
        }
    }
}
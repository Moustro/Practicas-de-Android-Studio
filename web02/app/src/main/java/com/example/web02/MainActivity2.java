package com.example.web02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity2 extends AppCompatActivity {
    WebView sitio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        sitio = findViewById(R.id.pagina);
        Bundle link = getIntent().getExtras();
        String url = link.getString("cargar");
        sitio.getSettings().setLoadsImagesAutomatically(true);
        sitio.getSettings().setJavaScriptEnabled(true);
        sitio.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        sitio.setWebViewClient(new myWebViewClient());
        sitio.loadUrl(url);

    }
    private class myWebViewClient extends WebViewClient {
        public boolean shouldOverrideUrlLoading (WebView view, String url){
            sitio.loadUrl(url);
            return true;
        }
    }
}


package com.aula.praticamobilegrupo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class tela5 extends AppCompatActivity {

    String link;
    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela5);
        Intent intent = getIntent();
        link = intent.getDataString();
        webview = findViewById(R.id.tela5_webview);
        webview.loadUrl(link);
    }
}
package com.aula.praticamobilegrupo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class SplashScreen extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ImageView img = findViewById(R.id.SpSc_foto);

        Glide.with(this)
                .load("https://www.polemicaparaiba.com.br/wp-content/uploads/2019/01/gifs-dinheiro-gif-2.gif")
                .into(img);

        new Handler(Looper.getMainLooper()).postDelayed(
                new Runnable() {
                    @Override
                    public void run() {
                        abrirTela();
                    }
                }, 3000);

    }

    private void abrirTela() {
        Intent intent = new Intent(SplashScreen.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

}
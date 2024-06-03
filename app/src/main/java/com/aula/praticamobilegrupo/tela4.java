package com.aula.praticamobilegrupo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class tela4 extends AppCompatActivity {

    Button btnInformacoes, btnDownload;

    ImageView tabelaCalculo;
    int tipoRenda;
    String link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4);
        btnInformacoes = findViewById(R.id.tela4_btnInformacoes);
        btnDownload = findViewById(R.id.tela4_btnDownload);
        tabelaCalculo = findViewById(R.id.tela4_tabelaCalculo);


        Intent intent = getIntent();
        tipoRenda = intent.getIntExtra("tipoRenda",0);
        if(tipoRenda==2){
            tabelaCalculo.setImageResource(R.drawable.calculo_anual);
            tabelaCalculo.setContentDescription("Calculo Anual");
        }else if(tipoRenda==1){
            tabelaCalculo.setImageResource(R.drawable.calculo_mensal);
            tabelaCalculo.setContentDescription("Calculo Mensal");
        }

    }

    public void btnInformacoes(View view){
        link = "https://www.gov.br/receitafederal/pt-br";
        Intent intent = new Intent(tela4.this, tela5.class);
        intent.setData(Uri.parse(link));
        startActivity(intent);

    }
    public void btnDownload(View view){
        link = "https://www.gov.br/receitafederal/pt-br/centrais-de-conteudo/download/pgd/dirpf";
        Intent intent = new Intent(tela4.this, tela5.class);
        intent.setData(Uri.parse(link));
        startActivity(intent);
    }
}
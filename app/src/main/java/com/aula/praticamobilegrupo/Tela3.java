package com.aula.praticamobilegrupo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tela3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        TextView vlDec = findViewById(R.id.Tela3_vlDec);
        TextView vlPag = findViewById(R.id.Tela3_vlPag);
        Button btTab = findViewById(R.id.Tela3_btTab);

        vlDec.setText("Valor Declarado: R$" + String.valueOf(getIntent().getDoubleExtra("valor", 0)));

        double valor = getIntent().getDoubleExtra("valor", 0);
        double valorPagar;

        if(getIntent().getIntExtra("escolha", 0) == 1){

            if(valor <= 1903.98){
                valorPagar = 0;
            }else if (valor <= 2826.65){
                valorPagar = (valor * 0.075) - 142.80;
            }else if (valor <= 3751.05){
                valorPagar = (valor * 0.15) - 354.80;
            }else if (valor <= 4664.68){
                valorPagar = (valor * 0.225) - 636.13;
            }
            else{
                valorPagar = (valor * 0.275) - 869.36;
            }

            valorPagar = valorPagar * 12;

        } else{

            if(valor <= 22847.76){
                valorPagar = 0;
            } else if (valor <= 33919.8) {
                valorPagar = (valor * 0.075) - 636.13;
            } else if (valor <= 45012.6) {
                valorPagar = (valor * 0.15) - 869.36;
            } else {
                valorPagar = (valor * 0.225) - 1519.52;
            }

        }

        vlPag.setText("Valor a pagar: R$" + valorPagar);

        btTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Tela3.this, tela4.class);
                intent.putExtra("tipoRenda", getIntent().getIntExtra("escolha", 0));
                startActivity(intent);

            }
        });
    }
}
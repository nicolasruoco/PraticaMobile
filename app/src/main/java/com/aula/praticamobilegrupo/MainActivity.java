package com.aula.praticamobilegrupo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.aula.praticamobilegrupo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnMensal.setOnClickListener(v -> {
            if (binding.tipoRenda.getText() != null) {
                abrirtela3(1);
            } else {
                Toast.makeText(MainActivity.this, "Insira o valor", Toast.LENGTH_SHORT).show();
            }
        });

        binding.btnAnual.setOnClickListener(v -> {
            if (binding.tipoRenda.getText() != null) {
                abrirtela3(2);
            } else {
                Toast.makeText(MainActivity.this, "Insira o valor", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void abrirtela3(int escolha) {
        Intent intent = new Intent(this, Tela3.class);
        intent.putExtra("escolha", escolha);
        intent.putExtra("valor", Double.parseDouble(binding.tipoRenda.getText().toString()));
        startActivity(intent);
    }
}
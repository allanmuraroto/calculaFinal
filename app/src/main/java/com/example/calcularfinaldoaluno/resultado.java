package com.example.calcularfinaldoaluno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        TextView output = findViewById(R.id.textOutput);
        TextView outputNome = findViewById(R.id.textOutputNome);

        Intent it = getIntent(); //acessar o intent
        if(it != null)
        {
            Bundle params = it.getExtras();
            if(params != null)
            {
                String no = params.getString("no");
                String no1 = params.getString("nota1");
                String no2 = params.getString("nota2");
                String f = params.getString("frequencia");

                Double nota1 = Double.parseDouble(no1);
                Double nota2 = Double.parseDouble(no2);
                Double media = (nota1+nota2)/2;
                Integer frequencia = Integer.parseInt(f);

                if(media >= 70 && frequencia >= 75)
                {
                    output.setText("APROVADO");
                }
                else if(media >= 40 && media <70 && frequencia >= 75)
                {
                    output.setText("FINAL");
                }
                else if(frequencia < 75)
                {
                    output.setText("REPROVADO POR FALTA");
                }
                else if(media < 40)
                {
                    output.setText("REPROVADO POR NOTA");
                }

                outputNome.setText(no);

            }

        }
    }
}
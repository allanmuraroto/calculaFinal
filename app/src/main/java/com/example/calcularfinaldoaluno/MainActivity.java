package com.example.calcularfinaldoaluno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view)
    {

        EditText nome = findViewById(R.id.editTextName);
        EditText valor1 = findViewById(R.id.editTextNota1);
        EditText valor2 = findViewById(R.id.editTextNota2);
        EditText faltas = findViewById(R.id.editTextNumberFrequencia);
        Double n1 = Double.parseDouble(valor1.getText().toString());
        Double n2 = Double.parseDouble(valor2.getText().toString());
        Integer fa = Integer.parseInt(faltas.getText().toString());

        if(nome.length() == 0 )
        {
            Toast.makeText(this, "preencher todos os campos", Toast.LENGTH_SHORT).show();
        }
        else
        {
            if(n1.doubleValue() > 100.0)
            {
                Toast.makeText(this, "Nota inválida, usar de 0 a 100", Toast.LENGTH_SHORT).show();
            }
            else
            {
                if(n2 > 100.0)
                {
                    Toast.makeText(this, "Nota inválida, usar de 0 a 100", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(fa > 100)
                    {
                        Toast.makeText(this, "frequência inválida, usar de 0 a 100", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Intent it = new Intent(this, resultado.class);
                        Bundle params = new Bundle();

                        params.putString("no", nome.getText().toString());
                        params.putString("nota1", valor1.getText().toString());
                        params.putString("nota2", valor2.getText().toString());
                        params.putString("frequencia", faltas.getText().toString());
                        it.putExtras(params);

                        startActivity(it);
                    }
                }
            }
        }

    }
}
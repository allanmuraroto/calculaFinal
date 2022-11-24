package com.example.calcularfinaldoaluno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

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
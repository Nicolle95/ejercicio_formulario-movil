package com.example.ejercicio_formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityResultado extends AppCompatActivity {

    TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        assignValues();



    }
    private void assignValues(){
        Bundle bnd = getIntent().getExtras();
        Resultado = findViewById(R.id.tvResultado);

        Resultado.setText(bnd.getString("resultado"));

    }
}
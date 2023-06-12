package com.example.ejercicio_formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText tvNombre, tvApellido, tvEdad, tvCorreo;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        btnEnviar = findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(v -> {
            if(!emptyField(tvNombre,tvApellido,tvEdad,tvCorreo)){
                Intent panel = new Intent(getApplicationContext(), ActivityResultado.class);
                Bundle bnd = new Bundle();
                String Resultado = "Nombre: " + tvNombre.getText().toString() + " \n Apellido: "+ tvApellido.getText().toString() + " \n Edad:" + tvEdad.getText().toString() + "\n Correo:"+ tvCorreo.getText().toString();
                bnd.putString("resultado", Resultado);
                panel.putExtras(bnd);
                startActivity(panel);
            }else{
                Toast toast =  Toast.makeText(this, "Debe llenar los campos",Toast.LENGTH_LONG);
                toast.show();
            }
        });


    }

    public void initComponents(){
        tvNombre = findViewById(R.id.tvNombre);
        tvApellido = findViewById(R.id.tvApellido);
        tvEdad = findViewById(R.id.tvEdad);
        tvCorreo = findViewById(R.id.tvCorreo);

    }


    protected boolean emptyField(EditText tvNombre,EditText tvApellido,EditText tvEdad,EditText tvCorreo){
        if (tvNombre.getText().toString().length() < 1 || tvApellido.getText().toString().length() < 1 || tvEdad.getText().toString().length() < 1 || tvCorreo.getText().toString().length() < 1) return true;
        else return false;
    }


}
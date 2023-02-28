package com.example.enviarinfotarea2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Informacion extends AppCompatActivity {
    TextView nombres, apellidos, edad, correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        nombres=findViewById(R.id.t_nombre);
        apellidos=findViewById(R.id.t_apellido);
        edad=findViewById(R.id.t_edad);
        correo=findViewById(R.id.t_mail);

        // aplicar intent get extra
        Intent i = getIntent();
        String t_nombre=i.getStringExtra("Nombre");
        String t_apellido=i.getStringExtra("Apellidos");
        String t_edad=i.getStringExtra("Edad");
        String t_mail=i.getStringExtra("Correo");

        // set valores textView
        nombres.setText(t_nombre);
        apellidos.setText(t_apellido);
        edad.setText(t_edad);
        correo.setText(t_mail);
    }
}
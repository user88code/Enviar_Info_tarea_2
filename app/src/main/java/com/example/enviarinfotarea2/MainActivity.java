package com.example.enviarinfotarea2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nombres, apellidos, edad, correo;
    Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enviar=findViewById(R.id.enviarbtn);
        nombres=findViewById(R.id.t_nombre);
        apellidos=findViewById(R.id.t_apellido);
        edad=findViewById(R.id.t_edad);
        correo=findViewById(R.id.t_mail);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //crear variables String
                String nombre = nombres.getText().toString();
                String apellido = apellidos.getText().toString();
                String ed = edad.getText().toString();
                String mail = correo.getText().toString();

                // aplicar intent
                Intent i =new Intent(getApplicationContext(), Informacion.class);
                i.putExtra("Nombre",nombre);
                i.putExtra("Apellido",apellido);
                i.putExtra("edad",ed);
                i.putExtra("Correo",mail);
                startActivity(i);

            }
        });
    }
}
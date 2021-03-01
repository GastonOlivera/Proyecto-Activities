package com.example.planilladatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.nio.file.Files;

public class MuestraDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button Atras;
        setContentView(R.layout.activity_muestra_datos);
        Bundle paramtros=getIntent().getExtras();
        String nombreM=paramtros.getString("Nombre");
        String FechaM=paramtros.getString("Fecha");
        String TelM=paramtros.getString("Tel");
        String MailM=paramtros.getString("Mail");
        String DescM=paramtros.getString("Descripcion");
        TextView MuestraNombre=(TextView) findViewById(R.id.mostrarNombre);
        TextView MuestraFecha=(TextView) findViewById(R.id.mostrarFecha);
        TextView MuestraTel=(TextView) findViewById(R.id.mostrarTelefono);
        TextView MuestraMail=(TextView) findViewById(R.id.mostrarEmail);
        TextView MuestraDesc=(TextView) findViewById(R.id.mostrarDescripcion);
        MuestraNombre.setText("Nombre:\t"+nombreM);
        MuestraFecha.setText("Fecha:\t"+FechaM);
        MuestraTel.setText("Telefono:\t"+TelM);
        MuestraMail.setText("Mail:\t"+MailM);
        MuestraDesc.setText("Descripcion\t:"+DescM);
        Atras=(Button) findViewById(R.id.BotonEditar);
        Atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }

}

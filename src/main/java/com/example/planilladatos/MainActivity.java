package com.example.planilladatos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Calendar;



public class MainActivity<EdtitText> extends AppCompatActivity {



    private EditText textinputnombre;
    private EditText textinputfecha;
    private EditText textinputtelefono;
    private EditText textinputmail;
    private EditText textinputdescripcio;
    private DatePicker ElegirFecha;
    private String GuardarFecha="";
    private Calendar c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textinputnombre = findViewById(R.id.nombreEscri);
        textinputfecha = findViewById(R.id.Fechaescri);
        textinputtelefono= findViewById(R.id.Telefonoescri);
        textinputmail = findViewById(R.id.Mailescri);
        textinputdescripcio=findViewById(R.id.Descripcionestcri);





    }




    public void MostrarCalendario(View v) {
        c = Calendar.getInstance();
        int dia = c.get(Calendar.DAY_OF_MONTH);
        int mes = c.get(Calendar.MONTH);
        int año = c.get(Calendar.YEAR);
        DatePickerDialog selector = new DatePickerDialog(this, listenerDeDatePicker, dia, mes, año);
        selector.show();

    }

    private DatePickerDialog.OnDateSetListener listenerDeDatePicker = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int anio, int mes, int diaDelMes) {
            textinputfecha.setText(diaDelMes+"/"+(mes+1)+"/"+anio);
            GuardarFecha=diaDelMes+"/"+(mes+1)+"/"+anio;

        }
    };

    public void MostrarInformacion(View v) {

        Intent intent = new Intent(MainActivity.this, MuestraDatos.class);

        intent.putExtra("Nombre", textinputnombre.getText().toString());
        intent.putExtra("Fecha", textinputfecha.getText().toString());
        intent.putExtra("Tel", textinputtelefono.getText().toString());
        intent.putExtra("Mail", textinputmail.getText().toString());
        intent.putExtra("Descripcion", textinputdescripcio.getText().toString());

        startActivity(intent);
    }
}





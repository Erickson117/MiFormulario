package com.example.miformulario;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button_fecha;
    EditText editTextFecha;
    Button button_siguiente;
    EditText tvTelefono;
    EditText tvDescrip;
    EditText tvEmail;
    EditText nombre;
    private int dia;
    private int mes;
    private int ano;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Contacto contacto = new Contacto("","","","");

        button_fecha = (Button)findViewById(R.id.button_fecha);
        editTextFecha=(EditText)findViewById(R.id.editTextFecha);
        button_fecha.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v == button_fecha){
            final Calendar c = Calendar.getInstance();
            dia=c.get(Calendar.DAY_OF_MONTH);
            mes=c.get(Calendar.MONTH);
            ano=c.get(Calendar.YEAR);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener()  {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    editTextFecha.setText(dayOfMonth + "/" + (month + 1) + "/" + year);

                }
            }
            ,dia,mes,ano);
            datePickerDialog.show();
            }

        }

        public void Siguiente(View view){
        Intent siguiente = new Intent(this, Detalles.class);
        startActivity(siguiente);
    }
    }

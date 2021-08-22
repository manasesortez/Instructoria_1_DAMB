package com.amtodev.calculator_metric;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Calculator extends AppCompatActivity {

    String[] opciones = {
            "Kilometros a Metros",
            "Metros a Kilometros",
            "Metros a Centimentros",
            "Centimetros a Metros",
            "Metros a Pies",
            "Pies a Metros"};
    Spinner objSpinner;
    DecimalFormat format = new DecimalFormat("#.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        objSpinner = (Spinner) findViewById(R.id.listaConversion);
        ArrayAdapter<String> elAdaptador = new ArrayAdapter<String>(this, R.layout.spinner_iteam, opciones);
        objSpinner.setAdapter(elAdaptador);

        Button elBoton = (Button)findViewById(R.id.btnCalcular);
        elBoton.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view){
                int opcionSeleccionada;
                opcionSeleccionada = objSpinner.getSelectedItemPosition();
                EditText objCantidad = (EditText)findViewById(R.id.txtCantidad);
                TextView objLabel = (TextView) findViewById(R.id.lblResultados);
                Double cantidad = 0.0, resultado = 0.0;
                cantidad = Double.parseDouble(objCantidad.getText().toString());
                String abreviatura = "";
                switch (opcionSeleccionada){
                    case 0:
                        resultado = cantidad * 1000;
                        abreviatura = " MTS";
                        break;
                    case 1:
                        resultado = cantidad / 1000;
                        abreviatura = " KMS";
                        break;
                    case 2:
                        resultado = cantidad * 100;
                        abreviatura = " CM";
                        break;
                    case 3:
                        resultado = cantidad * 0.01;
                        abreviatura = " MTS";
                        break;
                    case 4:
                        resultado = cantidad * 3.28084;
                        abreviatura = " PIE";
                        break;
                    case 5:
                        resultado = cantidad * 0.30;
                        abreviatura = " MTS";
                        break;
                    default:
                        objLabel.setText("No has Agregado Ningun Valor");
                        break;
                }
                objLabel.setText("                        "+ format.format(resultado) + abreviatura);
            }
        });
    }



}
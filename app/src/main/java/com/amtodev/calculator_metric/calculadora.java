package com.amtodev.calculator_metric;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class calculadora extends AppCompatActivity {

    private EditText txt1, txt2;
    private TextView resultado;
    private RadioButton suma, resta, multiplicacion, division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        txt1 = (EditText)findViewById(R.id.txtNumero1);
        txt2 = (EditText)findViewById(R.id.txtNumero2);
        resultado = (TextView)findViewById(R.id.resultado);

        suma = (RadioButton)findViewById(R.id.suma);
        resta = (RadioButton)findViewById(R.id.resta);
        multiplicacion = (RadioButton)findViewById(R.id.multiplicacion);
        division = (RadioButton)findViewById(R.id.division);
    }

    @SuppressLint("SetTextI18n")
    public void Calcular(View view){
        String numero_1_String = txt1.getText().toString();
        String numero_2_String = txt2.getText().toString();

        int value_1 = parseInt(numero_1_String);
        int value_2 = parseInt(numero_2_String);

        if(suma.isChecked() == true){
            int sumaResult = value_1 + value_2;
            String resultado1 = String.valueOf(sumaResult);

            resultado.setText("Suma: "+resultado1);
        }else if(resta.isChecked() == true){
            int restaResult = value_1 - value_2;
            String resultado2 = String.valueOf(restaResult);

            resultado.setText("Resta: "+resultado2);
        }else if(multiplicacion.isChecked() == true){
            int multiplicacionResult = value_1 * value_2;
            String resultado3 = String.valueOf(multiplicacionResult);

            resultado.setText("Multiplicacion: "+resultado3);
        }else if(division.isChecked() == true){
            int DivisionResult = value_1 / value_2;
            String resultado4 = String.valueOf(DivisionResult);
            resultado.setText("Division: "+resultado4);

        }

    }
}
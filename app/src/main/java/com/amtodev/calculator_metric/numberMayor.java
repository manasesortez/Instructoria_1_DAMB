package com.amtodev.calculator_metric;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class numberMayor extends AppCompatActivity {

    private EditText txt1, txt2, txt3;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_mayor);

        txt1 = (EditText)findViewById(R.id.txtNumero1);
        txt2 = (EditText)findViewById(R.id.txtNumero2);
        txt3 = (EditText)findViewById(R.id.txtNumero3);

        resultado =  (TextView)findViewById(R.id.resultado);

    }

    @SuppressLint("SetTextI18n")
    public void calcularMayor(View view){
        String value1 = txt1.getText().toString();
        String value2 = txt2.getText().toString();
        String value3 = txt3.getText().toString();

        int number1 = Integer.parseInt(value1);
        int number2 = Integer.parseInt(value2);
        int number3 = Integer.parseInt(value3);

        if(number1 > number2){
            if (number1 > number3){
                resultado.setText("El Numero Mayor es: " + number1);
            }else{
                resultado.setText("El mayor es: " + number3);
            }
        }else if(number2 > number3){
            resultado.setText("El numero Mayor es: " + number2);
        }else{
            resultado.setText("El numero Mayor es: " + number3);
        }
    }
}
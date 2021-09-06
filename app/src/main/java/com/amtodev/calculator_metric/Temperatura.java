package com.amtodev.calculator_metric;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Temperatura extends AppCompatActivity {

    private EditText txt1;
    private RadioButton farenhaint;
    private Button Calcular;
    private TextView resultado;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);

        txt1 = (EditText)findViewById(R.id.txtNumero1);
        farenhaint = (RadioButton)findViewById(R.id.farenhaint);
        resultado = (TextView)findViewById(R.id.resultado);
    }

    @SuppressLint("SetTextI18n")
    public void Calcular(View view){
        String txt_farenhaint = txt1.getText().toString();

        double farenhaint_int = parseDouble(txt_farenhaint);

        if(farenhaint.isChecked() == true){
            double ResultFarenhaint = (farenhaint_int * 1.8) + 32;
            String resultado1 = String.valueOf(ResultFarenhaint);

            resultado.setText(farenhaint_int + " ºC es igual a: "+ resultado1 + " ºF");
        }

    }
}
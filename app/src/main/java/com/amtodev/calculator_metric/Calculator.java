package com.amtodev.calculator_metric;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Calculator extends AppCompatActivity {

    CardView notification;
    CardView informacion;
    CardView calculadora;
    CardView temperatura;
    CardView numeroMayor;
    CardView acelerometro;
    CardView luminosidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);


        notification = (CardView)findViewById(R.id.cv_notificacion);
        informacion = (CardView)findViewById(R.id.cv_informacion);
        calculadora = (CardView)findViewById(R.id.cv_calculadora);
        temperatura = (CardView)findViewById(R.id.cv_temperatura);
        numeroMayor = (CardView)findViewById(R.id.cv_numero_mayor);
        acelerometro = (CardView)findViewById(R.id.cv_acelerometro);

        notification.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent notificacion = new Intent(Calculator.this, notificacion.class);
                startActivity(notificacion);
            }

        });

        informacion.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent informacion = new Intent(Calculator.this, informacion.class);
                startActivity(informacion);
            }
        });

        calculadora.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent calculadora = new Intent(Calculator.this, calculadora.class);
                startActivity(calculadora);
            }
        });

        temperatura.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent temperatura = new Intent(Calculator.this, Temperatura.class);
                startActivity(temperatura);
            }
        });

        numeroMayor.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent menor_mayor = new Intent(Calculator.this, numberMayor.class);
                startActivity(menor_mayor);
            }
        });

        acelerometro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent acelerometro = new Intent(Calculator.this, acelerometro.class);
                startActivity(acelerometro);
            }
        });


        }
    }



package com.amtodev.calculator_metric;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class informacion extends AppCompatActivity {

    private Button diaSemana;
    private Button fechaNacimiento;
    private Button Codigo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        diaSemana = (Button) findViewById(R.id.dia);
        fechaNacimiento = (Button) findViewById(R.id.nacimiento);
        Codigo = (Button) findViewById(R.id.codigo);

        diaSemana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDia();
            }
        });

        fechaNacimiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNacimiento();
            }
        });

        Codigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCodigo();
            }
        });
    }

    @SuppressLint("SetTextI18n")
    private void showCodigo() {

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_root, (ViewGroup) findViewById(R.id.toast_root));

        TextView toastText = layout.findViewById(R.id.toast_text);

        toastText.setText("Codigo: u20171110");

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);

        toast.show();
    }

    @SuppressLint("SetTextI18n")
    private void showNacimiento() {

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_root, (ViewGroup) findViewById(R.id.toast_root));

        TextView toastText = layout.findViewById(R.id.toast_text);

        toastText.setText("Fecha de Nacimiento: 28 de enero del 2000");

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);

        toast.show();
    }

    @SuppressLint("SetTextI18n")
    private void showDia() {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_root, (ViewGroup) findViewById(R.id.toast_root));

        TextView toastText = layout.findViewById(R.id.toast_text);

        toastText.setText("Dia de la Semana: Lunes");


        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);

        toast.show();
    }
}
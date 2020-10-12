package com.example.ejerciciosmas40;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ejerciciosmas40.models.ejercicio;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ArrayList<ejercicio> listaEjercicios;
    RecyclerView recyclerejercicios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaEjercicios = new ArrayList<>();
        recyclerejercicios = (RecyclerView) findViewById(R.id.RecyclerId);
        recyclerejercicios.setLayoutManager(new LinearLayoutManager(this));

        llenarejercicios();

        adaptadorVideos adapter = new adaptadorVideos(listaEjercicios);
        recyclerejercicios.setAdapter(adapter);

    }

    private void llenarejercicios() {
        listaEjercicios.add(new ejercicio("60 minutos de Ejercicio Aeróbico para Adultos Mayores Activos (rutina completa)",
                "-QYqhmQj_ZI",
                "En este video te dejo una rutina de 60 minutos de ejercicio aeróbico para adultos mayores, esta rutina incluye calentamiento y estiramiento.",
                "BASICOS",
                "AEROBICOS"));
    }


    public void callActivity(View view){
        Intent intent = new Intent(this, WelcomeActivity.class);
        startActivity(intent);
    }
}

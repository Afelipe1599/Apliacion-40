package com.example.ejerciciosmas40;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ejerciciosmas40.models.ejercicio;
import com.google.android.material.navigation.NavigationView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import java.util.ArrayList;

public class ActivityVideoPlayer extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    Button yo;

    ArrayList<ejercicio> listaEjercicios;
    //RecyclerView recyclerejercicios;
    CardView cardViewejercicios;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_player);

        yo=findViewById(R.id.yo);

        yo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(ActivityVideoPlayer.this,ReportsActivity.class);
                startActivity(a);
            }
        }
        );



        listaEjercicios = new ArrayList<>();
      //  recyclerejercicios = (RecyclerView) findViewById(R.id.RecyclerId);
        //recyclerejercicios.setLayoutManager(new LinearLayoutManager(this));
        TextView etiNombre,etiDescripcion;
        YouTubePlayerView video;



        etiNombre = itemView.findViewById(R.id.nombreEjercicio);
        etiDescripcion = itemView.findViewById(R.id.descripcionEjercicio);
        video = (YouTubePlayerView) itemView.findViewById(R.id.videoplayer);

        llenarejercicios();

        //adaptadorVideos adapter = new adaptadorVideos(listaEjercicios);
        //recyclerejercicios.setAdapter(adapter);

    }

    private void llenarejercicios() {
        listaEjercicios.add(new ejercicio("60 minutos de Ejercicio Aeróbico para Adultos Mayores Activos (rutina completa)",
                "-QYqhmQj_ZI",
                "En este video te dejo una rutina de 60 minutos de ejercicio aeróbico para adultos mayores, esta rutina incluye calentamiento y estiramiento.",
                "BASICOS",
                "AEROBICOS"));
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();

        return true;
    }
}




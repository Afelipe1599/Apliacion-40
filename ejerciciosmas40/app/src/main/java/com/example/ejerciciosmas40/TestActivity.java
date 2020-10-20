package com.example.ejerciciosmas40;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ejerciciosmas40.models.Ejercicio;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerCallback;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import org.jetbrains.annotations.NotNull;
import com.example.ejerciciosmas40.util.resources;
import java.util.ArrayList;
import com.example.ejerciciosmas40.PersonaDAO;


public class TestActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    Persona persona;
    Button buttonReport, nextButton, previousButton,calendario;
    YouTubePlayerView youTubePlayerView;
    String categoria;
    Ejercicio[] ejercicios = resources.banco_ejercicios;
    TextView nameTextView, descriptionTextView, userNameTextView;
    ArrayList<Ejercicio> ejerciciosAerobicos = new ArrayList<>();
    ArrayList<Ejercicio> ejerciciosYoga = new ArrayList<>();
    ArrayList<Ejercicio> ejerciciosGenericos = new ArrayList<>();

    int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.nav_abierto, R.string.nav_cerrado);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //Funcion que llena los ArrayList con ejercicio categorizado
        sortExercises(ejercicios);

        //Funcion que setea el objeto persona de la bd
        getPersona();

        youTubePlayerView = findViewById(R.id.videoplayer);
        nameTextView = findViewById(R.id.nombreEjercicio);
        descriptionTextView = findViewById(R.id.descripcionEjercicio);
        userNameTextView = findViewById(R.id.nombre);
        userNameTextView.setText("Hola "+ persona.getNombre() + ", esta sera tu rutina de hoy");

        buttonReport = findViewById(R.id.yo);
        calendario = findViewById(R.id.calendario);

        calendario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CalendarioActivity.class);
                startActivity(intent);
            }
        });


        buttonReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ReportsActivity.class);
                startActivity(intent);
            }
        });

        nextButton = findViewById(R.id.siguiente);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               youTubePlayerView.getYouTubePlayerWhenReady(new YouTubePlayerCallback() {
                   @Override
                   public void onYouTubePlayer(@NotNull YouTubePlayer youTubePlayer) {
                       Log.d("INDEX", String.valueOf(index));
                       Log.d("ARRAY SIZE", String.valueOf(ejerciciosAerobicos.size()));
                      if(categoria.trim().equals("AEROBICOS")){
                          if(index < ejerciciosAerobicos.size()-1){
                              index++;
                              Ejercicio ejercicio = ejerciciosAerobicos.get(index);
                              nameTextView.setText(ejercicio.getNombre());
                              descriptionTextView.setText(ejercicio.getDescripcion());
                              youTubePlayer.loadVideo(ejercicio.getId(), 0);
                         }
                      }else if(categoria.trim().equals("YOGA")){
                          if(index < ejerciciosYoga.size()-1) {
                              index++;
                              Ejercicio ejercicio = ejerciciosYoga.get(index);
                              nameTextView.setText(ejercicio.getNombre());
                              descriptionTextView.setText(ejercicio.getDescripcion());
                              youTubePlayer.loadVideo(ejercicio.getId(), 0);
                          }
                      }else if(categoria.trim().equals("GENERICOS")){
                          if(index < ejerciciosGenericos.size()-1){
                              index++;
                              Ejercicio ejercicio = ejerciciosGenericos.get(index);
                              nameTextView.setText(ejercicio.getNombre());
                              descriptionTextView.setText(ejercicio.getDescripcion());
                              youTubePlayer.loadVideo(ejercicio.getId(), 0);
                          }
                      }
                   }
               });
            }
        });

        previousButton = findViewById(R.id.anterior);
        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youTubePlayerView.getYouTubePlayerWhenReady(new YouTubePlayerCallback() {
                    @Override
                    public void onYouTubePlayer(@NotNull YouTubePlayer youTubePlayer) {
                        Ejercicio ejercicio=null;
                        Log.d("INDEX", String.valueOf(index));
                        Log.d("ARRAY SIZE", String.valueOf(ejerciciosAerobicos.size()));
                        if(categoria.trim().equals("AEROBICOS")){
                            if(index > 0){
                                index--;
                                ejercicio = ejerciciosAerobicos.get(index);
                            }
                        }else if(categoria.trim().equals("YOGA")){
                            if(index > 0) {
                                index--;
                                ejercicio = ejerciciosYoga.get(index);
                            }
                        }else if(categoria.trim().equals("GENERICOS")){
                            if(index > 0){
                                index--;
                                ejercicio = ejerciciosGenericos.get(index);
                            }
                        }
                        if(ejercicio != null) {
                            nameTextView.setText(ejercicio.getNombre());
                            descriptionTextView.setText(ejercicio.getDescripcion());
                            youTubePlayer.loadVideo(ejercicio.getId(), 0);
                        }
                    }
                });
            }
        });


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();

        return true;
    }

    public void sortExercises(Ejercicio[] ejercicios){
        for(int i=0; i < ejercicios.length; i++){
            Ejercicio ejercicio = ejercicios[i];
            if(ejercicio.getCategoria()=="AEROBICOS"){
                ejerciciosAerobicos.add(ejercicio);
            }else if(ejercicio.getCategoria()=="YOGA"){
                ejerciciosYoga.add(ejercicio);
            }
        }
    }

    public void getPersona() {
        PersonaDAO personaDAO = new PersonaDAO(getApplicationContext());
        persona = personaDAO.getPersona();
        categoria = persona.getEj_deseado();

    }
}
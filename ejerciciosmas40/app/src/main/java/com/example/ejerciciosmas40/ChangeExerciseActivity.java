package com.example.ejerciciosmas40;

import androidx.appcompat.app.AppCompatActivity;
import com.example.ejerciciosmas40.PersonaDAO;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class ChangeExerciseActivity extends AppCompatActivity {
    Button changeButton;
    RadioButton yogaRadioButton, genericosRadioButton, aerobicosRadioButton;
    TextView textviewSelectedExercise;
    String selection;
    PersonaDAO personaDAO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_exercise);

        personaDAO = new PersonaDAO(getApplicationContext());

        yogaRadioButton = findViewById(R.id.cvRadioButtonYoga);
        genericosRadioButton = findViewById(R.id.cvRadioButtonGenericos);
        aerobicosRadioButton = findViewById(R.id.cvRadioButtonAerobicos);

        textviewSelectedExercise = findViewById(R.id.cvRadioButtonSelectionTextView);

        yogaRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selection = "YOGA";
                textviewSelectedExercise.setText("Ha seleccionado <b>Yoga</b>");

            }
        });

        genericosRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selection = "GENERICOS";
                textviewSelectedExercise.setText("Ha seleccionado <b>Genericos</b>");
            }
        });

        aerobicosRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selection = "AEROBICOS";
                textviewSelectedExercise.setText("Ha seleccionado <b>Aerobicos</b>");
            }
        });

        changeButton = findViewById(R.id.cvFinishButton);
        changeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                personaDAO.updatePersonaExercise(selection);
                finish();
            }
        });
    }
}
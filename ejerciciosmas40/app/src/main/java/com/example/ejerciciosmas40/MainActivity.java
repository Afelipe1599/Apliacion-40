package com.example.ejerciciosmas40;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentContainer;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Persona persona;
    PersonaDAO personaDAO;
    InformationFragment informationFragment;
    UserPersonalDataFragment userPersonalDataFragment;
    ExerciseFrequencyFragment exerciseFrequencyFragment;
    DificultyFragment dificultyFragment;
    FragmentTransaction fragmentTransaction;
    ExerciseCategoryFragment exerciseCategoryFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        personaDAO = new PersonaDAO(getApplicationContext());

        if(personaDAO.isPersonaRegistered()){
            Intent intent = new Intent(getApplicationContext(), TestActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }

        persona  = new Persona(1, 0, 0, 0, "", "", "", 0.0f, false);
        userPersonalDataFragment = new UserPersonalDataFragment();
        informationFragment = new InformationFragment();
        exerciseFrequencyFragment = new ExerciseFrequencyFragment();
        dificultyFragment = new DificultyFragment();
        exerciseFrequencyFragment = new ExerciseFrequencyFragment();
        exerciseCategoryFragment = new ExerciseCategoryFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainer, informationFragment).commit();
    }

    public void onClick(View view){
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        switch (view.getId()){
            case R.id.informationFragmentButton:
                fragmentTransaction.replace(R.id.fragmentContainer, userPersonalDataFragment);
                fragmentTransaction.addToBackStack(null);
                break;
            case R.id.userPersonalDataFragmentButton:
                fragmentTransaction.replace(R.id.fragmentContainer, exerciseFrequencyFragment);
                fragmentTransaction.addToBackStack(null);
                break;
            case R.id.exerciseFrequencyButton:
                fragmentTransaction.replace(R.id.fragmentContainer, dificultyFragment);
                fragmentTransaction.addToBackStack(null);
                break;
            case R.id.dificultyFragmentButton:
                fragmentTransaction.replace(R.id.fragmentContainer, exerciseCategoryFragment);
                fragmentTransaction.addToBackStack(null);
                break;
            case R.id.exerciseTypeButton:
                try {
                    long result = personaDAO.insertarPersona(persona);
                    Intent intent = new Intent(getApplicationContext(), TestActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "Usuario registrado "+ result, Toast.LENGTH_SHORT).show();
                }catch(Exception e){
                    Log.e("DATABASE EXCEPTION", e.toString());
                }
                break;
        }
        fragmentTransaction.commit();
    }
}

package com.example.ejerciciosmas40;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentContainer;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Persona persona;
    InformationFragment informationFragment;
    UserPersonalDataFragment userPersonalDataFragment;
    ExerciseFrequencyFragment exerciseFrequencyFragment;
    DificultyFragment dificultyFragment;
    FragmentTransaction fragmentTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        persona  = new Persona(1, 0, 0, 0, "", "", "", 0.0f, false);
        userPersonalDataFragment = new UserPersonalDataFragment();
        informationFragment = new InformationFragment();
        exerciseFrequencyFragment = new ExerciseFrequencyFragment();
        dificultyFragment = new DificultyFragment();
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
        }
        fragmentTransaction.commit();
    }
}

package com.example.ejerciciosmas40;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

import androidx.annotation.Nullable;

public class ExerciseFrequencyActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise_frecuency);
    }

    public void startNextActivity(View view){
        Bundle user_personal_data = getIntent().getExtras();
        Intent intent = new Intent(this, ExerciseTypeActivity.class);
        Spinner frequency_spinner = (Spinner)findViewById(R.id.frequency_spinner);
        String frequency = frequency_spinner.getSelectedItem().toString();

        intent.putExtra("frequency", frequency);
        intent.putExtra("user_data_bundle", user_personal_data);
        startActivity(intent);

    }

}

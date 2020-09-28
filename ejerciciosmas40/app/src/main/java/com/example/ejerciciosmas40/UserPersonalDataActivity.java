package com.example.ejerciciosmas40;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class UserPersonalDataActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_personal_data);
    }

    public void callExerciseFreqActivity(View view){
        Intent intent = new Intent(this, ExerciseFrequencyActivity.class);
        startActivity(intent);
    }
}

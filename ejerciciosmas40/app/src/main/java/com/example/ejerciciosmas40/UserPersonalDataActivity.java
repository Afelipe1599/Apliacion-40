package com.example.ejerciciosmas40;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.example.ejerciciosmas40.Persona;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

public class UserPersonalDataActivity extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_personal_data);
    }

    public void callExerciseFreqActivity(View view){
       /* Intent intent = new Intent(this, ExerciseFrequencyActivity.class);

        //Getting user data from this view
        //Name
        EditText name_input = (EditText)findViewById(R.id.user_name_input);
        String user_name = name_input.getText().toString();

        //Height
        EditText height_input = (EditText)findViewById(R.id.user_heigth_input);
        int user_height = Integer.parseInt(height_input.getText().toString());

        //Weight
        EditText weight_input = (EditText)findViewById(R.id.user_weight_input);
        float user_weight = Float.parseFloat(weight_input.getText().toString());

        //Age
        EditText age_input = (EditText)findViewById(R.id.user_age_input);
        int user_age = Integer.parseInt(age_input.getText().toString());

        intent.putExtra("user_name", user_name);
        intent.putExtra("user_height", user_height);
        intent.putExtra("user_weight", user_weight);
        intent.putExtra("user_age", user_age);

        startActivity(intent);*/
    }
}

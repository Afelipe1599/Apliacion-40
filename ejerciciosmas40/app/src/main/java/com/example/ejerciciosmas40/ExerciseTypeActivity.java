package com.example.ejerciciosmas40;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.ejerciciosmas40.Persona;
import com.example.ejerciciosmas40.PersonaDAO;
import androidx.annotation.Nullable;

public class ExerciseTypeActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise_type);
    }


    public void saveUserData(View view) {
    Bundle user_data = getIntent().getExtras();
    Bundle user_personal_data = user_data.getBundle("user_data_bundle");
    String frequency = user_data.getString("frequency");

    Spinner exercise_type_spinner = (Spinner)findViewById(R.id.exercise_type_spinner);
    String exercise_type = exercise_type_spinner.getSelectedItem().toString();

    Spinner exercise_dificulty_spinner = (Spinner)findViewById(R.id.exercise_type_spinner);
    String dificulty = exercise_dificulty_spinner.getSelectedItem().toString();

    CheckBox equipment_checkbox = (CheckBox)findViewById(R.id.equipment_checkbox);
    Boolean has_equipment = false;
    if (equipment_checkbox.isChecked()){
        has_equipment = true;
    }

    int user_height =user_personal_data.getInt("user_height");
    int user_age =  user_personal_data.getInt("user_age");
    String user_name = user_personal_data.getString("user_name");
    float user_weight = user_personal_data.getFloat("user_weight");

    Persona user = new Persona(1, user_height, 3, user_age, user_name, dificulty, exercise_type, user_weight, has_equipment);


    PersonaDAO personadao = new PersonaDAO(getApplicationContext());
    Toast toast = Toast.makeText(getApplicationContext(), "Result " + String.valueOf(personadao.insertarPersona(user)), Toast.LENGTH_LONG);
    toast.show();

    }
}

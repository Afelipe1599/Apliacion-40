package com.example.ejerciciosmas40;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ExerciseCategoryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ExerciseCategoryFragment extends Fragment {
    View view;
    RadioButton radioButtonYoga, radioButtonAerobicos, radioButtonGenericos;
    TextView textViewSeleccion;
    Button finishButton;
    MainActivity mainActivity;
    String tipoEjercicio;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ExerciseCategoryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ExerciseCategoryFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ExerciseCategoryFragment newInstance(String param1, String param2) {
        ExerciseCategoryFragment fragment = new ExerciseCategoryFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_exercise_category, container, false);
        radioButtonAerobicos = view.findViewById(R.id.radioButtonAerobicos);
        radioButtonGenericos = view.findViewById(R.id.radioButtonGenericos);
        radioButtonYoga = view.findViewById(R.id.radioButtonYoga);
        textViewSeleccion = view.findViewById(R.id.radioButtonSelectionTextView);
        finishButton = view.findViewById(R.id.exerciseTypeButton);
        mainActivity = (MainActivity)getActivity();


        radioButtonYoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewSeleccion.setText(R.string.yoga_str);
                tipoEjercicio = "Yoga";

            }
        });
        radioButtonAerobicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewSeleccion.setText(R.string.aerobicos_str);
                tipoEjercicio = "Aerobicos";
            }
        });

        radioButtonGenericos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewSeleccion.setText(R.string.genericos_str);
                tipoEjercicio = "Genericos";
            }
        });

        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivity.persona.setEj_deseado(tipoEjercicio);
                mainActivity.onClick(view);
            }
        });

        return view;
    }
}
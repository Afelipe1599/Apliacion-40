package com.example.ejerciciosmas40;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link UserPersonalDataFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class UserPersonalDataFragment extends Fragment {
    View view;
    Button button;
    EditText userNameEditText, userAgeEditText, userHeightEditText, userWeightEditText;
    ArrayList<EditText> editTexts = new ArrayList<>();
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public UserPersonalDataFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment UserPersonalDataFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static UserPersonalDataFragment newInstance(String param1, String param2) {
        UserPersonalDataFragment fragment = new UserPersonalDataFragment();
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
        view = inflater.inflate(R.layout.fragment_user_personal_data, container, false);
        userNameEditText = view.findViewById(R.id.editTextUserName);
        userAgeEditText = view.findViewById(R.id.editTextUserAge);
        userHeightEditText = view.findViewById(R.id.editTextUserHeight);
        userWeightEditText = view.findViewById(R.id.editTextUserWeight);
        button = view.findViewById(R.id.buttonNextupd);
        editTexts.add(userNameEditText);
        editTexts.add(userAgeEditText);
        editTexts.add(userHeightEditText);
        editTexts.add(userWeightEditText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isAnyEmpty = false;
                for(EditText editText : editTexts){
                    if(editText.getText().toString().isEmpty()){
                        isAnyEmpty = true;
                        editText.setError("Este campo es obligatorio");
                    }
                }

                if(!isAnyEmpty){
                    Intent intent = new Intent(getActivity(), ExerciseFrequencyActivity.class);
                    startActivity(intent);
                    Activity activity = getActivity();
                }
            }
        });

        return view;
    }
}
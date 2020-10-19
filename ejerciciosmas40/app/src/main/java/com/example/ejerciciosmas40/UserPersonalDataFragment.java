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
    boolean isAnyEmpty;
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_user_personal_data, container, false);



        userNameEditText = (EditText)view.findViewById(R.id.editTextUserName);
        userHeightEditText = (EditText)view.findViewById(R.id.editTextUserHeight);
        userWeightEditText = (EditText)view.findViewById(R.id.editTextUserWeight);
        userAgeEditText = (EditText)view.findViewById(R.id.editTextUserAge);

        editTexts.add((EditText)view.findViewById(R.id.editTextUserName));
        editTexts.add((EditText)view.findViewById(R.id.editTextUserHeight));
        editTexts.add((EditText)view.findViewById(R.id.editTextUserWeight));
        editTexts.add((EditText)view.findViewById(R.id.editTextUserAge));

        final MainActivity activity = (MainActivity)getActivity();

        Button userPersonalDataButton = view.findViewById(R.id.userPersonalDataFragmentButton);

        userPersonalDataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isAnyEmpty=false;
                for(EditText editText : editTexts){
                    if(editText.getText().toString().isEmpty()){
                        editText.setError("Este campo es obligatorio");
                        isAnyEmpty = true;
                    }
                }
                if(!isAnyEmpty){
                    activity.persona.setNombre(userNameEditText.getText().toString());
                    activity.persona.setEdad(Integer.parseInt(userAgeEditText.getText().toString()));
                    activity.persona.setAltura(Integer.parseInt(userHeightEditText.getText().toString()));
                    activity.persona.setPeso(Float.parseFloat(userWeightEditText.getText().toString()));
                    Toast.makeText(getActivity().getApplicationContext(), "Datos registrados", Toast.LENGTH_SHORT).show();
                    activity.onClick(view);
                }
            }
        });
        return view;
    }
}
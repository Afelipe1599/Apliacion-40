package com.example.ejerciciosmas40;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

public class WelcomeActivity extends FragmentActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_activity);
        View welcomeFragment = (View)findViewById(R.id.welcome_fragment);
        TextView fragmentTitle = (TextView) welcomeFragment.findViewById(R.id.titleTextView);
        fragmentTitle.setText(R.string.welcome_title);
        TextView fragmentDescription = (TextView)findViewById(R.id.messageTextView);
        fragmentDescription.setText(R.string.welcome_msg);
    }


    public void callUserDataActivity(View view){
        Intent intent = new Intent(this, UserPersonalDataActivity.class);
        startActivity(intent); 
    }
}

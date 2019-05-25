package com.example.taller32;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.taller32.Fragments.FormFragment;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_form);// cancel the view activity. Calling fragment

        getSupportFragmentManager().beginTransaction().add(android.R.id.content,new FormFragment()).commit();
    }
}

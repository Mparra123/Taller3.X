package com.example.taller32;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.taller32.Fragments.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main); // we are going to the fragment

        getSupportFragmentManager().beginTransaction().add(android.R.id.content, new MainFragment()).commit();
    }
}

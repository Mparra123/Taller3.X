package com.example.taller32.Fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.taller32.FormActivity;
import com.example.taller32.R;


public class MainFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_main,container,false);

        setupUI(view);

        return view;


    }

    private void setupUI(View view) {

        Button btnNext = (Button)view.findViewById(R.id.btnNewFragment);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //button to send to the second activity

                Intent intent = new Intent(getContext(), FormActivity.class); // will go to the other form
                getActivity().startActivity(intent);// start activity
                //getActivity().finish(); // if i gon back the activity is close
            }
        });
    }
}

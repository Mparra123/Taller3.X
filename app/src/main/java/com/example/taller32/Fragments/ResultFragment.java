package com.example.taller32.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.taller32.Model.Persona;
import com.example.taller32.R;


public class ResultFragment extends Fragment {

    public ResultFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private void SetUpUI(View view) {

        //setear lo que viene en los campos correspondientes

        Bundle bundle = getArguments();
        Persona obj= (Persona) bundle.getSerializable("Persona");

        final EditText ftxtNameResult = (EditText)view.findViewById(R.id.txtNameResult);
        final EditText ftxtLastNameResult = (EditText)view.findViewById(R.id.txtLastNameResult);
        final EditText ftxtPhoneResult = (EditText)view.findViewById(R.id.txtPhoneResult);
        final EditText ftxtEmailResult = (EditText)view.findViewById(R.id.txtEmailResult);

        ftxtNameResult.setText(obj.getNombre());
        ftxtLastNameResult.setText(obj.getApellido());
        ftxtPhoneResult.setText(obj.getTeléfono());
        ftxtEmailResult.setText(obj.getCorreo());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_result,container,false);
        SetUpUI(view);

        return view;
    }
}

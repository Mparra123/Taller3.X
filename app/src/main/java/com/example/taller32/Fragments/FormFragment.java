package com.example.taller32.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.Person;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.taller32.Model.Persona;
import com.example.taller32.R;


public class FormFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public FormFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_form,container,false);
        SetUpUI(view);

        return view;

    }

    private void SetUpUI(View view) {

        Button fbtnNext = (Button)view.findViewById(R.id.btnSubmitFrag);
        final EditText ftxtName = (EditText)view.findViewById(R.id.txtNameFrag);
        final EditText ftxtLastName = (EditText)view.findViewById(R.id.txtLastNameFrag);
        final EditText ftxtPhone = (EditText)view.findViewById(R.id.txtPhoneFrag);
        final EditText ftxtEmail = (EditText)view.findViewById(R.id.txtEmailFrag);

        fbtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Will submit the values to the other form.


                //Getting the data from UI
                String name = ftxtName.getText().toString();
                String Lastname = ftxtLastName.getText().toString();
                String phone = ftxtPhone.getText().toString();
                String email = ftxtEmail.getText().toString();

                //Creating an Object
                Persona P = new Persona(name,Lastname,phone,email);

                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ResultFragment fragment2 = new ResultFragment();
                Bundle bundle = new Bundle();
                bundle.putSerializable("Persona", P);
               fragment2.setArguments(bundle);
                ft.replace(android.R.id.content, fragment2);
                ft.addToBackStack(null); //Add fragment in back stack
                ft.commit();

            }
        });

    }
}

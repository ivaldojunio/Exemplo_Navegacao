package com.example.exemplonavegacao.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.exemplonavegacao.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentA#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentA extends Fragment {


    public FragmentA() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static FragmentA newInstance(String param1, String param2) {
        FragmentA fragment = new FragmentA();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        Button button = view.findViewById(R.id.buttonFragmentAMenssagem);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
           public void onClick(View v) {
               Toast.makeText(getContext(),"SEJA BEM VINDO...",
               Toast.LENGTH_LONG).show();
           }
       });
        return  view;
    }
}
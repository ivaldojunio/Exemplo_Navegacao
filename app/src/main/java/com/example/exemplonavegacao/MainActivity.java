package com.example.exemplonavegacao;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.exemplonavegacao.ui.FragmentA;
import com.example.exemplonavegacao.ui.FragmentB;

public class MainActivity extends AppCompatActivity {

    private Button buttonFragmentA;
    private Button buttonFragmentB;
    private Button buttonFragmentC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentA fragmentA = new FragmentA();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fragment_container,fragmentA);
        transaction.commit();

        clickButton();
    }
    private void clickButton(){
        buttonFragmentA= findViewById(R.id.buttonA);
        buttonFragmentB= findViewById(R.id.buttonB);
        buttonFragmentC= findViewById(R.id.buttonC);

        buttonFragmentA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentA fragmentA = new FragmentA();
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment,fragmentA);
                transaction.commit();

            }
        });
        buttonFragmentB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentB fragmentB = new FragmentB();
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.add(R.id.fragment,fragmentB);
                transaction.commit();

            }
        });
        buttonFragmentC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment_C fragmentC = new Fragment_C();
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.add(R.id.fragment, fragmentC);
                transaction.commit();
            }
        });
    }
}

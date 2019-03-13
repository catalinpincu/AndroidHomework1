package com.example.tema1;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        F1A2 f1a2=new F1A2();
        /*FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container,f1a2,"f1a2");
        fragmentTransaction.commit();*/
        getSupportFragmentManager().beginTransaction().add(R.id.container,f1a2,"f1a2").commit();

    }
}

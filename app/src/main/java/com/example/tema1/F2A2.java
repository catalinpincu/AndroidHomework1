package com.example.tema1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class F2A2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_f2_a2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button btn1=view.findViewById(R.id.buton1_f2a2);
        Button btn2=view.findViewById(R.id.buton2_f2a2);
        Button btn3=view.findViewById(R.id.buton3_f2a2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* FragmentManager fragmentManager= getFragmentManager();
                Fragment f3a2=new F3A2();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container,f3a2,"f3a2");
                fragmentTransaction.commit();*/
                getFragmentManager().beginTransaction().replace(R.id.container,new F3A2(),"f3a2").commit();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getFragmentManager();
                Fragment f1a2=fragmentManager.findFragmentByTag("f1a2");
                if (f1a2!=null)
                {
                    FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                    fragmentTransaction.remove(f1a2);
                    fragmentTransaction.commit();
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getActivity()!=null)
                getActivity().finish();
            }
        });
    }
}

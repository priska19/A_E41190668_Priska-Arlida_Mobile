package com.example.tugasfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnFragment1;
    private Button btnFragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFragment1= findViewById(R.id.btn_page1);
        btnFragment2= findViewById(R.id.btn_page2);

        btnFragment1.setOnClickListener(v -> loadFragment(new FirstFragment()));
        btnFragment2.setOnClickListener(v -> loadFragment(new SecondFragment()));

    }

    private  void loadFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        if(fragment != null){
            transaction.replace(R.id.frame_layout, fragment);
            transaction.commit();
        }
    }
}
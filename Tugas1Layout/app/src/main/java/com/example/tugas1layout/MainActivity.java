package com.example.tugas1layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText Pada, Subject, Pesan;
    Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //setContentView(R.layout.relative_layout);
        //setContentView(R.layout.constraint_layout);
        //setContentView(R.layout.frame_layout);
        //setContentView(R.layout.table_layout);
        //setContentView(R.layout.material_design);
        //setContentView(R.layout.scrollview);
        //setContentView(R.layout.scrollviewhorizontal);
        setContentView(R.layout.latihan);

        Pada = findViewById(R.id.pada);
        Subject = findViewById(R.id.subject);
        Submit = findViewById(R.id.submit);
    }
}


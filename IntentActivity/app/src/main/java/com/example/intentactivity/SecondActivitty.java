package com.example.intentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivitty extends AppCompatActivity {
    TextView txtUser;
    private String nama;
    private String KEY_NAMA =  "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activitty);

        txtUser = (TextView) findViewById(R.id.txtHello);

        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAMA);
        txtUser.setText("Hello," + nama +"!");
    }
}
package com.example.intentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSubmit, btnDone;
    EditText editUrl, editName;

    private String KEY_NAME= "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit = findViewById(R.id.btnSubmit);
        editUrl = findViewById(R.id.editUrl);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = editUrl.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        editName= findViewById(R.id.editName);
        btnDone= findViewById(R.id.btndone);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String nama = editName.getText().toString();
                    if(nama != ""){
                        Intent i = new Intent(MainActivity.this, SecondActivitty.class);
                        i.putExtra(KEY_NAME, nama);
                        startActivity(i);
                    } else {
                        Toast.makeText(getApplication(), "Fill your Name", Toast.LENGTH_SHORT);
                    }
                } catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplication(),"Error, try again", Toast.LENGTH_SHORT);
                }
            }
        });
    }
}
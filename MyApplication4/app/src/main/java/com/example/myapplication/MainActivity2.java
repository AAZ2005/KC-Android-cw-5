package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

            TextView nam = findViewById(R.id.thname);
            TextView ag = findViewById(R.id.thage);
            Bundle b = getIntent().getExtras();
            String name = b.getString("name");
            nam.setText(name);
            int age = b.getInt("age");
            ag.setText(String.valueOf(age));


        }



    }
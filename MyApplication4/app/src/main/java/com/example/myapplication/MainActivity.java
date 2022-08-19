package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = findViewById(R.id.name);
        EditText age = findViewById(R.id.age);

        Button bu = findViewById(R.id.button);
        bu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

               String nam = name.getText().toString();
               Integer ag = Integer.parseInt(age.getText().toString());

                Intent ine = new Intent(MainActivity.this, MainActivity2.class);
                ine.putExtra("name",nam);
                ine.putExtra("age",ag);
                startActivity(ine);
            }
        });
    }
    }
package com.example.madassessment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Lesson3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson3);

        if(savedInstanceState == null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragmentContainer,
                            new FragmentA())
                    .commit();
        }
    }
}
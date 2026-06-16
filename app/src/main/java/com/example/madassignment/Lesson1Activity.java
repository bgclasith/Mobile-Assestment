package com.example.madassessment;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Lesson1Activity extends AppCompatActivity {

    EditText edtMessage;
    Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson1);

        edtMessage = findViewById(R.id.edtMessage);
        btnShow = findViewById(R.id.btnShow);

        btnShow.setOnClickListener(v -> {

            String msg = edtMessage.getText().toString();

            Toast.makeText(
                    Lesson1Activity.this,
                    msg,
                    Toast.LENGTH_SHORT
            ).show();
        });
    }
}
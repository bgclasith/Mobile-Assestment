package com.example.madassessment;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Lesson2Activity extends AppCompatActivity {

    EditText edtName, edtEmail, edtMobile;
    Button btnSubmit, btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson2);

        edtName = findViewById(R.id.edtName);
        edtEmail = findViewById(R.id.edtEmail);
        edtMobile = findViewById(R.id.edtMobile);

        btnSubmit = findViewById(R.id.btnSubmit);
        btnClear = findViewById(R.id.btnClear);

        btnSubmit.setOnClickListener(v -> {

            String name = edtName.getText().toString();
            String email = edtEmail.getText().toString();
            String mobile = edtMobile.getText().toString();

            if(name.isEmpty()){
                edtName.setError("Required");
                return;
            }

            if(email.isEmpty()){
                edtEmail.setError("Required");
                return;
            }

            if(mobile.isEmpty()){
                edtMobile.setError("Required");
                return;
            }

            Intent intent =
                    new Intent(this, DisplayDataActivity.class);

            intent.putExtra("name", name);
            intent.putExtra("email", email);
            intent.putExtra("mobile", mobile);

            startActivity(intent);
        });

        btnClear.setOnClickListener(v -> {
            edtName.setText("");
            edtEmail.setText("");
            edtMobile.setText("");
        });
    }
}
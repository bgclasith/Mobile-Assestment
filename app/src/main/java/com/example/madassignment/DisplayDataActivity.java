package com.example.madassessment;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_data);

        TextView tvData = findViewById(R.id.tvData);

        String name = getIntent().getStringExtra("name");
        String email = getIntent().getStringExtra("email");
        String mobile = getIntent().getStringExtra("mobile");

        tvData.setText(
                "Name : " + name +
                        "\nEmail : " + email +
                        "\nMobile : " + mobile
        );
    }
}
package com.example.instagramactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button layoutActivityBtn= findViewById(R.id.layoutActivityBtn);
        Button ButtonsActivityBtn = findViewById(R.id.buttonsActivityBtn);

        layoutActivityBtn.setOnClickListener(view -> {
            Intent openLayoutActivity = new Intent(MainActivity.this, LayoutExercise.class);
            startActivity(openLayoutActivity);
        });

        ButtonsActivityBtn.setOnClickListener(view -> {
            Intent openButtonsActivity = new Intent(MainActivity.this, ButtonActivity.class);
            startActivity(openButtonsActivity);
        });
    }
}
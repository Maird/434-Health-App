package com.example.a434_health_app;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;


public class Profile_Activity extends AppCompatActivity {

    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                finish();
                }
        });
    }
}
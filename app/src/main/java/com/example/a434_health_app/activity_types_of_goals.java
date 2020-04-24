package com.example.a434_health_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class activity_types_of_goals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_types_of_goals);




        Button addGoalsButton = findViewById(R.id.mental_goal);

        addGoalsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                startActivity(new Intent(getApplicationContext(), Mental_Goal.class));
            }
        });
    }



}

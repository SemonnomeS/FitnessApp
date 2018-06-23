package com.example.zen.fitnessapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class ListExercises extends MainActivity {

    CardView cd1,cd2,cd3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_exercises);
        cd1=(CardView)findViewById(R.id.cd1);
        cd2=(CardView)findViewById(R.id.cd2);
        cd3=(CardView)findViewById(R.id.cd3);

        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListExercises.this,UpperBody.class);
                startActivity(intent);
            }
        });
        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListExercises.this,LowerBody.class);
                startActivity(intent);
            }
        });
        cd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListExercises.this,Cardio.class);
                startActivity(intent);
            }
        });



    }
}

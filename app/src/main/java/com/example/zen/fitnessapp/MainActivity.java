
package com.example.zen.fitnessapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button ListExercisesBtn,Setting,Note;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListExercisesBtn = (Button)findViewById(R.id.btnExercises);
        ListExercisesBtn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent intent = new Intent(MainActivity.this,ListExercises.class);
                                                startActivity(intent);
                                            }
                                        }


        );

        Setting = (Button)findViewById(R.id.btnSetting);
        Setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Map.class);
                startActivity(intent);
            }
        });

     Note = (Button)findViewById(R.id.Note);
     Note.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent = new Intent(MainActivity.this,Note.class);
             startActivity(intent);

         }
     });
    }


}

package com.example.pets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityCacatua extends AppCompatActivity {

    private Button btnVoltar;

    private Button btnQuis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cacatua);

        btnVoltar = findViewById(R.id.btnVoltar);
        btnQuis = findViewById(R.id.btnQuestionario);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityCacatua.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnQuis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityCacatua.this, ActivityQuizCacatua.class);
                startActivity(intent);
            }
        });


    }
}
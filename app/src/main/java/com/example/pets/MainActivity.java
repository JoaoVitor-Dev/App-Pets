package com.example.pets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imgCacatua;
    private ImageView imgGato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgCacatua = findViewById(R.id.imgcacatua);
        imgGato =findViewById(R.id.imgGato);

        imgCacatua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityCacatua.class);
                startActivity(intent);
            }
        });

        imgGato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityGato.class);
                startActivity(intent);
            }
        });


    }
}
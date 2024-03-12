package com.example.pets;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityAcertou extends AppCompatActivity {

    private TextView textViewAcertos;
    private Button btnMenu;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acertou);

        textViewAcertos = findViewById(R.id.textViewAcertos);
        btnMenu = findViewById(R.id.btnMenu);

        Intent it = getIntent();
        if (it != null){
            int acertos = it.getIntExtra("acertos", 0);
            textViewAcertos.setText(String.valueOf(acertos) + " %");
        }

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(ActivityAcertou.this, MainActivity.class);
                startActivity(it);
            }
        });
    }
}
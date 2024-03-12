package com.example.pets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class ActivityQuizGato extends AppCompatActivity {

    private Button btnEnviar;

    private RadioButton q1Opt2;
    private RadioButton q2Opt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_gato);

        btnEnviar = findViewById(R.id.btnEnviar);
        q1Opt2 = findViewById(R.id.Q1opt2);
        q2Opt2 = findViewById(R.id.Q2opt2);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onQuiz(v);
            }
        });
    }
    private void onQuiz(View v){
        int acertos = 0;

        if (q1Opt2.isChecked()){
            acertos = acertos + 1;
        }

        if (q2Opt2.isChecked()){
            acertos = acertos + 1;
        }

        if (acertos < 1){
            Intent it = new Intent(ActivityQuizGato.this, ActivityErrou.class);
            startActivity(it);
        } else if (acertos == 1){
            Intent it = new Intent(ActivityQuizGato.this, ActivityAcertou.class);
            it.putExtra("acertos", 50);
            startActivity(it);
        } else {
            Intent it = new Intent(ActivityQuizGato.this, ActivityAcertou.class);
            it.putExtra("acertos", 100);
            startActivity(it);
        }
    }
}
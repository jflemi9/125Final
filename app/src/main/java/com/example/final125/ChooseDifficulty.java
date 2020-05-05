package com.example.final125;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChooseDifficulty extends AppCompatActivity {

    //THIS CORRESPONDS TO start2_choose_difficulty.png

    private Button easy;
    private Button medium;
    private Button hard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_difficulty);

        easy = findViewById(R.id.goEasy);
        medium = findViewById(R.id.goMedium);
        hard = findViewById(R.id.goHard);

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayerInfo.easyMode();
                startGame();
            }
        });

        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayerInfo.mediumMode();
                startGame();
            }
        });

        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayerInfo.hardMode();
                startGame();
            }
        });
    }

    public void startGame() {
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }

}

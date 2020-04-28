package com.example.final125;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NorthTwoSucceed extends AppCompatActivity {
    private Button home;
    private Button proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north_two_succeed);

        home = findViewById(R.id.backHome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PlayerInfo.movement()) {
                    returnHome();
                } else {
                    gameOver();
                }
            }
        });

        proceed = findViewById(R.id.proceed);
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PlayerInfo.movement()) {
                    advanceSucceed();
                } else {
                    gameOver();
                }
            }
        });
    }
    public void returnHome() {
        Intent intent = new Intent(this, homePage.class);
        startActivity(intent);
    }
    public void advanceSucceed() {
        Intent intent = new Intent(this, NorthThree.class);
        startActivity(intent);
    }
    public void gameOver() {
        Intent intent = new Intent(this, GameOver.class);
        startActivity(intent);
    }
}
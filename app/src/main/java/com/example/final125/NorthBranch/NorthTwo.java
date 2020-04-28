package com.example.final125.NorthBranch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.final125.GameOver;
import com.example.final125.PlayerInfo;
import com.example.final125.R;
import com.example.final125.homePage;

public class NorthTwo extends AppCompatActivity {
    private Button home;
    private Button proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north_two);

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
                if (PlayerInfo.checkItemThree()) {
                    if (PlayerInfo.movement()) {
                        advanceSuccess();
                    } else {
                        gameOver();
                    }
                } else {
                    if (PlayerInfo.movement()) {
                        advanceFail();
                    } else {
                        gameOver();
                    }
                }
            }
        });
    }

    public void advanceSuccess() {
        Intent intent = new Intent(this, NorthThreeSucceed.class);
        startActivity(intent);
    }
    public void advanceFail() {
        Intent intent = new Intent(this, NorthThreeFail.class);
        startActivity(intent);
    }
    public void returnHome() {
        Intent intent = new Intent(this, homePage.class);
        startActivity(intent);
    }
    public void gameOver() {
        Intent intent = new Intent(this, GameOver.class);
        startActivity(intent);
    }
}

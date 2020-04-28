package com.example.final125;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FinalBossPhase3 extends AppCompatActivity {

    private Button proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_boss_phase3);
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
        Intent intent = new Intent(this, FinalBossPhase4.class);
        startActivity(intent);
    }

    public void advanceFail() {
        Intent intent = new Intent(this, FinalBossFailedPhase3.class);
        startActivity(intent);
    }

    public void gameOver() {
        Intent intent = new Intent(this, GameOver.class);
        startActivity(intent);
    }
}

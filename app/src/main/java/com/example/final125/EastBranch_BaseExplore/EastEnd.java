package com.example.final125.EastBranch_BaseExplore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.final125.GameOver;
import com.example.final125.PlayerInfo;
import com.example.final125.R;
import com.example.final125.HomePage;

public class EastEnd extends AppCompatActivity {
    private Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_east_end);

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
    }
    public void returnHome() {
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }
    public void gameOver() {
        Intent intent = new Intent(this, GameOver.class);
        startActivity(intent);
    }
}

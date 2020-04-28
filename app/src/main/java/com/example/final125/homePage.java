package com.example.final125;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.final125.EastBranch.EastOne;
import com.example.final125.NorthBranch.NorthOne;
import com.example.final125.SouthBranch.SouthOne;
import com.example.final125.WestBranch.WestOne;

public class homePage extends AppCompatActivity {
    private Button north;
    private Button south;
    private Button east;
    private Button west;
    private TextView oxygenPercentage;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        if (PlayerInfo.checkOxygenPercentage() == -1000) {
            final PlayerInfo player = new PlayerInfo();
        }

        oxygenPercentage = findViewById(R.id.oxygenLevel);
        oxygenPercentage.setText(PlayerInfo.checkOxygenPercentage() + "");

        north = findViewById(R.id.goNorth);
        south = findViewById(R.id.goSouth);
        east = findViewById(R.id.goEast);
        west = findViewById(R.id.goWest);

        north.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PlayerInfo.movement()) {
                    advanceNorth();
                } else {
                    gameOver();
                }
            }
        });

        south.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PlayerInfo.movement()) {
                    advanceSouth();
                } else {
                    gameOver();
                }
            }
        });

        east.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PlayerInfo.movement()) {
                    advanceEast();
                } else {
                    gameOver();
                }
            }
        });

        west.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PlayerInfo.movement()) {
                    advanceWest();
                } else {
                    gameOver();
                }
            }
        });
    }
    public void advanceNorth() {
        Intent intent = new Intent(this, NorthOne.class);
        startActivity(intent);
    }
    public void advanceSouth() {
        Intent intent = new Intent(this, SouthOne.class);
        startActivity(intent);
    }
    public void advanceEast() {
        Intent intent = new Intent(this, EastOne.class);
        startActivity(intent);
    }
    public void advanceWest() {
        Intent intent = new Intent(this, WestOne.class);
        startActivity(intent);
    }
    public void gameOver() {
        Intent intent = new Intent(this, GameOver.class);
        startActivity(intent);
    }
}

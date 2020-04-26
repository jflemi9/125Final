package com.example.final125;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class homePage extends AppCompatActivity {
    private Button north;
    private Button south;
    private Button east;
    private Button west;
    private TextView oxygenPercentage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        oxygenPercentage = findViewById(R.id.oxygenLevel);
        oxygenPercentage.setText(PlayerInfo.checkOxygenPercentage());

        north = findViewById(R.id.goNorth);
        south = findViewById(R.id.goSouth);
        east = findViewById(R.id.goEast);
        west = findViewById(R.id.goWest);

        north.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                advanceNorth();
            }
        });

        south.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                advanceSouth();
            }
        });

        east.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                advanceEast();
            }
        });

        west.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                advanceWest();
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
}

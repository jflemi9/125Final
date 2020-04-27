package com.example.final125;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NorthOne extends AppCompatActivity {
    private Button home;
    private Button proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north_one);

        PlayerInfo.obtainedItemOne();

        home = findViewById(R.id.backHome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnHome();
            }
        });

        proceed = findViewById(R.id.proceed);
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayerInfo.movement();
                advanceSuccess();
            }
        });
    }

    public void advanceSuccess() {
        Intent intent = new Intent(this, NorthTwo.class);
        startActivity(intent);
    }

    public void returnHome() {
        Intent intent = new Intent(this, homePage.class);
        startActivity(intent);
    }
}

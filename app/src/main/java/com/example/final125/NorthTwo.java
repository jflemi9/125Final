package com.example.final125;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
                returnHome();
            }
        });

        proceed = findViewById(R.id.proceed);
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PlayerInfo.checkItemThree()) {
                    PlayerInfo.movement();
                    advanceSuccess();
                } else {
                    PlayerInfo.movement();
                    advanceFail();
                }
            }
        });
    }
    public void returnHome() {
        Intent intent = new Intent(this, homePage.class);
        startActivity(intent);
    }
    public void advanceSuccess() {
        Intent intent = new Intent(this, NorthThreeSucceed.class);
        startActivity(intent);
    }
    public void advanceFail() {
        Intent intent = new Intent(this, NorthThreeFail.class);
        startActivity(intent);
    }
    //Intent passed = new Intent(this, NorthThree);
}

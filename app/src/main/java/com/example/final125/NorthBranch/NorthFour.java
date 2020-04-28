package com.example.final125.NorthBranch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.final125.PlayerInfo;
import com.example.final125.R;
import com.example.final125.homePage;

public class NorthFour extends AppCompatActivity {
    private Button home;
    private Button proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north_four);

        PlayerInfo.obtainedItemFour();

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
                advanceSuccess();
            }
        });
    }

    public void returnHome() {
        Intent intent = new Intent(this, homePage.class);
        startActivity(intent);
    }
    public void advanceSuccess() {
        Intent intent = new Intent(this, NorthEnd.class);
        startActivity(intent);
    }
}

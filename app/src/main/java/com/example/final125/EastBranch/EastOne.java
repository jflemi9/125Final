package com.example.final125.EastBranch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.final125.R;
import com.example.final125.homePage;

public class EastOne extends AppCompatActivity {
    private Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_east_one);

        home = findViewById(R.id.backHome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnHome();
            }
        });
    }
    public void returnHome() {
        Intent intent = new Intent(this, homePage.class);
        startActivity(intent);
    }
}

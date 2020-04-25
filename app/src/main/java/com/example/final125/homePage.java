package com.example.final125;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homePage extends AppCompatActivity {
    private Button room1;
    private Button room2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        room1 = findViewById(R.id.room1);
        room2 = findViewById(R.id.room2);

        room1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enterRoom1();
            }
        });

        room2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enterRoom2();
            }
        });
    }

    public void enterRoom1() {
        Intent intent = new Intent(this, room1.class);
        startActivity(intent);
    }

    public void enterRoom2() {
        Intent intent = new Intent(this, room2.class);
        startActivity(intent);
    }
}

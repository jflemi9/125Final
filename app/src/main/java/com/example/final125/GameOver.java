package com.example.final125;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameOver extends AppCompatActivity {

    private Button startPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        startPage = findViewById(R.id.startPage);
        startPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToStartPage();
            }
        });
    }

    public void backToStartPage() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

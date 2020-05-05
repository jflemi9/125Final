package com.example.final125;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EndGame extends AppCompatActivity {

    // THIS CORRESPONDS TO final_boss_win_endgame1.png

    private Button nextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_game);
        nextPage = findViewById(R.id.nextPage);
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toEndGame2();
            }
        });
    }

    public void toEndGame2() {
        Intent intent = new Intent(this, EndGame2.class);
        startActivity(intent);
    }
}

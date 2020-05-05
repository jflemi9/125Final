package com.example.final125;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EndGame3 extends AppCompatActivity {

    // THIS CORRESPONDS TO END_GAME3.png

    private Button nextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_game3);
        nextPage = findViewById(R.id.nextPage);
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayerInfo.resetOxygenPercentage();
                toStart();
            }
        });
    }

    public void toStart() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

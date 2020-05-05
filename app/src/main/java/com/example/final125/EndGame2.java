package com.example.final125;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EndGame2 extends AppCompatActivity {
    private Button nextPage;

    // THIS CORRESPONDS TO LAUNCHZONE_ENDLAUNCH(ENDGAME2).png

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_game2);

        nextPage = findViewById(R.id.nextPage);
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toEndGame3();
            }
        });
    }

    public void toEndGame3() {
        Intent intent = new Intent(this, EndGame3.class);
        startActivity(intent);
    }
}
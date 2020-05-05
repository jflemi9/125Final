package com.example.final125.EastBranch_BaseExplore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.final125.GameOver;
import com.example.final125.PlayerInfo;
import com.example.final125.R;
import com.example.final125.HomePage;

public class EastThree extends AppCompatActivity {
    private Button home;
    private Button proceed;
    private void hideSystemUI() {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        // Set the content to appear under the system bars so that the
                        // content doesn't resize when the system bars hide and show.
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_east_three);
        hideSystemUI();

        TextView one = findViewById(R.id.textView1);
        TextView two = findViewById(R.id.textView2);

        one.setVisibility(View.VISIBLE);
        two.setVisibility(View.INVISIBLE);

        if (PlayerInfo.checkItemTwo()) {
            one.setVisibility(View.INVISIBLE);
            two.setVisibility(View.VISIBLE);
        } else {
            one.setVisibility(View.VISIBLE);
            two.setVisibility(View.INVISIBLE);
        }


        PlayerInfo.obtainedItemThree();

        home = findViewById(R.id.backHome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PlayerInfo.movement()) {
                    returnHome();
                } else {
                    gameOver();
                }
            }
        });

        proceed = findViewById(R.id.proceed);
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PlayerInfo.movement()) {
                    advanceSuccess();
                } else {
                    gameOver();
                }
            }
        });
    }
    public void returnHome() {
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }
    public void advanceSuccess() {
        Intent intent = new Intent(this, EastFour.class);
        startActivity(intent);
    }
    public void gameOver() {
        Intent intent = new Intent(this, GameOver.class);
        startActivity(intent);
    }
}

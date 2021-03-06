package com.example.final125.WestBranch_VillageExplore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.final125.EastBranch_BaseExplore.EastOne;
import com.example.final125.GameOver;
import com.example.final125.PlayerInfo;
import com.example.final125.R;
import com.example.final125.HomePage;

public class WestOne extends AppCompatActivity {
    private Button home;
    private Button proceed;

    public static MediaPlayer villagetheme;

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
        setContentView(R.layout.activity_west_one);
        hideSystemUI();
        villagetheme = MediaPlayer.create(WestOne.this, R.raw.villagetheme);
        villagetheme.start();

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
                if (PlayerInfo.checkItemOne()) {
                    if (PlayerInfo.movement()) {
                        advanceSuccess();
                    } else {
                        gameOver();
                    }
                } else {
                    if (PlayerInfo.movement()) {
                        advanceFail();
                    } else {
                        gameOver();
                    }
                }
            }
        });
    }

    public void advanceSuccess() {
        Intent intent = new Intent(this, WestTwoSucceed.class);
        startActivity(intent);
    }
    public void advanceFail() {
        Intent intent = new Intent(this, WestTwoFail.class);
        startActivity(intent);
    }
    public void returnHome() {
        Intent intent = new Intent(this, HomePage.class);
        WestOne.villagetheme.release();
        startActivity(intent);
    }
    public void gameOver() {
        Intent intent = new Intent(this, GameOver.class);
        WestOne.villagetheme.release();
        startActivity(intent);
    }
}

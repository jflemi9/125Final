package com.example.final125;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.final125.EastBranch_BaseExplore.EastOne;
import com.example.final125.NorthBranch_CaveExplore.NorthOne;
import com.example.final125.SouthBranch_FinalBoss.SouthOne;
import com.example.final125.WestBranch_VillageExplore.WestOne;

public class HomePage extends AppCompatActivity {
    private Button north;
    private Button south;
    private Button east;
    private Button west;
    private TextView oxygenPercentage;
    private ImageView launch1;
    private ImageView launch2;
    private ImageView launch3;
    private ImageView launch4;
    private MediaPlayer homeTheme;

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

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        hideSystemUI();

        homeTheme = MediaPlayer.create(HomePage.this, R.raw.hometheme);
        homeTheme.start();

        if (PlayerInfo.checkOxygenPercentage() == -1000) {
            final PlayerInfo player = new PlayerInfo();
        }

        launch1 = findViewById(R.id.launchOne);
        launch2 = findViewById(R.id.launchTwo);
        launch3 = findViewById(R.id.launchThree);
        launch4 = findViewById(R.id.launchFour);

        if (PlayerInfo.checkPartThree() && PlayerInfo.checkPartTwo()) {
            launch1.setVisibility(View.INVISIBLE);
            launch2.setVisibility(View.INVISIBLE);
            launch3.setVisibility(View.INVISIBLE);
            launch4.setVisibility(View.VISIBLE);
        } else if (PlayerInfo.checkPartThree() || PlayerInfo.checkPartTwo()) {
            launch1.setVisibility(View.INVISIBLE);
            launch2.setVisibility(View.INVISIBLE);
            launch3.setVisibility(View.VISIBLE);
            launch4.setVisibility(View.INVISIBLE);
        } else if (PlayerInfo.checkPartOne()) {
            launch1.setVisibility(View.INVISIBLE);
            launch2.setVisibility(View.VISIBLE);
            launch3.setVisibility(View.INVISIBLE);
            launch4.setVisibility(View.INVISIBLE);
        } else {
            launch1.setVisibility(View.VISIBLE);
            launch2.setVisibility(View.INVISIBLE);
            launch3.setVisibility(View.INVISIBLE);
            launch4.setVisibility(View.INVISIBLE);
        }

        oxygenPercentage = findViewById(R.id.oxygenLevel);
        oxygenPercentage.setText("Oxygen Percent Left: " + PlayerInfo.checkOxygenPercentage());

        north = findViewById(R.id.goNorth);
        south = findViewById(R.id.goSouth);
        east = findViewById(R.id.goEast);
        west = findViewById(R.id.goWest);

        if (PlayerInfo.checkPartOne()) {
            north.setVisibility(View.GONE);
        }
        if (PlayerInfo.checkPartTwo()) {
            east.setVisibility(View.GONE);
        }
        if (PlayerInfo.checkPartThree()) {
            west.setVisibility(View.GONE);
        }

        north.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PlayerInfo.movement()) {
                    advanceNorth();
                } else {
                    gameOver();
                }
            }
        });

        south.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PlayerInfo.movement()) {
                    advanceSouth();
                } else {
                    gameOver();
                }
            }
        });

        east.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PlayerInfo.movement()) {
                    advanceEast();
                } else {
                    gameOver();
                }
            }
        });

        west.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PlayerInfo.movement()) {
                    advanceWest();
                } else {
                    gameOver();
                }
            }
        });
    }
    public void advanceNorth() {
        Intent intent = new Intent(this, NorthOne.class);
        homeTheme.release();
        startActivity(intent);
    }
    public void advanceSouth() {
        Intent intent = new Intent(this, SouthOne.class);
        homeTheme.release();
        startActivity(intent);
    }
    public void advanceEast() {
        Intent intent = new Intent(this, EastOne.class);
        homeTheme.release();
        startActivity(intent);
    }
    public void advanceWest() {
        Intent intent = new Intent(this, WestOne.class);
        homeTheme.release();
        startActivity(intent);
    }
    public void gameOver() {
        Intent intent = new Intent(this, GameOver.class);
        homeTheme.release();
        startActivity(intent);
    }
}

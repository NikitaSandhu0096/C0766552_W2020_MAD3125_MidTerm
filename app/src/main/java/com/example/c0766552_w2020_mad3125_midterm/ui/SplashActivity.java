package com.example.c0766552_w2020_mad3125_midterm.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.c0766552_w2020_mad3125_midterm.R;

public class SplashActivity extends AppCompatActivity {

    private int SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {  //https://www.youtube.com/watch?v=jXtof6OUtcE
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent hint = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(hint);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}

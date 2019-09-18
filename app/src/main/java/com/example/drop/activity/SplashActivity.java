package com.example.drop.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;

import com.example.drop.classes.Home;
import com.example.drop.R;


public class SplashActivity extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGHT = 3000; // 两秒后进入系统

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new android.os.Handler().postDelayed(new Runnable() {
            public void run() {
                Intent mainIntent = new Intent(SplashActivity.this, Home.class);
                SplashActivity.this.startActivity(mainIntent);
                SplashActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGHT);
    }

}
package com.example.quotes.ui.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quotes.ui.homescreen.MainActivity;
import com.example.quotes.R;

public class SplashQuotesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_quotes);
        Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashQuotesActivity.this, MainActivity.class));
                finish();
            }
        };

        handler.postDelayed(runnable, 3000);

    }
}
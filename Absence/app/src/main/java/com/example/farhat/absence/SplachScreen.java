package com.example.farhat.absence;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplachScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach_screen);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(!isConnected()) {
                    Intent intent = new Intent(SplachScreen.this, LoginActivity.class);
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(SplachScreen.this , MainActivity.class);
                    startActivity(intent);
                }
            }
        },4000);

    }

    private boolean isConnected() {

        SharedPreferences sharedPreferences = getSharedPreferences("session",MODE_PRIVATE);
        if(sharedPreferences.getString("connected","").equals("true")){
            return true;
        }else{
            return false;
        }
    }
}

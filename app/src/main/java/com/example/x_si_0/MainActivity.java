package com.example.x_si_0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playButtonClick(View view){
        Intent intent = new Intent(this, PlayerSetup.class);
        startActivity(intent);
    }

    public void playCoinFlipClick(View view){
        Intent intent2 = new Intent(this, CoinFlip.class);
        startActivity(intent2);
    }
}
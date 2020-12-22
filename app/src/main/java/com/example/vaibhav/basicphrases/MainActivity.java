package com.example.vaibhav.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    public void translatetoGerman(View view){
        int tappedButton = view.getId();
        if (tappedButton == R.id.button) {
            mediaPlayer = MediaPlayer.create(this, R.raw.howareyou);
            mediaPlayer.start();
        }
        else if (tappedButton == R.id.button2){
            mediaPlayer = MediaPlayer.create(this, R.raw.hello);
            mediaPlayer.start();
        }
        else if (tappedButton == R.id.button3){
            mediaPlayer = MediaPlayer.create(this, R.raw.goodevening);
            mediaPlayer.start();
        }
        else if (tappedButton == R.id.button4){
            mediaPlayer = MediaPlayer.create(this, R.raw.mynamess);
            mediaPlayer.start();
        }
        else if (tappedButton == R.id.button5){
            mediaPlayer = MediaPlayer.create(this, R.raw.please);
            mediaPlayer.start();
        }
        else if (tappedButton == R.id.button6){
            mediaPlayer = MediaPlayer.create(this, R.raw.youspeakenglish);
            mediaPlayer.start();
        }
        else if (tappedButton == R.id.button7){
            mediaPlayer = MediaPlayer.create(this, R.raw.ilivein);
            mediaPlayer.start();
        }
        else if (tappedButton == R.id.button8){
            mediaPlayer = MediaPlayer.create(this, R.raw.welcome);
            mediaPlayer.start();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}

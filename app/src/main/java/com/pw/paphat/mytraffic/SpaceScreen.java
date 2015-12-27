package com.pw.paphat.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SpaceScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space_screen);

        //sound Effect
        MediaPlayer introMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.intro_start_horse);
        introMediaPlayer.start();

        //Auto Run MainActivity
        Handler objHandler = new Handler();
        objHandler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent objIntent = new Intent(SpaceScreen.this,MainActivity.class);
                startActivity(objIntent);
                finish();

            }
        },6000);


    }//Main Method

}   //Main Class

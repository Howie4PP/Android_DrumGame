package com.example.shenhaichen.foleyapp;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {

    private DisplayView displayView;
    private SoundManager soundManager;
    private int bassdrum,cymbals,smallcymbals,snaredrum,tomdrum,tomtomdrum,clash;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayView = (DisplayView) findViewById(R.id.display);
        soundManager = new SoundManager(this);
        bassdrum  = soundManager.addSound(R.raw.bassdrum);
        cymbals  = soundManager.addSound(R.raw.cymbals);
        smallcymbals  = soundManager.addSound(R.raw.smallcymbals);
        snaredrum  = soundManager.addSound(R.raw.snaredrum);
        tomdrum  = soundManager.addSound(R.raw.tomdrum);
        tomtomdrum  = soundManager.addSound(R.raw.tomtomdrum2);
        clash  = soundManager.addSound(R.raw.clash);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        if (event.getAction() != MotionEvent.ACTION_UP){
            return super.onTouchEvent(event);
        }
//        System.out.println("this is X:"+event.getX());
//        System.out.println("this is Y:"+event.getY());
        Position position = displayView.getPosition(event.getX(),event.getY());
        switch (position){
            case SMALLCYMBALS:
                soundManager.play(smallcymbals);
                break;
            case BASSDRUM:
                soundManager.play(bassdrum);
                break;
            case CYMBALS:
                soundManager.play(cymbals);
                break;
            case SNAREDRUM:
                soundManager.play(snaredrum);
                break;
            case TOMDRUM:
                soundManager.play(tomdrum);
                break;
            case TOMTOMDRUM:
                soundManager.play(tomtomdrum);
                break;
            case CLASH:
                soundManager.play(clash);
                break;
        }
        return super.onTouchEvent(event);
    }
}

package com.example.shenhaichen.foleyapp;

import android.content.Context;
import android.media.SoundPool;
import android.os.Build;
import android.support.annotation.RequiresApi;

/**
 * Created by shenhaichen on 25/04/2017.
 */

public class SoundManager {

    private SoundPool pool;
    private Context context;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public SoundManager(Context context) {
        this.context = context;
        SoundPool.Builder builder = new SoundPool.Builder();
        builder.setMaxStreams(10);
        pool = builder.build();

    }

    public int addSound(int resourceID){
        return pool.load(context,resourceID,1);
    }
   public void play(int soundID){
       pool.play(soundID,1,1,1,0,1);
   }
}

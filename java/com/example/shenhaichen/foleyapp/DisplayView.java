package com.example.shenhaichen.foleyapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by shenhaichen on 25/04/2017.
 */

public class DisplayView extends View {


    public DisplayView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
//        message = "Show Message";

    }

//    public PointF getCenter() {
//        return new PointF(getWidth() / 2f, getHeight() / 2f);
//    }

    public Position getPosition(float x, float y) {
//        PointF center = getCenter();
        if ((469.40186< x && x < 550.48096) && (1128.5156< y && y < 1228.5938)) {
            return Position.BASSDRUM;
        } else if ((273.22998< x && x < 461.39282) && (859.39453< y && y < 996.4453)) {
            return Position.SNAREDRUM;
        } else if ((237.20581< x && x < 401.34155) && (255.11719< y && y < 415.1953)) {
            return Position.CYMBALS;
        } else if ((65.028076< x && x < 281.239) && (563.2617< y && y < 759.3164)) {
            return Position.SMALLCYMBALS;
        }else if ((321.28418< x && x < 714.6167) && (623.2617< y && y < 791.3672)) {
            return Position.TOMDRUM;
        }else if ((746.65283< x && x < 898.7915) && (787.3828< y && y < 919.39453)) {
            return Position.TOMTOMDRUM;
        }else if ((810.7251< x && x < 974.86084) && (399.14063< y && y < 547.2656)) {
            return Position.CLASH;
        }else  {
            return Position.DRUM;
        }

    }

//    @Override
//    public void draw(Canvas canvas) {
//        super.draw(canvas);
//        PointF center = getCenter();
////        canvas.drawText(message, center.x, center.y, paint);
//    }

//    public void setMessage(String message){
//        this.message = message;
//        invalidate();
//    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }
}

package com.example.countercal.model;


import android.widget.Toast;

import com.example.countercal.R;

public class Model {
    public int count = 0;

    public void increment(){
        ++count;
    }
    public void decrement(){
        --count;
    }

    public int getCount() {
        return count;
    }
    public final String green = "#4CAF50";
    public final String black = "#FF000000";
    public final String toast = "Поздравляем";

    public String getGreen() {
        return green;
    }

    public String getBlack() {
        return black;
    }

    public String getToast() {
        return toast;
    }
}

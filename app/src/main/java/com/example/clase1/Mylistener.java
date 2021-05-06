package com.example.clase1;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Mylistener implements View.OnClickListener {
private TextView tv;
private Activity activity;


    public Mylistener( Activity activity)
    { this.activity = activity; }

    @Override
    public void onClick(View v) {
        Log.d("Click","hizo click");

            tv.setText("Ya tocaste el botonnn!");

    }

    public  void setTextview(TextView v){
        this.tv = v;
    }
}

package com.example.clase1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = super.findViewById(R.id.tvSaludo);

        Button btn = super.findViewById(R.id.btn);

        Mylistener mylistener = new Mylistener( this );

        mylistener.setTextview( tv );
        btn.setOnClickListener(mylistener);

        tv.setText("Hola desde JAVA");



    }
}

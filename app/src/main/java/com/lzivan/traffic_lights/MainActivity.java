package com.lzivan.traffic_lights;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String i = "Red";
    private TextView colorP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colorP = findViewById(R.id.textView);
    }

    public void changeColor(View view){
        colorP.setBackgroundResource(R.drawable.red);

        if (i.equals("Red")){

            colorP.setBackgroundResource(R.drawable.green);
            i = "Green";
        }
        else if (i.equals("Green")) {
            colorP.setBackgroundResource(R.drawable.yellow);
            i = "Yellow";
        } else {
            colorP.setBackgroundResource(R.drawable.red);
            i = "Red";
        }
    }
}
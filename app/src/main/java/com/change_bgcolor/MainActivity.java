package com.change_bgcolor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String colors[] = {"#7FFF00", "#7FFFD4", "#FFEFD5", "#FFFFF0", "##B8860B", "#DCDCDC", "#20B2AA"};
    Button button;
    RelativeLayout bck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        bck = findViewById(R.id.activity_main);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random i = new Random();
                int c = i.nextInt(colors.length-1)+1;
                bck.setBackgroundColor(Color.parseColor(colors[c]));
            }
        });
    }
}
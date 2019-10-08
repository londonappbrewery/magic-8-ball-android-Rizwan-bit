package com.londonappbrewery.magiceightball;

import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final LinearLayout li = (LinearLayout) findViewById(R.id.myLayout);
        Button askBtn;
        askBtn = (Button) findViewById(R.id.ask_btn);

        final ImageView mainImage = (ImageView) findViewById(R.id.main_img);

        final int[] ballArray = {

                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5

        };

        askBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomnumber = new Random();

                int number = randomnumber.nextInt(5);

                mainImage.setImageResource(ballArray[number]);

                if ( number == 1 ){

                    li.setBackgroundColor(Color.parseColor("#ff0000"));

                }
                else if (number == 2){

                    li.setBackgroundColor(Color.parseColor("#00ff00"));

                }
                else  if (number==3){
                    li.setBackgroundColor(Color.parseColor("#ffff00"));
                }
                else if (number==4){
                    li.setBackgroundColor(Color.parseColor("#00ff00"));
                }
                else {
                    li.setBackgroundColor(Color.parseColor("#ff00ddff"));
                }
            }
        });

    }
}

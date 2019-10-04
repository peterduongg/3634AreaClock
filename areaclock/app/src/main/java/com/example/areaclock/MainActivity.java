package com.example.areaclock;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout clock1 = findViewById(R.id.clock1);
        ConstraintLayout clock2 = findViewById(R.id.clock2);
        ConstraintLayout clock3 = findViewById(R.id.clock3);
        ConstraintLayout clock4 = findViewById(R.id.clock4);
        ConstraintLayout clock5 = findViewById(R.id.clock5);

        TextView areaText1 = clock1.findViewById(R.id.areaText);
        areaText1.setText("Sydney Time");
        TextView areaText2 = clock2.findViewById(R.id.areaText);
        areaText2.setText("Tokyo Time");
        TextView areaText3 = clock3.findViewById(R.id.areaText);
        areaText3.setText("Singapore Time");
        TextView areaText4 = clock4.findViewById(R.id.areaText);
        areaText4.setText("New York Time");
        TextView areaText5 = clock5.findViewById(R.id.areaText);
        areaText5.setText("Hanoi Time");

        ImageView image1 = clock1.findViewById(R.id.imageView);
        image1.setImageResource(R.mipmap.sydney_foreground);

        ImageView image2 = clock2.findViewById(R.id.imageView);
        image2.setImageResource(R.mipmap.tokyo_foreground);

        ImageView image3 = clock3.findViewById(R.id.imageView);
        image3.setImageResource(R.mipmap.singapore_foreground);

        ImageView image4 = clock4.findViewById(R.id.imageView);
        image4.setImageResource(R.mipmap.ny_foreground);

        ImageView image5 = clock5.findViewById(R.id.imageView);
        image5.setImageResource(R.mipmap.hanoi_foreground);

        TextClock clockSyd = clock1.findViewById(R.id.textClock);
        clockSyd.setTimeZone("GMT+10");
        TextClock clockT = clock2.findViewById(R.id.textClock);
        clockT.setTimeZone("GMT+9");
        TextClock clockSP = clock3.findViewById(R.id.textClock);
        clockSP.setTimeZone("GMT+8");
        TextClock clockNY = clock4.findViewById(R.id.textClock);
        clockNY.setTimeZone("GMT-4");
        TextClock clockH = clock5.findViewById(R.id.textClock);
        clockH.setTimeZone("GMT+7");


        TextClock clockSyd2 = clock1.findViewById(R.id.textClock2);
        clockSyd2.setTimeZone("GMT+10");
        TextClock clockT2 = clock2.findViewById(R.id.textClock2);
        clockT2.setTimeZone("GMT+9");
        TextClock clockSP2 = clock3.findViewById(R.id.textClock2);
        clockSP2.setTimeZone("GMT+8");
        TextClock clockNY2 = clock4.findViewById(R.id.textClock2);
        clockNY2.setTimeZone("GMT-4");
        TextClock clockH2 = clock5.findViewById(R.id.textClock2);
        clockH2.setTimeZone("GMT+7");


        clockSyd2.setVisibility(clock1.INVISIBLE);
        clockT2.setVisibility(clock2.INVISIBLE);
        clockSP2.setVisibility(clock3.INVISIBLE);
        clockNY2.setVisibility(clock4.INVISIBLE);
        clockH2.setVisibility(clock5.INVISIBLE);

        Button getTimeButton24 = findViewById(R.id.getTimeButton24);
        getTimeButton24.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
            @Override
            public void onClick(View v) {

                ConstraintLayout clock1 = findViewById(R.id.clock1);
                ConstraintLayout clock2 = findViewById(R.id.clock2);
                ConstraintLayout clock3 = findViewById(R.id.clock3);
                ConstraintLayout clock4 = findViewById(R.id.clock4);
                ConstraintLayout clock5 = findViewById(R.id.clock5);

                TextClock clockSyd2 = clock1.findViewById(R.id.textClock2);
                clockSyd2.setTimeZone("GMT+10");
                TextClock clockT2 = clock2.findViewById(R.id.textClock2);
                clockT2.setTimeZone("GMT+9");
                TextClock clockSP2 = clock3.findViewById(R.id.textClock2);
                clockSP2.setTimeZone("GMT+8");
                TextClock clockNY2 = clock4.findViewById(R.id.textClock2);
                clockNY2.setTimeZone("GMT-4");
                TextClock clockH2 = clock5.findViewById(R.id.textClock2);
                clockH2.setTimeZone("GMT+7");

                clockSyd2.setVisibility(clock1.VISIBLE);
                clockT2.setVisibility(clock2.VISIBLE);
                clockSP2.setVisibility(clock3.VISIBLE);
                clockNY2.setVisibility(clock4.VISIBLE);
                clockH2.setVisibility(clock5.VISIBLE);

                TextClock clockSyd = clock1.findViewById(R.id.textClock);
                clockSyd.setTimeZone("GMT+10");
                TextClock clockT = clock2.findViewById(R.id.textClock);
                clockT.setTimeZone("GMT+9");
                TextClock clockSP = clock3.findViewById(R.id.textClock);
                clockSP.setTimeZone("GMT+8");
                TextClock clockNY = clock4.findViewById(R.id.textClock);
                clockNY.setTimeZone("GMT-4");
                TextClock clockH = clock5.findViewById(R.id.textClock);
                clockH.setTimeZone("GMT+7");

                clockSyd.setVisibility(clock1.INVISIBLE);
                clockT.setVisibility(clock2.INVISIBLE);
                clockSP.setVisibility(clock3.INVISIBLE);
                clockNY.setVisibility(clock4.INVISIBLE);
                clockH.setVisibility(clock5.INVISIBLE);


            }
        });


        Button getTimeButton12 = findViewById(R.id.getTimeButton12);
        getTimeButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                        ConstraintLayout clock1 = findViewById(R.id.clock1);
                        ConstraintLayout clock2 = findViewById(R.id.clock2);
                        ConstraintLayout clock3 = findViewById(R.id.clock3);
                        ConstraintLayout clock4 = findViewById(R.id.clock4);
                        ConstraintLayout clock5 = findViewById(R.id.clock5);

                        TextClock clockSyd = clock1.findViewById(R.id.textClock);
                        clockSyd.setTimeZone("GMT+10");
                        TextClock clockT = clock2.findViewById(R.id.textClock);
                        clockT.setTimeZone("GMT+9");
                        TextClock clockSP = clock3.findViewById(R.id.textClock);
                        clockSP.setTimeZone("GMT+8");
                        TextClock clockNY = clock4.findViewById(R.id.textClock);
                        clockNY.setTimeZone("GMT-4");
                        TextClock clockH = clock5.findViewById(R.id.textClock);
                        clockH.setTimeZone("GMT+7");

                        clockSyd.setVisibility(clock1.VISIBLE);
                        clockT.setVisibility(clock2.VISIBLE);
                        clockSP.setVisibility(clock3.VISIBLE);
                        clockNY.setVisibility(clock4.VISIBLE);
                        clockH.setVisibility(clock5.VISIBLE);

                        TextClock clockSyd2 = clock1.findViewById(R.id.textClock2);
                        TextClock clockT2 = clock2.findViewById(R.id.textClock2);
                        TextClock clockSP2 = clock3.findViewById(R.id.textClock2);
                        TextClock clockNY2 = clock4.findViewById(R.id.textClock2);
                        TextClock clockH2 = clock5.findViewById(R.id.textClock2);

                        clockSyd2.setVisibility(clock1.INVISIBLE);
                        clockT2.setVisibility(clock2.INVISIBLE);
                        clockSP2.setVisibility(clock3.INVISIBLE);
                        clockNY2.setVisibility(clock4.INVISIBLE);
                        clockH2.setVisibility(clock5.INVISIBLE);



            }
        });


    }
}

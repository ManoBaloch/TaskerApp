package com.example.pdoffice.taskerapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends Activity {

    CardView cv1,cv2,cv3,cv4;
    Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cv1=(CardView) findViewById(R.id.cv1);
        cv2=(CardView) findViewById(R.id.cv2);
        cv3=(CardView) findViewById(R.id.cv3);
        cv4=(CardView) findViewById(R.id.cv4);

        in=new Intent(this, TaskActivity.class);

        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(in);
            }
        });


    }
}

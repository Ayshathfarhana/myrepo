package com.example.qburst.newworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by qburst on 21/6/16.
 */
public class SecondActivity  extends AppCompatActivity
{






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent intent = getIntent();
        // String message = intent.getStringExtra(MyActivity.EXTRA_MESSAGE);
        Info info =(Info) intent.getParcelableExtra("info_object");
        TextView v1 = (TextView) findViewById(R.id.textView1);
        TextView v2 = (TextView) findViewById(R.id.textView2);
        TextView v3 = (TextView) findViewById(R.id.textView3);
        TextView v4 = (TextView) findViewById(R.id.textView4);
        v1.setText(info.getName());
        v2.setText(info.getCourse());
        v3.setText(info.getCollege());
        v4.setText(info.getPlace());


    }
}

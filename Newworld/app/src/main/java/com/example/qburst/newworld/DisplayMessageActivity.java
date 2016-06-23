package com.example.qburst.newworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class DisplayMessageActivity  extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);


        Intent intent = getIntent();

        Info info =(Info) intent.getParcelableExtra("info_object");
        TextView textView = new TextView(this);
        textView.setTextSize(40);

        RelativeLayout layout = (RelativeLayout) findViewById(R.id.content);
        layout.addView(textView);


    }
}

package com.example.qburst.newworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.SharedPreferences;


import android.content.Context;
public class NewActivity extends AppCompatActivity {
    Button button;
    EditText editname;
    EditText editCourse;
    EditText editplace;
    EditText editcolleg;
    String store;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        button = (Button) findViewById(R.id.send_button);
        editname = (EditText) findViewById(R.id.edit_name);
        editCourse = (EditText) findViewById(R.id.edit_course);
        editcolleg = (EditText) findViewById(R.id.edit_college);
        editplace = (EditText) findViewById(R.id.edit_place);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("xxxx", "xxxxxx");
                Info info = new Info();
                info.setCollege(editcolleg.getText().toString());
                info.setPlace(editplace.getText().toString());
                info.setCourse(editCourse.getText().toString());
                info.setName(editname.getText().toString());
                Intent intent = new Intent(NewActivity.this, SecondActivity.class);
                intent.putExtra("info_object", info);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences sharedpreferences = getSharedPreferences("MyPREFERENCES", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString("name",editname.getText().toString());
        editor.putString("course",editCourse.getText().toString());
        editor.putString("college",editcolleg.getText().toString());
        editor.putString("place",editplace.getText().toString());
        editor.commit();
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sharedPref = getSharedPreferences("MyPREFERENCES", Context.MODE_PRIVATE);
        store = sharedPref.getString("name",null);
        editname.setText(store);
        store = sharedPref.getString("course",null);
        editCourse.setText(store);
        store =sharedPref.getString("college",null);
        editcolleg.setText(store);
        store = sharedPref.getString("place",null);
        editplace.setText(store);
    }


    }


/*if(savedInstanceState != null){
            store = savedInstanceState.getString("name");
            editname.setText(store);
            store = savedInstanceState.getString("course");
            editCourse.setText(store);
            store = savedInstanceState.getString("college");
            editcolleg.setText(store);
            store = savedInstanceState.getString("place");
            editplace.setText(store);*/



   /* @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("name",editname.getText().toString());
        outState.putString("course",editCourse.getText().toString());
        outState.putString("college",editcolleg.getText().toString());
        outState.putString("place",editplace.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
      store = savedInstanceState.getString("name");
        editname.setText(store);
        store = savedInstanceState.getString("course");
        editCourse.setText(store);
        store = savedInstanceState.getString("college");
        editcolleg.setText(store);
        store = savedInstanceState.getString("place");
        editplace.setText(store);*/

/*
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.content.Intent;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;

public class MyActivity extends AppCompatActivity {

    Button button;
    EditText editname;
    EditText editCourse;
    EditText editplace;
    EditText editcolleg;
    Info info;

    //public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";
    public final static String info_object= "com.qburst.MyApplication.object";

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        button = (Button) findViewById(R.id.send_button);
        editname = (EditText) findViewById(R.id.edit_name);
        editCourse = (EditText) findViewById(R.id.edit_course);
        editcolleg = (EditText) findViewById(R.id.edit_college);
        editplace = (EditText) findViewById(R.id.edit_place);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Log.e("xxxx", "xxxxxx");
                Info info=new Info();
                info.setCollege(editcolleg.getText().toString());
                info.setPlace(editplace.getText().toString());
                info.setCourse(editCourse.getText().toString() );
                info.setName( editname.getText().toString());
                Intent intent = new Intent(MyActivity.this,DisplayMessageActivity.class);
                intent.putExtra(info_object, info);
                startActivity(intent);

            }

        });

    }


    /*public void sendMessage(View view) {
        Intent intent = new Intent(this,DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_name);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }*/


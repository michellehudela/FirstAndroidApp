package com.example.michellehudela.firstandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.jtlavoie.HelloWorldAgain.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void activity2(View view) {


        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);


    }

}


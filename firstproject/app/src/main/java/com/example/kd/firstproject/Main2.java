package com.example.kd.firstproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by KD on 15/03/2018.
 */

public class Main2 extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        Intent intent=getIntent();
        String str;
        str=intent.getStringExtra("url");


        textView=(TextView)findViewById(R.id.text);
        textView.setText(str);
    }
}

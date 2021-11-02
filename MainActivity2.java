package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    TextView statusView;
    ProgressBar indicatorBar;
    TextView tx;
    String[] SendValues;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tx = (TextView) findViewById(R.id.textView13);

        Bundle b = this.getIntent().getExtras();
        SendValues =b.getStringArray("values");

        statusView =(TextView) findViewById(R.id.textView12);
        indicatorBar = findViewById(R.id.progressBar);
        indicatorBar.setProgress(50);
    }
}
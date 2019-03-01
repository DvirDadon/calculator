package com.example.simulation.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CREDITS extends AppCompatActivity {
    TextView tlvanswer;
    String text;
    Double get;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        tlvanswer = (TextView)findViewById(R.id.tvlanswer);
        Intent getmessager = getIntent();
        get = getmessager.getDoubleExtra("n123",0.0);
        text = ""+get;
        tlvanswer.setText("The last answer is:"+text);
    }


    public void BackToCalculate(View view) {
        Intent backto = new Intent(this,MainActivity.class);
        startActivity(backto);
    }
}

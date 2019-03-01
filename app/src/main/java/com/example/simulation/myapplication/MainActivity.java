package com.example.simulation.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText ETMath;
String st1="0",st2="0",st3;
Double num,num2,num3,sum=0.0;
int Enull=0;
int pehola;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    ETMath = (EditText) findViewById(R.id.ETMath);
    }

    public void Plus(View view) {
        pehola=7;
        st1 = ETMath.getText().toString();
        if (st1.equals(""))
            st1="0.0";
        ETMath.setText("");
    }

    public void Minus(View view) {
        pehola=8;
        st1 = ETMath.getText().toString();
        if (st1.equals(""))
            st1="0.0";
        ETMath.setText("");
    }

    public void kefel(View view) {
        pehola=9;
        st1 = ETMath.getText().toString();
        if (st1.equals(""))
            st1="0.0";
        ETMath.setText("");
    }

    public void hiluk(View view) {
        pehola=10;
        st1 = ETMath.getText().toString();
        if (st1.equals(""))
            st1="0.0";
        ETMath.setText("");
    }

    public void ClearAll(View view) {
        num=0.0;
        num2=0.0;
        sum=0.0;
        ETMath.setText("");
    }

    public void shave(View view) {
        switch (pehola){
            case 7:
                num = Double.parseDouble(st1);
                st2 = ETMath.getText().toString();
                if (st2.equals("")) {
                    st2 = "0.0";
                    Toast.makeText(this, "Pls enter a number before using a function", Toast.LENGTH_SHORT).show();
                }
                num2 =Double.parseDouble(st2);
                sum=num+num2;
                ETMath.setText(""+sum);
                break;
            case 8:
                num = Double.parseDouble(st1);
                st2 = ETMath.getText().toString();
                if (st2.equals("")) {
                    st2 = "0.0";
                    Toast.makeText(this, "Pls enter a number before using a function", Toast.LENGTH_SHORT).show();
                }
                num2 =Double.parseDouble(st2);
                sum= num-num2;
                ETMath.setText(""+sum);
                break;
            case 9:
                num = Double.parseDouble(st1);
                st2 = ETMath.getText().toString();
                if (st2.equals("")) {
                    st2 = "0.0";
                    Toast.makeText(this, "Pls enter a number before using a function", Toast.LENGTH_SHORT).show();
                }
                num2 =Double.parseDouble(st2);
                sum= num*num2;
                ETMath.setText(""+sum);
                break;
            case 10:
                num = Double.parseDouble(st1);
                st2 = ETMath.getText().toString();
                if (st2.equals("")) {
                    st2 = "0.0";
                    Toast.makeText(this, "Pls enter a number before using a function", Toast.LENGTH_SHORT).show();
                }
                num2 =Double.parseDouble(st2);
                sum= num/num2;
                ETMath.setText(""+sum);
                break;
                default:

                    Toast.makeText(this, "You didn't enter a number pls enter a number before using a function", Toast.LENGTH_LONG).show();
        }
    }
    public void credit(View view) {
        Intent messager = new Intent(this,CREDITS.class);
        messager.putExtra("n123",sum);
        startActivity(messager);

}
    }


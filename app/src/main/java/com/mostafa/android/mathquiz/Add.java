package com.mostafa.android.mathquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by mostafa on 1/25/18.
 */

public class Add extends AppCompatActivity {
    TextView num1T,num2T;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        Random random=new Random();
        int num1=random.nextInt(20);
        int num2=random.nextInt(30);

        num1T = (TextView)findViewById(R.id.num1);
        num2T = (TextView)findViewById(R.id.num2);

        num1T.setText(String.valueOf(num1));
        num2T.setText(String.valueOf(num2));



    }
}


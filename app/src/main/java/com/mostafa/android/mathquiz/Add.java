package com.mostafa.android.mathquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by mostafa on 1/25/18.
 */

public class Add extends AppCompatActivity {
    TextView num1T,num2T,num11T,num22T,num111T,num222T,num1111T,num2222T,num11111T,num22222T;
    int result1,result2,result3,result4,result5;
    EditText editText1,editText11,editText111,editText1111,editText11111;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        num1T = (TextView)findViewById(R.id.num1);
        num2T = (TextView)findViewById(R.id.num2);
        chooseNumber(num1T,num2T);
        num11T = (TextView)findViewById(R.id.num11);
        num22T = (TextView)findViewById(R.id.num22);
        chooseNumber(num11T,num22T);
        num111T = (TextView)findViewById(R.id.num111);
        num222T = (TextView)findViewById(R.id.num222);
        chooseNumber(num111T,num222T);
        num1111T = (TextView)findViewById(R.id.num1111);
        num2222T = (TextView)findViewById(R.id.num2222);
        chooseNumber(num1111T,num2222T);
        num11111T = (TextView)findViewById(R.id.num11111);
        num22222T = (TextView)findViewById(R.id.num22222);
        chooseNumber(num11111T,num22222T);
        editText1=(EditText)findViewById(R.id.EditAdd1);
        editText11=(EditText)findViewById(R.id.EditAdd11);
        editText111=(EditText)findViewById(R.id.EditAdd111);
        editText1111=(EditText)findViewById(R.id.EditAdd1111);
        editText11111=(EditText)findViewById(R.id.EditAdd11111);




    }

    public void chooseNumber(TextView num1T,TextView num2T){
        Random random=new Random();
        int num1=random.nextInt(50);
        int num2=random.nextInt(50);
        if(i==0){
            result1=num1+num2;
        }else if(i==1){
            result2=num1+num2;
        }else if(i==2){
            result3=num1+num2;
        }else if(i==3){
            result4=num1+num2;
        }else if(i==4){
            result5=num1+num2;
        }
        num1T.setText(String.valueOf(num1));
        num2T.setText(String.valueOf(num2));
        i++;
        if(i==5)
            i=0;
        random =null;
    }

    public void TakeAddAnswer(View view) {
        int num1,num2,num3,num4,num5,count=0;
        num1=Integer.parseInt(editText1.getText().toString());
        num2=Integer.parseInt(editText11.getText().toString());
        num3=Integer.parseInt(editText111.getText().toString());
        num4=Integer.parseInt(editText1111.getText().toString());
        num5=Integer.parseInt(editText11111.getText().toString());
        if(result1==num1) count++;
        if(result2==num2) count++;
        if(result3==num3) count++;
        if(result4==num4) count++;
        if(result5==num5) count++;

        Toast.makeText(this, "your score here is "+count, Toast.LENGTH_SHORT).show();

    }
}


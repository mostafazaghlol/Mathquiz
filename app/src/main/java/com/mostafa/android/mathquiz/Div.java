package com.mostafa.android.mathquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by mostafa on 1/25/18.
 */

public class Div extends AppCompatActivity {
    TextView num1T,num2T,num11T,num22T,num111T,num222T,num1111T,num2222T,num11111T,num22222T;
    int result1,result2,result3,result4,result5;
    RadioButton radioButton1,radioButton2,radioButton3,radioButton4,radioButton5,radioButton6,radioButton7,radioButton8,radioButton9,radioButton10;
    int num1,num2,num3,num4,num5;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_div);
        radioButton1 = (RadioButton) findViewById(R.id.yes_radio_button1);
        radioButton2 = (RadioButton) findViewById(R.id.yes_radio_button2);
        radioButton3 = (RadioButton) findViewById(R.id.yes_radio_button3);
        radioButton4 = (RadioButton) findViewById(R.id.yes_radio_button4);
        radioButton5 = (RadioButton) findViewById(R.id.yes_radio_button5);
        radioButton6 = (RadioButton) findViewById(R.id.no_radio_button1);
        radioButton7 = (RadioButton) findViewById(R.id.no_radio_button2);
        radioButton8 = (RadioButton) findViewById(R.id.no_radio_button3);
        radioButton9 = (RadioButton) findViewById(R.id.no_radio_button4);
        radioButton10 = (RadioButton) findViewById(R.id.no_radio_button5);

        num1T = (TextView) findViewById(R.id.num1);
        num2T = (TextView) findViewById(R.id.num2);
        chooseNumber(num1T, num2T);
        num11T = (TextView) findViewById(R.id.num11);
        num22T = (TextView) findViewById(R.id.num22);
        chooseNumber(num11T, num22T);
        num111T = (TextView) findViewById(R.id.num111);
        num222T = (TextView) findViewById(R.id.num222);
        chooseNumber(num111T, num222T);
        num1111T = (TextView) findViewById(R.id.num1111);
        num2222T = (TextView) findViewById(R.id.num2222);
        chooseNumber(num1111T, num2222T);
        num11111T = (TextView) findViewById(R.id.num11111);
        num22222T = (TextView) findViewById(R.id.num22222);
        chooseNumber(num11111T, num22222T);
    }

    public void chooseNumber(TextView num1T,TextView num2T){
        Random random=new Random();
        int num1=random.nextInt(50);
        int num2=random.nextInt(50);
        if(i==0){
            result1=num1/num2;
            CharSequence charSequence = String.valueOf(result1);
            CharSequence charSequence2 = String.valueOf(result1+(result1-10));
            if(result1>0){
                radioButton1.setText(charSequence);
                radioButton6.setText(charSequence2);

            }else{
                radioButton1.setText(charSequence2);
                radioButton6.setText(charSequence);
            }
        }else if(i==1){
            result2=num1/num2;
            CharSequence charSequence = String.valueOf(result2);
            CharSequence charSequence2 = String.valueOf(result2+(result2-2));

            if(result2<0){
                radioButton2.setText(charSequence);
                radioButton7.setText(charSequence2);
            }else{
                radioButton2.setText(charSequence2);
                radioButton7.setText(charSequence);
            }
        }else if(i==2){
            result3=num1/num2;
            CharSequence charSequence = String.valueOf(result3);
            CharSequence charSequence3 = String.valueOf(result3+(result3-8));
            if(result3>0){
                radioButton3.setText(charSequence);
                radioButton8.setText(charSequence3);
            }else{
                radioButton8.setText(charSequence);
                radioButton3.setText(charSequence3);
            }
        }else if(i==3){
            result4=num1/num2;
            CharSequence charSequence = String.valueOf(result4);
            CharSequence charSequence2 = String.valueOf(result4+(result4-7));
            if(result4>0){
                radioButton4.setText(charSequence);
                radioButton9.setText(charSequence2);
            }else{
                radioButton9.setText(charSequence);
                radioButton4.setText(charSequence2);
            }
        }else if(i==4){
            result5=num1/num2;
            CharSequence charSequence = String.valueOf(result5);
            CharSequence charSequence2 = String.valueOf(result5+(result5-5));

            if(result5>0){
                radioButton5.setText(charSequence);
                radioButton10.setText(charSequence2);
            }else{
                radioButton10.setText(charSequence);
                radioButton5.setText(charSequence2);
            }
        }
        num1T.setText(String.valueOf(num1));
        num2T.setText(String.valueOf(num2));
        i++;
        if(i==5)
            i=0;
        random =null;
    }
    public void Answer1(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        //get String value
        String value="";
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.yes_radio_button1:
                if (checked)
                    value = ((RadioButton) view).getText().toString();
                num1 = Integer.parseInt(value);
                break;
            case R.id.no_radio_button1:
                if (checked)
                    value = ((RadioButton) view).getText().toString();
                num1 = Integer.parseInt(value);
                break;
        }
    }
    public void Answer2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        //get String value
        String value="";
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.yes_radio_button2:
                if (checked)
                    value = ((RadioButton) view).getText().toString();
                num2 = Integer.parseInt(value);
                break;
            case R.id.no_radio_button2:
                if (checked)
                    value = ((RadioButton) view).getText().toString();
                num2 = Integer.parseInt(value);
                break;
        }
    }
    public void Answer3(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        //get String value
        String value="";
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.yes_radio_button3:
                if (checked)
                    value = ((RadioButton) view).getText().toString();
                num3 = Integer.parseInt(value);
                break;
            case R.id.no_radio_button3:
                if (checked)
                    value = ((RadioButton) view).getText().toString();
                num3 = Integer.parseInt(value);
                break;
        }
    }
    public void Answer4(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        //get String value
        String value="";
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.yes_radio_button4:
                if (checked)
                    value = ((RadioButton) view).getText().toString();
                num4 = Integer.parseInt(value);
                break;
            case R.id.no_radio_button4:
                if (checked)
                    value = ((RadioButton) view).getText().toString();
                num4 = Integer.parseInt(value);
                break;
        }
    }
    public void Answer5(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        //get String value
        String value="";
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.yes_radio_button5:
                if (checked)
                    value = ((RadioButton) view).getText().toString();
                num5 = Integer.parseInt(value);
                break;
            case R.id.no_radio_button5:
                if (checked)
                    value = ((RadioButton) view).getText().toString();
                num5 = Integer.parseInt(value);
                break;
        }
    }

    public void TakeDivAnswer(View view){
        int count=0;
        if(result1==num1) count++;
        if(result2==num2) count++;
        if(result3==num3) count++;
        if(result4==num4) count++;
        if(result5==num5) count++;
        Toast.makeText(this, "your score here is "+count, Toast.LENGTH_SHORT).show();

    }
}


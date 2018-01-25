package com.mostafa.android.mathquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Intent intentAdd,intentSub,intentMul,intentDiv;
    TextView AddText,SubText,MulText,DivText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intentAdd = new Intent(this,Add.class);
        intentSub = new Intent(this,Sub.class);
        intentDiv = new Intent(this,Div.class);
        intentMul = new Intent(this,Mul.class);
        AddText = (TextView)findViewById(R.id.AddBtn);
        SubText = (TextView)findViewById(R.id.SubBtn);
        MulText = (TextView)findViewById(R.id.MulBtn);
        DivText = (TextView)findViewById(R.id.DivBtn);

        AddText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intentAdd);
            }
        });
        SubText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intentSub);
            }
        });
        MulText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intentMul);
            }
        });
        DivText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intentDiv);
            }
        });


    }
}

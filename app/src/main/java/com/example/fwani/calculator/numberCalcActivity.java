package com.example.fwani.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class numberCalcActivity extends AppCompatActivity {
    EditText e1, e2;
    Button addBtn, subBtn, multBtn, divBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_calc);
        setTitle("계산기");

        e1 = (EditText)findViewById(R.id.num1);
        e2 = (EditText)findViewById(R.id.num2);
        addBtn = (Button) findViewById(R.id.addBtn);
        subBtn = (Button)findViewById(R.id.subBtn);
        multBtn = (Button)findViewById(R.id.multBtn);
        divBtn = (Button)findViewById(R.id.divBtn);
    }

    public void addClick(View v){
        int n1, n2;
        String n1Str, n2Str;
        n1Str = e1.getText().toString();
        n2Str = e2.getText().toString();
        if(n1Str.equals("")) {
            e1.requestFocus();
            Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
        }
        else if(n2Str.equals("")) {
            e2.requestFocus();
            Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
        }
        else{
            n1 = Integer.parseInt(n1Str);
            n2 = Integer.parseInt(n2Str);
            Toast.makeText(getApplicationContext(), "더하기의 계산 결과는 "+ (n1+n2)+"입니다.", Toast.LENGTH_SHORT).show();
        }
    }
    public void subClick(View v){
        int n1, n2;
        String n1Str, n2Str;
        n1Str = e1.getText().toString();
        n2Str = e2.getText().toString();
        if(n1Str.equals("")) {
            e1.requestFocus();
            Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
        }
        else if(n2Str.equals("")) {
            e2.requestFocus();
            Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
        }
        else{
            n1 = Integer.parseInt(n1Str);
            n2 = Integer.parseInt(n2Str);
            Toast.makeText(getApplicationContext(), "빼기의 계산 결과는 "+ (n1-n2)+"입니다.", Toast.LENGTH_SHORT).show();
        }
    }
    public void multClick(View v){
        int n1, n2;
        String n1Str, n2Str;
        n1Str = e1.getText().toString();
        n2Str = e2.getText().toString();
        if(n1Str.equals("")) {
            e1.requestFocus();
            Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
        }
        else if(n2Str.equals("")) {
            e2.requestFocus();
            Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
        }
        else{
            n1 = Integer.parseInt(n1Str);
            n2 = Integer.parseInt(n2Str);
            Toast.makeText(getApplicationContext(), "곱하기의 계산 결과는 "+ (n1*n2)+"입니다.", Toast.LENGTH_SHORT).show();
        }
    }
    public void divClick(View v){
        double n1, n2;
        String n1Str, n2Str;
        n1Str = e1.getText().toString();
        n2Str = e2.getText().toString();
        if(n1Str.equals("")) {
            e1.requestFocus();
            Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
        }
        else if(n2Str.equals("")) {
            e2.requestFocus();
            Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
        }
        else{
            n1 = Double.parseDouble(n1Str);
            n2 = Double.parseDouble(n2Str);
            int result = (int)(n1/n2);
            Toast.makeText(getApplicationContext(), "나누기의 계산 결과는 "+ result +"입니다.", Toast.LENGTH_SHORT).show();
        }
    }
}

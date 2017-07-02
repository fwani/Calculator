package com.example.fwani.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ageCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age_calculator);
        setTitle("나이 계산기");
        final EditText yearText = (EditText) findViewById(R.id.yearText);
        Button ageCalcButton = (Button) findViewById(R.id.ageCalcButton);

        ageCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String yearStr = yearText.getText().toString();
                int num, result;
                if (yearStr.equals("")) {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
                } else {
                    num = Integer.parseInt(yearStr);
                    result = 2017 - num + 1;
                    Toast.makeText(getApplicationContext(), "당신의 나이는 " + String.valueOf(result) + "세 입니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        final EditText ageText = (EditText) findViewById(R.id.ageText);
        Button yearCalcButton = (Button) findViewById(R.id.yearCalcButton);
        yearCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ageStr = ageText.getText().toString();
                int num, result;
                if(ageStr.equals("")){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요",Toast.LENGTH_SHORT).show();
                }else {
                    num = Integer.parseInt(ageStr);
                    result = 2017 - num + 1;
                    Toast.makeText(getApplicationContext(), "당신의 태어난 해는 " + String.valueOf(result) + "년 입니다."
                            , Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

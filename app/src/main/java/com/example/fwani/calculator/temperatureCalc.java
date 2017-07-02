package com.example.fwani.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class temperatureCalc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_calc);
        setTitle("온도 계산기");
        final EditText celsiusText = (EditText)findViewById(R.id.celsiusText);
        Button fahrenheitCalcButton = (Button)findViewById(R.id.fahrenheitCalcButton);

        fahrenheitCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String celStr = celsiusText.getText().toString();
                double num, result;
                if(celStr.equals("")){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요",Toast.LENGTH_SHORT).show();
                }else {
                    num = Double.parseDouble(celStr);
                    result = num * 1.8 + 32;
                    Toast.makeText(getApplicationContext(), "화씨 온도는 " + String.valueOf(result) + "도 입니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        final EditText fahrenheitText = (EditText)findViewById(R.id.fahrenheitText);
        Button celsiusCalcButton = (Button)findViewById(R.id.celsiusCalcButton);
        celsiusCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fahStr = fahrenheitText.getText().toString();
                double num, result;
                if(fahStr.equals("")){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요",Toast.LENGTH_SHORT).show();
                }else {
                    num = Double.parseDouble(fahStr);
                    result = (num - 32) / 1.8;
                    Toast.makeText(getApplicationContext(), "섭씨 온도는 " + String.valueOf(result) + "도 입니다."
                            , Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

package com.example.fwani.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class restaurantActivity extends AppCompatActivity {
    EditText pizzaNum, spagettiNum, saladNum;
    TextView orderPrice, orderNum;
    Button payButton;
    CheckBox memberBox;

    int totalPrice, totalNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant2);
        setTitle("레스토랑 주문");

        payButton = (Button)findViewById(R.id.payButton);
        pizzaNum = (EditText)findViewById(R.id.pizzaNum);
        spagettiNum = (EditText)findViewById(R.id.spagettiNum);
        saladNum = (EditText)findViewById(R.id.saladNum);
        orderNum = (TextView)findViewById(R.id.orderNum);
        orderPrice = (TextView)findViewById(R.id.orderPrice);
        memberBox = (CheckBox)findViewById(R.id.membershipBox);

        payButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
           }
        });
    }
    public void start(){
        int pizza, spagetti, salad;
        String pizzaStr, spagettiStr, saladStr;

        pizzaStr = pizzaNum.getText().toString();
        if(pizzaStr.equals("")){
            pizza = 0;
        }else{
            pizza = Integer.parseInt(pizzaStr);
        }
        spagettiStr = spagettiNum.getText().toString();
        if(spagettiStr.equals("")){
            spagetti = 0;
        }else{
            spagetti = Integer.parseInt(spagettiStr);
        }
        saladStr = saladNum.getText().toString();
        if(saladStr.equals("")){
            salad = 0;
        }else{
            salad = Integer.parseInt(saladStr);
        }

        totalNum = pizza + spagetti + salad;
        totalPrice = 15000*pizza + 13000*spagetti + 9000*salad;

        if(memberBox.isChecked())
            totalPrice = totalPrice * 90 / 100;

        orderNum.setText(totalNum + "개");
        orderPrice.setText(totalPrice + "원");
    }
}

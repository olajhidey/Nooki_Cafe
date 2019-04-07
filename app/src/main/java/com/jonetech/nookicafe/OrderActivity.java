package com.jonetech.nookicafe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    private TextView orderTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Intent intent = getIntent();

        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        orderTextView = (TextView) findViewById(R.id.orderTextView);

        if(message == null){
            orderTextView.setText("Cart is Empty!");
        }else{
            orderTextView.setText(message);
        }




    }
}

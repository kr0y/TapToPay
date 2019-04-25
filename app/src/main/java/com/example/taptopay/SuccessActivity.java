package com.example.taptopay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String cardNum = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.successtext);
        String last4digits = cardNum.substring(cardNum.length()-4);
        String msg = getString(R.string.payment_success_for) + last4digits;

        if(cardNum==null || cardNum.isEmpty()) {
            msg = getString(R.string.payment_success);
        }

        textView.setText(msg);

    }
}

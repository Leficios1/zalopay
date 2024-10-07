package com.example.zalopay1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PaymentNoti extends AppCompatActivity {

    TextView txtNotification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment_notification);

        txtNotification = findViewById(R.id.textViewNotify);

        Intent intent = getIntent();
        txtNotification.setText(intent.getStringExtra("result"));
    }
}


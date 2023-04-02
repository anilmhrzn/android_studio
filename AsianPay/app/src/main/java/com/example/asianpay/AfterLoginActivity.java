package com.example.asianpay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AfterLoginActivity extends AppCompatActivity {
    TextView greetings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        greetings=findViewById(R.id.greetings);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);
        Bundle bundle=getIntent().getExtras();
        greetings=findViewById(R.id.greetings);
        greetings.setText("Welcome to asian pay Mr."+bundle.getString("name"));
    }
}
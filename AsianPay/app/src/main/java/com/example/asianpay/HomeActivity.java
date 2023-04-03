package com.example.asianpay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
ImageView no_eye;
Boolean isVisible=true;
TextView money;
//String temp;
public void ChangeVisibility(){
    if(isVisible){
        money.setText("XXXXX");
//        temp=money.getText().toString();
        isVisible=false;
    }else{
        money.setText("Rs.100");
        isVisible=true;
    }
}
//string changeVisibility
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        no_eye=findViewById(R.id.no_eye);
        money=findViewById(R.id.money);
    no_eye.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            ChangeVisibility();
            Toast.makeText(HomeActivity.this, "Clicked eye", Toast.LENGTH_SHORT).show();

        }
    });
    }
}
package com.example.asianpay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

class User{
    String username,password;
    public String getUsername(){
        return username;
    }
//    public String getUsername(){
//        return username;
//    }

}
public class RegisterActivity extends AppCompatActivity {
    Button register_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();

        register_btn=findViewById(R.id.register_btn);
    register_btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent =new Intent(RegisterActivity.this,HomeActivity.class);
            startActivity(intent);
        }
    });
    }
}
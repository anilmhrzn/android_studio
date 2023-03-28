package com.example.asianpay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Login extends AppCompatActivity {
    Button login_btn;
    Button register_btn;
    Button forgot_password_btn;
    TextInputEditText input_username ;
    TextInputEditText input_password;
    String username;
    String password;
//    private boolean isValidString(String str) {
//        return str != null && !TextUtils.isEmpty(str);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login_btn=findViewById(R.id.login_btn);
        register_btn=findViewById(R.id.register_btn);
        forgot_password_btn=findViewById(R.id.forgot_password_btn);


        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Login.this, "login clicked", Toast.LENGTH_SHORT).show();
            }
        });
        register_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Login.this, "register clicked", Toast.LENGTH_SHORT).show();
            }
        });
        forgot_password_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Login.this, "forgot password clicked", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
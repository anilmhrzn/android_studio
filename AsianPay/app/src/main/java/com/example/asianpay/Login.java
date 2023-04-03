package com.example.asianpay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
    TextInputEditText username ;
    TextInputEditText password;
    String input_username;
    String input_password;
    private boolean isValidString(String str) {
        return str != null && !TextUtils.isEmpty(str);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login_btn=findViewById(R.id.login_btn);
        register_btn=findViewById(R.id.register_btn);
        forgot_password_btn=findViewById(R.id.forgot_password_btn);
        password=findViewById(R.id.password);
        username=findViewById(R.id.username);



        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_username=username.getText().toString();
                input_password=password.getText().toString();
                Toast.makeText(Login.this, input_username, Toast.LENGTH_SHORT).show();

                if(isValidString(input_username) && isValidString(input_password)){
                    Toast.makeText(Login.this, "logged in", Toast.LENGTH_SHORT).show();
                    Bundle bundle=new Bundle();
                    bundle.putString("name",input_username);
                    Intent intent =new Intent(Login.this,AfterLoginActivity.class);
                    intent.putExtras(bundle);

                    startActivity(intent);
                }else{
                    username.setError("Username or password cannot be empty");
//                    Toast.makeText(Login.this, "empty", Toast.LENGTH_SHORT).show();
                }

            }
        });
        register_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Login.this,RegisterActivity.class);
                startActivity(intent);
//                Toast.makeText(Login.this, "register clicked", Toast.LENGTH_SHORT).show();
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
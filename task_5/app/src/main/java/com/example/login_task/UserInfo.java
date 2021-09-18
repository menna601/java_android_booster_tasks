package com.example.login_task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class UserInfo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        TextView email = findViewById(R.id.email_field);
        TextView password = findViewById(R.id.pass_field);
        Intent intent = getIntent();
        email.setText(intent.getStringExtra("EMAIL"));
        password.setText(intent.getStringExtra("PASS"));
    }
}
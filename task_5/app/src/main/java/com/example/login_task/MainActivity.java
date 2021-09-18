package com.example.login_task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText email, password;
    Button signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.email_field);
        password = findViewById(R.id.password_field);
        signIn = findViewById(R.id.login_btn);
        signIn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, UserInfo.class);
        intent.putExtra("EMAIL", email.getText().toString());
        intent.putExtra("PASS", password.getText().toString());
        startActivity(intent);
    }
}
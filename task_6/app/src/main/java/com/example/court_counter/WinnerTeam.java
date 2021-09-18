package com.example.court_counter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class WinnerTeam extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner_team);

        Intent intent = getIntent();
        String winningTeam = intent.getStringExtra("Winner");
        TextView textView = findViewById(R.id.text);
        textView.setText(textView.getText().toString() + winningTeam);
    }
}
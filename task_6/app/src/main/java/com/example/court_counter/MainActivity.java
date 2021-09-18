package com.example.court_counter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button teamA_3Points, teamA_2Points, teamA_FreePoints;
    Button teamB_3Points, teamB_2Points, teamB_FreePoints;
    Button reset;
    TextView scoreOfTeamA;
    TextView scoreOfTeamB;
    int teamAScore, teamBScore;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialization();
        setClickListenerForAll();
        intent = new Intent(this, WinnerTeam.class);
    }

    private void setClickListenerForAll() {
        teamA_3Points.setOnClickListener(this);
        teamA_2Points.setOnClickListener(this);
        teamA_FreePoints.setOnClickListener(this);

        teamB_3Points.setOnClickListener(this);
        teamB_2Points.setOnClickListener(this);
        teamB_FreePoints.setOnClickListener(this);

        reset.setOnClickListener(this);
    }

    private void initialization() {
        teamAScore = teamBScore = 0;

        teamA_3Points = findViewById(R.id.points_3_a);
        teamA_2Points = findViewById(R.id.points_2_a);
        teamA_FreePoints = findViewById(R.id.points_free_a);

        teamB_3Points = findViewById(R.id.points_3_b);
        teamB_2Points = findViewById(R.id.points_2_b);
        teamB_FreePoints = findViewById(R.id.points_free_b);

        scoreOfTeamA = findViewById(R.id.team_score_a);
        scoreOfTeamB = findViewById(R.id.team_score_b);

        reset = findViewById(R.id.reset);
    }

    @Override
    protected void onResume() {
        super.onResume();
        teamAScore = teamBScore = 0;
        scoreOfTeamA.setText(String.valueOf(teamAScore));
        scoreOfTeamB.setText(String.valueOf(teamBScore));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.points_3_a:
                teamAScore += 3;
                break;
            case R.id.points_2_a:
                teamAScore += 2;
                break;
            case R.id.points_free_a:
                teamAScore += 1;
                break;
            case R.id.points_3_b:
                teamBScore += 3;
                break;
            case R.id.points_2_b:
                teamBScore += 2;
                break;
            case R.id.points_free_b:
                teamBScore += 1;
                break;
            case R.id.reset:
                teamAScore = 0;
                teamBScore = 0;
        }
        scoreOfTeamA.setText(String.valueOf(teamAScore));
        scoreOfTeamB.setText(String.valueOf(teamBScore));
        if ((teamAScore | teamBScore) >= 40) {
            if (teamAScore >= 40)
                intent.putExtra("Winner", "Team A");
            else
                intent.putExtra("Winner", "Team B");

            startActivity(intent);
        }
    }
}
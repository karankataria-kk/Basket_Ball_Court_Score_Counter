package com.example.android.basketballcourtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    int scoreA=0,scoreB=0;
    public void addThreeForTeamA(View v){
        scoreA=scoreA+3;
        displayForTeamA(scoreA);
    }
    public void addOneForTeamA(View v){
        scoreA=scoreA+1;
        displayForTeamA(scoreA);
    }
    public void addTwoForTeamA(View v){
        scoreA=scoreA+2;
        displayForTeamA(scoreA);
    }

    public void reset_it(View v){
        scoreA=0;
        scoreB=0;
        displayForTeamB(scoreB);
        displayForTeamA(scoreA);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreeForTeamB(View v){
        scoreB=scoreB+3;
        displayForTeamB(scoreB);
    }
    public void addOneForTeamB(View v){
        scoreB=scoreB+1;
        displayForTeamB(scoreB);
    }
    public void addTwoForTeamB(View v){
        scoreB=scoreB+2;
        displayForTeamB(scoreB);
    }
}

package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int score =0;
    int scoreB=0;
    public void addThreeForTeamA(View v){
        score+=3;
        displayForTeamA(score);
    }
    public void addTwoForTeamA(View v){
        score+=2;
        displayForTeamA(score);
    }
    public void addOneForTeamA(View v){
        score+=1;
        displayForTeamA(score);
    }
    public void reset(View v){
        score = 0 ;
        scoreB =0;
        displayForTeamA(score);
        displayForTeamB(scoreB);
    }
    /**
     * Displays the given score for Team A.
     */

    public void addThreeForTeamB(View v){
        scoreB+=3;
        displayForTeamB(scoreB);
    }
    public void addTwoForTeamB(View v){
        scoreB+=2;
        displayForTeamB(scoreB);
    }
    public void addOneForTeamB(View v){
        scoreB+=1;
        displayForTeamB(scoreB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}

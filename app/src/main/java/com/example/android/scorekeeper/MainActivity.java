package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;
    int yellowTeamA = 0;
    int yellowTeamB = 0;
    int redTeamA = 0;
    int redTeamB = 0;
    TextView scoreView1;
    TextView scoreView2;
    TextView foulView1;
    TextView foulView2;
    TextView yellowView1;
    TextView yellowView2;
    TextView redView1;
    TextView redView2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //findViewById for each TextView
        scoreView1 = (TextView) findViewById(R.id.team_a_score);
        scoreView2 = (TextView) findViewById(R.id.team_b_score);
        foulView1 = (TextView) findViewById(R.id.a_display_foul);
        foulView2 = (TextView) findViewById(R.id.b_display_foul);
        yellowView1 = (TextView) findViewById(R.id.a_display_yellow);
        yellowView2 = (TextView) findViewById(R.id.b_display_yellow);
        redView1 = (TextView) findViewById(R.id.a_display_red);
        redView2 = (TextView) findViewById(R.id.b_display_red);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayScoreForTeamA(int score) {
        //TextView scoreView1 = (TextView) findViewById(R.id.team_a_score);
        scoreView1.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayScoreForTeamB(int score) {
        scoreView2.setText(String.valueOf(score));
    }

    /**
     * Adds and displays one goal for team A.
     */
    public void addGoalForTeamA(View v){
        scoreTeamA = scoreTeamA + 1;
        displayScoreForTeamA(scoreTeamA);
    }

    /**
     * Adds and displays one goal for team B.
     */
    public void addGoalForTeamB(View v){
        scoreTeamB = scoreTeamB + 1;
        displayScoreForTeamB(scoreTeamB);
    }

    /**
     * Displays foul count for team A.
     */
    public void displayFoulForTeamA(int foul) {
        foulView1.setText(String.valueOf(foul));
    }

    /**
     * Displays foul count for team B.
     */
    public void displayFoulForTeamB(int foul) {
        foulView2.setText(String.valueOf(foul));
    }

    /**
     * Adds and displays one foul for team A.
     */
    public void addFoulForTeamA(View v){
        foulTeamA = foulTeamA + 1;
        displayFoulForTeamA(foulTeamA);
    }

    /**
     * Adds and displays one foul for team A.
     */
    public void addFoulForTeamB (View v){
        foulTeamB = foulTeamB + 1;
        displayFoulForTeamB(foulTeamB);
    }

    /**
     * Displays yellow card count for team A.
     */
    public void displayYellowForTeamA(int yellow){
        yellowView1.setText(String.valueOf(yellow));
    }

    /**
     * Displays yellow card count for team B.
     */
    public void displayYellowForTeamB(int yellow){
        yellowView2.setText(String.valueOf(yellow));
    }

    /**
     * Adds and displays one yellow card for team A.
     */
    public void addYellowForTeamA(View v){
        yellowTeamA = yellowTeamA + 1;
        displayYellowForTeamA(yellowTeamA);
    }

    /**
     * Adds and displays one yellow card for team B.
     */
    public void addYellowForTeamB(View v){
        yellowTeamB = yellowTeamB + 1;
        displayYellowForTeamB(yellowTeamB);
    }

    /**
     * Displays red card count for team A.
     */
    public void displayRedForTeamA(int red){
        redView1.setText(String.valueOf(red));
    }

    /**
     * Displays red card count for team B.
     */
    public void displayRedForTeamB(int red){
        redView2.setText(String.valueOf(red));
    }

    /**
     * Adds and displays one red card for team A.
     */
    public void addRedForTeamA(View v){
        redTeamA = redTeamA + 1;
        displayRedForTeamA(redTeamA);
    }

    /**
     * Adds and displays one red card for team B.
     */
    public void addRedForTeamB(View v){
        redTeamB = redTeamB + 1;
        displayRedForTeamB(redTeamB);
    }

    /**
     *
     * Resets the score for both teams.
     */
    public void resetScore(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        yellowTeamA = 0;
        yellowTeamB = 0;
        redTeamA = 0;
        redTeamB = 0;
        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayFoulForTeamA(foulTeamA);
        displayFoulForTeamB(foulTeamB);
        displayYellowForTeamA(yellowTeamA);
        displayYellowForTeamB(yellowTeamB);
        displayRedForTeamA(redTeamA);
        displayRedForTeamB(redTeamB);
    }
}

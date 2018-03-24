package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA=0;
    int scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayScoreA(int number){
        TextView textScoreA = (TextView) findViewById(R.id.text_score_a);
        textScoreA.setText("" + number);
    }

    public void displayScoreB(int number){
        TextView textScoreB = (TextView) findViewById(R.id.text_score_b);
        textScoreB.setText("" + number);
    }

    public void addScoreA(View view){
        int points = Integer.parseInt(view.getTag().toString());
       scoreA=scoreA+points;
       displayScoreA(scoreA);
    }

    public void addScoreB(View view){
        int points = Integer.parseInt(view.getTag().toString());
        scoreB=scoreB+points;
        displayScoreB(scoreB);
    }

    public void reset(View view){
        scoreA=0;
        scoreB=0;
        displayScoreA(scoreA);
        displayScoreB(scoreB);
    }
}

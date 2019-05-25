package com.example.android.a9ballpoolscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int player1Wins = 0;
    int player1Fouls = 0;
    int player1Breaks = 0;
    int player2Wins = 0;
    int player2Fouls = 0;
    int player2Breaks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addMatchWinForPlayer1 (View v) {
        player1Wins += 1;
        displayPlayer1Wins(player1Wins);
    }
    public void addFoulForPlayer1 (View v) {
        player1Fouls += 1;
        displayPlayer1Fouls(player1Fouls);
    }
    public void addGoldenBreakForPlayer1 (View v) {
        player1Breaks += 1;
        displayPlayer1Breaks(player1Breaks);
    }
    public void addMatchWinForPlayer2 (View v) {
        player2Wins += 1;
        displayPlayer2Wins(player2Wins);
    }
    public void addFoulForPlayer2 (View v) {
        player2Fouls += 1;
        displayPlayer2Fouls(player2Fouls);
    }
    public void addGoldenBreakForPlayer2 (View v) {
        player2Breaks += 1;
        displayPlayer2Breaks(player2Breaks);
    }
    public void resetScores (View v) {
        player1Wins = 0;
        player1Fouls = 0;
        player1Breaks = 0;
        player2Wins = 0;
        player2Fouls = 0;
        player2Breaks = 0;
        displayPlayer1Wins(player1Wins);
        displayPlayer1Fouls(player1Fouls);
        displayPlayer1Breaks(player1Breaks);
        displayPlayer2Wins(player2Wins);
        displayPlayer2Fouls(player2Fouls);
        displayPlayer2Breaks(player2Breaks);
    }


    private void displayPlayer1Wins (int i) {
        TextView wins = findViewById(R.id.match_wins_player1);
        wins.setText(String.valueOf(i));
    }
    private void displayPlayer1Fouls (int i) {
        TextView fouls = findViewById(R.id.fouls_player1);
        fouls.setText(String.valueOf(i));
    }
    private void displayPlayer1Breaks (int i) {
        TextView breaks = findViewById(R.id.golden_breaks_player1);
        breaks.setText(String.valueOf(i));
    }
    private void displayPlayer2Wins (int i) {
        TextView wins = findViewById(R.id.match_wins_player2);
        wins.setText(String.valueOf(i));
    }
    private void displayPlayer2Fouls (int i) {
        TextView fouls = findViewById(R.id.fouls_player2);
        fouls.setText(String.valueOf(i));
    }
    private void displayPlayer2Breaks (int i) {
        TextView breaks = findViewById(R.id.golden_breaks_player2);
        breaks.setText(String.valueOf(i));
    }

}
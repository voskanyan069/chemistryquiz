package com.quiz.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ScoresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores);
        scores();
    }

    public void scores() {
        final TextView scores_text = (TextView)findViewById(R.id.scores_text);
        int sum = 0;

        for (int i = 0; i < Scores.scores.length; i += 1) {
            sum += Scores.scores[i];
        }

        try {
            scores_text.setText(Integer.toString(sum));
        }
        catch (Exception NotFoundException) {
            Toast.makeText(
                    ScoresActivity.this, "ERROR", Toast.LENGTH_LONG
            ).show();
        }
    }
}

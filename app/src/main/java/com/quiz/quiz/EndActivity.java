package com.quiz.quiz;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.stream.*;


public class EndActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        checkScores();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void checkScores() {
        Button check_scores = (Button)findViewById(R.id.btn_check);
        final TextView sc_text = (TextView)findViewById(R.id.sc_text);

        System.out.println(Arrays.toString(Scores.scores));

        check_scores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(Arrays.toString(Scores.scores));
                Intent intent = new Intent("com.quiz.quiz.ScoresActivity");
                startActivity(intent);
            }
        });
    }
}

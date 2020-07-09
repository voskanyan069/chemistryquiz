package com.quiz.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.Arrays;

public class Task3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task3);
        answerCheck();
        Skip();
    }

    public void answerCheck() {
        final EditText answer = (EditText)findViewById(R.id.edit_answer);
        Button btn_check = (Button)findViewById(R.id.btn_answer);

        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (answer.getText().toString().toLowerCase()) {
                    case "10":
                    case "տաս":
                        Scores.scores[3] = 5;
                        break;
                    default:
                        Scores.scores[3] = -2;
                }
                System.out.println(Arrays.toString(Scores.scores));
                Intent intent = new Intent("com.quiz.quiz.Task4Activity");
                startActivity(intent);
            }
        });
    }

    public void Skip() {
        ImageView arrow_next = (ImageView)findViewById(R.id.arrow_next);
        ImageView arrow_prev = (ImageView)findViewById(R.id.arrow_prev);

        arrow_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.quiz.quiz.Task4Activity");
                startActivity(intent);
            }
        });

        arrow_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.quiz.quiz.Task2Activity");
                startActivity(intent);
            }
        });
    }
}

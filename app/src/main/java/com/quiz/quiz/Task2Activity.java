package com.quiz.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.Arrays;

public class Task2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);
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
                    case "հիւանդագին հակման":
                    case "հիվանդագին հակման":
                    case "հակման":
                        Scores.scores[2] = 5;
                        break;
                    default:
                        Scores.scores[2] = -2;
                }
                System.out.println(Arrays.toString(Scores.scores));
                Intent intent = new Intent("com.quiz.quiz.Task3Activity");
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
                Intent intent = new Intent("com.quiz.quiz.Task3Activity");
                startActivity(intent);
            }
        });

        arrow_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.quiz.quiz.Task1Activity");
                startActivity(intent);
            }
        });
    }
}

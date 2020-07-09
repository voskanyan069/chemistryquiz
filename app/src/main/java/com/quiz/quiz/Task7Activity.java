package com.quiz.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;

import java.util.Arrays;

public class Task7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task7);
        Checked();
        Answer();
        Skip();
    }

    public void Checked() {
        RadioGroup answer_group = (RadioGroup) findViewById(R.id.answer_group);

        answer_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.answer_2:
                    case R.id.answer_3:
                    case R.id.answer_4:
                        Scores.scores[7] = -2;
                        break;
                    case R.id.answer_1:
                        Scores.scores[7] = 5;
                }
            }
        });
    }

    public void Answer() {
        Button btn_check = (Button)findViewById(R.id.btn_answer);

        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(Arrays.toString(Scores.scores));
                Intent intent = new Intent("com.quiz.quiz.Task8Activity");
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
                Intent intent = new Intent("com.quiz.quiz.Task8Activity");
                startActivity(intent);
            }
        });

        arrow_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.quiz.quiz.Task6Activity");
                startActivity(intent);
            }
        });
    }
}

package com.quiz.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Arrays;

public class Task1Activity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);
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
                    case R.id.answer_1:
                    case R.id.answer_2:
                    case R.id.answer_3:
                        Scores.scores[1] = -2;
                        break;
                    case R.id.answer_4:
                        Scores.scores[1] = 5;
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
                Intent intent = new Intent("com.quiz.quiz.Task2Activity");
                startActivity(intent);
            }
        });
    }

    public void Skip() {
        ImageView arrow_next = (ImageView)findViewById(R.id.arrow_next);

        arrow_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.quiz.quiz.Task2Activity");
                startActivity(intent);
            }
        });
    }
}

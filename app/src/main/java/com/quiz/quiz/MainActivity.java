package com.quiz.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button btn_start;
    private Button btn_info;
    private Button btn_feedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        btn_start = (Button)findViewById(R.id.btn_start);
        btn_info = (Button)findViewById(R.id.btn_info);
        btn_feedback = (Button)findViewById(R.id.btn_feedback);

        btn_start.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick (View v) {
                        Intent intent = new Intent("com.quiz.quiz.Task1Activity");
                        startActivity(intent);
                    }
                }
        );

        btn_info.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.quiz.quiz.InfoActivity");
                        startActivity(intent);
                    }
                }
        );

        btn_feedback.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.quiz.quiz.FeedbackActivity");
                        startActivity(intent);
                    }
                }
        );
    }
}

package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    int yourScore = 0;
    int numberOfQuestions = 4;
//    private RadioGroup radioQuestionGroup;
//    private RadioButton radioOptionButton;
//    private Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked_Q1(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
//        switch (view.getId()) {
        int id = view.getId();
        if (id == R.id.option_1A) {
            if (checked)
                yourScore += 1;

            makeText(this, "YAY!!! CORRECT", LENGTH_SHORT).show();

        }
        else if (id == R.id.option_1B) {
            if (checked)
                makeText(this, "INCORRECT", LENGTH_SHORT).show();
        }


        else if (id == R.id.option_1C) {
            if (checked)
                makeText(this, "INCORRECT", LENGTH_SHORT).show();
        }

        else if (id == R.id.option_1D){
            if (checked)
                    makeText(this, "INCORRECT", LENGTH_SHORT).show();

        }

    }


    public void onRadioButtonClicked_Q2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked

        int id = view.getId();
        if (id == R.id.option_2A) {

            if (checked)
                makeText(this, "INCORRECT", LENGTH_SHORT).show();
        }

        else if (id == R.id.option_2B) {
            if (checked)
                makeText(this, "INCORRECT", LENGTH_SHORT).show();
        }

        else if (id == R.id.option_2C){
            if (checked)
                makeText(this, "INCORRECT", LENGTH_SHORT).show();
        }

        else if (id == R.id.option_2D){
            if (checked)
                yourScore += 1;

            makeText(this, "YAY!!! CORRECT", LENGTH_SHORT).show();
        }

    }

    public void onRadioButtonClicked_Q3(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        int id = view.getId();

        if (id == R.id.option_3A) {
            if (checked)
                makeText(this, "INCORRECT", LENGTH_SHORT).show();
        }

        else if (id == R.id.option_3B) {
            if (checked)
                makeText(this, "INCORRECT", LENGTH_SHORT).show();
        }

        else if (id == R.id.option_3C){
            if (checked)
                yourScore += 1;

            makeText(this, "YAY!!! CORRECT", LENGTH_SHORT).show();
        }

        else if (id == R.id.option_3D){
            if (checked)
                makeText(this, "INCORRECT", LENGTH_SHORT).show();
        }

    }

    public void onRadioButtonClicked_Q4(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        int id = view.getId();

        if (id == R.id.option_4A) {
            if (checked)
                makeText(this, "INCORRECT", LENGTH_SHORT).show();
        }

        else if (id == R.id.option_4B) {
            if (checked)
            makeText(this, "YAY!!! CORRECT", LENGTH_SHORT).show();
            yourScore += 1;


        }

        else if (id == R.id.option_4C){
            if (checked)

            makeText(this, "INCORRECT", LENGTH_SHORT).show();
        }

        else if (id == R.id.option_4D){
            if (checked)
                makeText(this, "INCORRECT", LENGTH_SHORT).show();
        }

    }


    public void submitAnswers(View view) {
        makeText(this, "You scored " + yourScore + " out of " + numberOfQuestions, LENGTH_SHORT).show();
        displayScore(yourScore);

    }

    private void displayScore(int yourScore) {
        TextView yourScoreTextView;
        yourScoreTextView = findViewById(R.id.total_score);
        yourScoreTextView.setText("Score: " + yourScore);
    }


    public void resetAnswers(View view) {
        yourScore = 0;
        displayScore(yourScore);

        RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.Q1);
        radioGroup1.clearCheck();

        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.Q2);
        radioGroup2.clearCheck();

        RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.Q3);
        radioGroup3.clearCheck();

        RadioGroup radioGroup4 = (RadioGroup) findViewById(R.id.Q4);
        radioGroup4.clearCheck();
    }

    }





package com.android.example.myquizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText q1EditText;
    RadioButton q2RadioButton, q4RadioButton, q5RadioButton;
    CheckBox q3CheckBox1, q3CheckBox2, q3CheckBox3;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is used to submit the answers of the quiz
     * @param view
     */
    public void submitAnswer(View view){
        score = 0;
        //Question 1
        q1EditText = (EditText) findViewById(R.id.edit_text_q1);
        String answerQ1 = q1EditText.getText().toString();
        if(answerQ1.equals("3")){
            score++;
        }

        //Question 2
        q2RadioButton = (RadioButton) findViewById(R.id.correct_answer_q2);
        if(q2RadioButton.isChecked()){
            score++;
        }

        //Question 3
        q3CheckBox1 = (CheckBox) findViewById(R.id.checkBoxAnswer3A);
        q3CheckBox2 = (CheckBox) findViewById(R.id.checkBoxAnswer3B);
        q3CheckBox3 = (CheckBox) findViewById(R.id.checkBoxAnswer3C);
        if(q3CheckBox1.isChecked() && q3CheckBox2.isChecked() && !q3CheckBox3.isChecked()){
            score++;
        }

        //Question 4
        q4RadioButton = (RadioButton) findViewById(R.id.correct_answer_q4);
        if(q4RadioButton.isChecked()){
            score++;
        }

        //Question 5
        q5RadioButton = (RadioButton) findViewById(R.id.correct_answer_q5);
        if(q5RadioButton.isChecked()){
            score++;
        }

        //Result
        if(score == 5){
            Toast.makeText(this, "Perfect! " + "You got " + score + " out of 5", Toast.LENGTH_SHORT).show();
        }else if(score == 4){
            Toast.makeText(this, "Good job! " + "You got " + score + " out of 5", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Try again! " + "You got " + score + " out of 5", Toast.LENGTH_SHORT).show();
        }
    }
}

package com.strobertchs.methodmadness;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void calculateAvg(View v){

        EditText student1 = (EditText) findViewById(R.id.editText);
        EditText student2 = (EditText) findViewById(R.id.editText2);
        EditText student3 = (EditText) findViewById(R.id.editText3);
        EditText student4 = (EditText) findViewById(R.id.editText4);

        String first= student1.getText().toString();
        String second= student2.getText().toString();
        String third= student3.getText().toString();
        String fourth= student4.getText().toString();
        float finalFirst=Integer.parseInt(first);
        float finalSecond=Integer.parseInt(second);
        float finalThird=Integer.parseInt(third);
        float finalFourth=Integer.parseInt(fourth);

        float avg = (finalFirst+finalSecond+finalThird+finalFourth)/4;

        String finalAvg = Float.toString(avg);







        TextView textout = (TextView) findViewById(R.id.textView3);
        textout.setText(finalAvg);


    }
}


package com.strobertchs.methodmadness;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<EditText> initialAverages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialAverages = new ArrayList<>();
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

    public void addLine(View view) {
        EditText entry = new EditText(this);
        entry.setInputType(InputType.TYPE_CLASS_NUMBER);
        ((LinearLayout) findViewById(R.id.initialLayout)).addView(entry);
        initialAverages.add(entry);
    }
}


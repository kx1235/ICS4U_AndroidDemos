package com.strobertchs.methodmadness;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    float initialAverage = 0;




    public void intAvg (View v){
        /*
        EditText numInitStudent = (EditText) findViewById(R.id.editText3);
        String strNumInit = numInitStudent.getText().toString();
        float intNumInit = Integer.parseInt(strNumInit);
        */


        EditText initMarks = (EditText) findViewById(R.id.editText);
        String strMarks = initMarks.getText().toString();
        String initMarkList[] = strMarks.split("\n");


        /*
        String outprint = initMarkList[0]+"\n" + initMarkList[1]+initMarkList[2];
        TextView textout = (TextView) findViewById(R.id.textView3);

        textout.setText(outprint);
        */


        float sum = 0;
        for (int i = 0; i< initMarkList.length; i++){
            String mark = initMarkList[i];
            float intMark = Float.parseFloat(mark);
            sum = sum+intMark;
            /*
            String fMark = Float.toString(sum);
            TextView textout = (TextView) findViewById(R.id.textView3);
            String outprint = fMark +"\n" ;
            textout.setText(outprint);
            */
        }

        initialAverage = sum/initMarkList.length;
        String strInitAvg = Float.toString(initialAverage);
        TextView textout = (TextView) findViewById(R.id.textView3);
        textout.setText(strInitAvg);







      }







/*

        EditText student1 = (EditText) findViewById(R.id.editText;
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
*/




        /*EditText entry = new EditText (this);
        entry.setId(counter);
        entry.setInputType(InputType.TYPE_CLASS_NUMBER);
        ((LinearLayout) findViewById(R.id.initialLayout)).addView(entry);
        */

}

package com.strobertchs.methodmadness;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
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

    int counter = 0;

    public void intAvg (View v){
        //initial student marks
        EditText initMarks = (EditText) findViewById(R.id.editText);
        String strMarks = initMarks.getText().toString();
        String initMarkList[] = strMarks.split("\n");
        //new student marks
        EditText newMarks = (EditText) findViewById(R.id.editText2);
        String strNewMarks = newMarks.getText().toString();
        String newMarkList[] = strNewMarks.split("\n");

        counter = counter + 1;

        float sum = 0;
        for (int i = 0; i< initMarkList.length; i++){
            String mark = initMarkList[i];
            float intMark = Float.parseFloat(mark);
            sum = sum+intMark;

        }



        float newSum = 0;
        float tempSum = 0;
        for (int i=0; i < counter; i++){
            String addMark = newMarkList[i];
            float flAddmark = Float.parseFloat(addMark);
            tempSum = tempSum + flAddmark;

            newSum = tempSum + sum;
        }





        initialAverage = sum/initMarkList.length;
        int totalStudent = initMarkList.length + counter;
        float newAverage = newSum/totalStudent;

        String strInitAvg = Float.toString(initialAverage);
        TextView textout1 = (TextView) findViewById(R.id.textView3);
        String output1 = "Initial average is " + strInitAvg + " percent";
        textout1.setText(output1);

        String strNewAverage = Float.toString(newAverage);
        String strCounter = Integer.toString(counter);
        TextView textout2 = (TextView) findViewById(R.id.textView4);
        String output2 = "New Average after student " + strCounter + " is " + strNewAverage;
        textout2.setText(output2);






      }







            /*String strNewAvg = Float.toString(newAverage);

            TextView textout = (TextView) findViewById(R.id.textView3);
            String outprint = "The new average after student " + (i+1)+ " is" + "" + strNewAvg;
            textout.setText(outprint);
            */

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



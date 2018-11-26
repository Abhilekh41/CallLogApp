package com.example.asahay.callog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String firstNumber = "";
    TextView textView;
    Double result=0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickZero(View view)
    {
        textView =  findViewById(R.id.outputTextView);
        firstNumber=firstNumber+'0';
        textView.setText(firstNumber);
    }
    public void onClickOne(View view)
    {
        textView = findViewById(R.id.outputTextView);
        firstNumber = firstNumber+"1";
        textView.setText(firstNumber);
    }
    public void onClickTwo(View view)
    {
        textView = findViewById(R.id.outputTextView);
        firstNumber = firstNumber+"2";
        textView.setText(firstNumber);
    }
    public void onClickThree(View view)
    {
        textView = findViewById(R.id.outputTextView);
        firstNumber = firstNumber+"3";
        textView.setText(firstNumber);
    }
    public void onClickFour(View view)
    {
        textView = findViewById(R.id.outputTextView);
        firstNumber = firstNumber+"4";
        textView.setText(firstNumber);
    }
    public void onClickFive(View view)
    {
        textView = findViewById(R.id.outputTextView);
        firstNumber = firstNumber+"5";
        textView.setText(firstNumber);
    }
    public void onClickSix(View view)
    {
        textView = findViewById(R.id.outputTextView);
        firstNumber= firstNumber+"6";
        textView.setText(firstNumber);
    }
    public void onClickSeven(View view)
    {
        textView = findViewById(R.id.outputTextView);
        firstNumber = firstNumber+"7";
        textView.setText(firstNumber);
    }
    public void onClickEight(View view)
    {
        textView = findViewById(R.id.outputTextView);
        firstNumber = firstNumber+"8";
        textView.setText(firstNumber);
    }
    public void onClickNine(View view)
    {
        textView = findViewById(R.id.outputTextView);
        firstNumber = firstNumber+"9";
        textView.setText(firstNumber);
    }
    public void onClickPlus(View view)
    {
        textView = findViewById(R.id.outputTextView);
        firstNumber=firstNumber+"+";
        textView.setText(firstNumber);

    }
    public void onClickMultiply(View view)
    {
        textView = findViewById(R.id.outputTextView);
        firstNumber = firstNumber+"3";
        textView.setText(firstNumber);
    }
    public void onClickDivide(View view)
    {
        textView = findViewById(R.id.outputTextView);
        firstNumber= firstNumber+"3";
        textView.setText(firstNumber);
    }
    public void onClickDel(View view)
    {
        textView = findViewById(R.id.outputTextView);
        firstNumber="";
        textView.setText(firstNumber);
    }
    public void onClickDot(View view)
    {
        textView = findViewById(R.id.outputTextView);
        firstNumber = firstNumber+".";
        textView.setText(firstNumber);
    }
    public void onClickMinus(View view)
    {
        textView = findViewById(R.id.outputTextView);
        textView.setText("-");
    }
    public void onClickEquals(View view)
    {
        TextView textView = findViewById(R.id.outputTextView);
        String str = textView.getText().toString();
        if(str.matches("[0-9]+[+][0-9]+"))
        {
            Log.i("Inside","the regex");
            String[] additionString = str.split("[+]");
            Log.i("This"+additionString[0],"And this"+additionString[1]);
            result=(Double.parseDouble(additionString[0])+Double.parseDouble(additionString[1]));
            Log.i("the result"+result,"i guess you got it");
        }
        else
        {
            Log.i("false","it doesn't works");
        }
        textView.setText(result.toString());
    }
}

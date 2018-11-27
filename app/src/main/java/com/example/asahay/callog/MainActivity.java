package com.example.asahay.callog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String firstNumber = "";
    TextView textView;
    Double result=0.0;
    String operator="";
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
    public  void onClickPlus(View view)
    {
        textView = findViewById(R.id.outputTextView);
        String str = textView.getText().toString();
        Integer i = str.length();
        operator="+";
        String[] stringArray = str.split("[+]");
        if(stringArray.length==2)
        {
            calculatingValue(Double.parseDouble(stringArray[0]),Double.parseDouble(stringArray[1]),operator);
            textView.setText(result.toString());
        }
        else if(stringArray.length==1)
        {
            firstNumber = firstNumber +"+";
            textView.setText(firstNumber);
        }
        else
        {
            Toast.makeText(this, "Only two numbers at a time", Toast.LENGTH_SHORT).show();
        }

    }
    public void onClickMultiply(View view)
    {
        textView = findViewById(R.id.outputTextView);
        String str = textView.getText().toString();
        Integer i = str.length();
        operator="×";
        String[] stringArray = str.split("[×]");
        if(stringArray.length==2)
        {
            calculatingValue(Double.parseDouble(stringArray[0]),Double.parseDouble(stringArray[1]),operator);
            textView.setText(result.toString());
        }
        else if(stringArray.length==1)
        {
            firstNumber = firstNumber +"×";
            textView.setText(firstNumber);
        }
        else
        {
            Toast.makeText(this, "Only two numbers at a time", Toast.LENGTH_SHORT).show();
        }
    }
    public void onClickDivide(View view)
    {
        textView = findViewById(R.id.outputTextView);
        String str = textView.getText().toString();
        Integer i = str.length();
        operator="÷";
        String[] stringArray = str.split("[÷]");
        if(stringArray.length==2)
        {
            calculatingValue(Double.parseDouble(stringArray[0]),Double.parseDouble(stringArray[1]),operator);
            textView.setText(result.toString());
        }
        else if(stringArray.length==1)
        {
            firstNumber = firstNumber +"÷";
            textView.setText(firstNumber);
        }
        else
        {
            Toast.makeText(this, "Only two numbers at a time", Toast.LENGTH_SHORT).show();
        }
    }
    public void onClickDel(View view)
    {
        textView = findViewById(R.id.outputTextView);
        firstNumber="";
        result=0.0;
        textView.setText(result.toString());
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
        String str = textView.getText().toString();
        Integer i = str.length();
        operator="-";
        String[] stringArray = str.split("[-]");
        if(stringArray.length==2)
        {
            calculatingValue(Double.parseDouble(stringArray[0]),Double.parseDouble(stringArray[1]),operator);
            textView.setText(result.toString());
        }
        else if(stringArray.length==1)
        {
            firstNumber = firstNumber +"-";
            textView.setText(firstNumber);
        }
        else
        {
            Toast.makeText(this, "Only two numbers at a time", Toast.LENGTH_SHORT).show();
        }
    }
    public void onClickEquals(View view)
    {
        TextView textView = findViewById(R.id.outputTextView);
        String str = textView.getText().toString();
        String[] stringArray = str.split(operator);
        calculatingValue(Double.parseDouble(stringArray[0]),Double.parseDouble(stringArray[1]),operator);
        textView.setText(result.toString());
    }

    public void calculatingValue(Double i, Double j,String s)
    {

        switch (s)
        {
            case "+":
                result=i+j;
                break;
            case "-":
                result=i-j;
                break;
            case "×":
                result=i*j;
                break;
            case "÷":
                result=i/j;
                break;
        }
    }
}

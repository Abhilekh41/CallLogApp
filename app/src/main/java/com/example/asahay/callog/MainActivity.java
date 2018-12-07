package com.example.asahay.callog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener {

    String firstNumber = "";
    TextView textView;
    Double result=0.0;
    String operator="";
    GestureDetector gestureDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         gestureDetector= new GestureDetector(this);
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
        if (str.isEmpty())
        {
            textView.setText(str);
        }
        else if(str.contains("+") || str.contains("×") || str.contains("÷"))
        {
            textView.setText(str);
        }
        else
        {
            if(str.endsWith("+"))
            {
                textView.setText(str);
            }
            else
            {
                operator="+";
                String[] stringArray = str.split("[+]");
                if(stringArray.length==2)
                {
                    calculatingValue(Double.parseDouble(stringArray[0]),
                            Double.parseDouble(stringArray[1]),operator);
                    textView.setText(result.toString());
                    firstNumber=result.toString();
                }
                else if(stringArray.length==1)
                {
                    firstNumber = firstNumber +"+";
                    textView.setText(firstNumber);
                }
                else
                {
                    Toast.makeText(this, "Only two numbers at a time",
                            Toast.LENGTH_SHORT).show();
                }
            }
        }

    }
    public void onClickMultiply(View view)
    {
        textView = findViewById(R.id.outputTextView);
        String str = textView.getText().toString();
        if (str.isEmpty())
        {
            textView.setText(str);
        }
        else if(str.contains("+") ||  str.contains("×") || str.contains("÷"))
        {
            textView.setText(str);
        }
        else
        {
            if(str.endsWith("×"))
            {
                textView.setText(str);
            }
            else
            {
                operator="×";
                String[] stringArray = str.split("[×]");
                if(stringArray.length==2)
                {
                    calculatingValue(Double.parseDouble(stringArray[0]),Double.parseDouble(stringArray[1]),operator);
                    textView.setText(result.toString());
                    firstNumber=result.toString();
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
        }
    }
    public void onClickDivide(View view)
    {
        textView = findViewById(R.id.outputTextView);
        String str = textView.getText().toString();
        if (str.isEmpty())
        {
            textView.setText(str);
        }
        else if(str.contains("+") || str.contains("×") || str.contains("÷"))
        {
            textView.setText(str);
        }
        else
        {
            if(str.endsWith("÷"))
            {
                textView.setText(str);
            }
            else
            {
                operator="÷";
                String[] stringArray = str.split("[÷]");
                if(stringArray.length==2)
                {
                    calculatingValue(Double.parseDouble(stringArray[0]),Double.parseDouble(stringArray[1]),operator);
                    textView.setText(result.toString());
                    firstNumber=result.toString();
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
        }
    }
    public void onClickDel(View view)
    {
        textView = findViewById(R.id.outputTextView);
        firstNumber="";
        result=0.0;
        textView.setText(firstNumber.toString());
    }
    public void onClickDot(View view)
    {
        textView = findViewById(R.id.outputTextView);
        if(!firstNumber.contains("."))
        {
            firstNumber = firstNumber+".";
            textView.setText(firstNumber);
        }
        else if(firstNumber.contains(".") && (firstNumber.contains("+") || firstNumber.contains("-") || firstNumber.contains("×") || firstNumber.contains("÷")))
        {
            firstNumber = firstNumber+".";
            textView.setText(firstNumber);
        }
        else
        {
            textView.setText(firstNumber);
        }

    }
    public void onClickMinus(View view)
    {
        textView = findViewById(R.id.outputTextView);
        String str = textView.getText().toString();
        if (str.isEmpty())
        {
            firstNumber=firstNumber+"-";
            textView.setText(firstNumber);
        }
        else
        {
            if(str.endsWith("-"))
            {
                textView.setText(str);
            }
            else
            {
                operator="-";
                String[] stringArray = str.split("[-]");
                if(stringArray.length==2)
                {
                    calculatingValue(Double.parseDouble(stringArray[0]),Double.parseDouble(stringArray[1]),operator);
                    textView.setText(result.toString());
                    firstNumber=result.toString();
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
        }
    }
    public void onClickEquals(View view)
    {
        TextView textView = findViewById(R.id.outputTextView);
        String str = textView.getText().toString();
        String[] stringArray = new String[2];
        if (str.contains("+") || str.contains("-") || str.contains("×") || str.contains("÷"))
        {
            switch (operator)
            {
                case "+":
                    stringArray = str.split("[+]");
                    break;
                case "-":
                    stringArray = str.split("[-]");
                    break;
                case "×":
                    stringArray = str.split("[×]");
                    break;
                case "÷":
                    stringArray = str.split("[÷]");
                    break;

            }
            if(stringArray.length==1)
            {
                textView.setText(str);
            }
            else
            {
                calculatingValue(Double.parseDouble(stringArray[0]),
                        Double.parseDouble(stringArray[1]),operator);
                textView.setText(result.toString());
                firstNumber=result.toString();
            }
        }
        else
        {
            textView.setText(str);
        }
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

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent downEvent, MotionEvent moveEvent, float v, float v1) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onFling(MotionEvent downEvent, MotionEvent moveEvent, float v, float v1) {
            boolean result = false;
            float diffX = moveEvent.getX()-downEvent.getX();
            float diffY = moveEvent.getY()-downEvent.getY();
            if(Math.abs(diffX)>Math.abs(diffY))
            {
                //right or left move
                if(Math.abs(diffX)>100 && Math.abs(v)>100)
                {
                    if(diffX>0)
                    {
                        onSwipeRight();
                    }
                    else{
                        onSwipeLeft();
                    }
                    result=true;
                }
            }
            else
                {
                    if(Math.abs(diffY)>100 && Math.abs(v1)>100)
                    {
                        if(diffY>0)
                        {
                            onSwipeBottom();
                        }
                        else
                        {
                            onSwipeTop();
                        }
                        result=true;
                    }
            }
            return result;
        }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gestureDetector .onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    private void onSwipeTop() {
        Toast.makeText(this,"SwipingTop",Toast.LENGTH_LONG).show();
    }
    private void onSwipeLeft() {
        Toast.makeText(this,"Swiping Left",Toast.LENGTH_LONG).show();
    }
    private void onSwipeRight() {
        Toast.makeText(this,"Swiping Right",Toast.LENGTH_LONG).show();
    }
    private void onSwipeBottom  () {
        Toast.makeText(this,"Swiping Bottom",Toast.LENGTH_LONG).show();
    }
}

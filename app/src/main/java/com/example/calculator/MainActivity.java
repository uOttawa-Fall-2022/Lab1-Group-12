package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView screen;
    private double number1, number2;
    private enum Control{
        PLUS,MINUS,MULTIPLY,DIVIDED
    }
    private Control control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen=(TextView) findViewById(R.id.screen);
        screen.setText("");
    }
    public void TextOnClick(View view) {
        int BtnId = view.getId();
        switch (BtnId) {
            case R.id.btn1:
                screen.setText(screen.getText() + "1");
                break;
            case R.id.btn2:
                screen.setText(screen.getText() + "2");
                break;
            case R.id.btn3:
                screen.setText(screen.getText() + "3");
                break;
            case R.id.btn4:
                screen.setText(screen.getText() + "4");
                break;
            case R.id.btn5:
                screen.setText(screen.getText() + "5");
                break;
            case R.id.btn6:
                screen.setText(screen.getText() + "6");
                break;
            case R.id.btn7:
                screen.setText(screen.getText() + "7");
                break;
            case R.id.btn8:
                screen.setText(screen.getText() + "8");
                break;
            case R.id.btn9:
                screen.setText(screen.getText() + "9");
                break;
            case R.id.btn0:
                if(screen.getText().equals("0") || screen.getText().equals("0.0")){
                    screen.setText("0");
                }
                else {
                    screen.setText(screen.getText() + "0");
                }
                break;
            case R.id.btn00:
                if(screen.getText().equals("0") || screen.getText().equals("")|| screen.getText().equals("0.0")) {
                    screen.setText("0");
                }else {
                    screen.setText(screen.getText() + "00");
                }
                break;
            case R.id.btnPoint:
                screen.setText(screen.getText() + ".");
                break;
        }
    }
    public void PlusMethod(View view){
        if (screen.getText().equals("")|| screen == null){
            screen.setText("");
        }
        else{number1=Double.parseDouble(screen.getText().toString());
            screen.setText("");
            control=Control.PLUS;
        }



    }
    public void MinusMethod(View view) {
        if (screen.getText().equals("")|| screen == null || screen.getText().equals("-")){
            screen.setText("-");
        }
        else {
            number1 = Double.parseDouble(screen.getText().toString());
            screen.setText("");
            control = Control.MINUS;
        }
    }
    public void MultiplyMethod(View view){
        if (screen.getText().equals("")|| screen == null){
            screen.setText("");
        }
        else {
            number1 = Double.parseDouble(screen.getText().toString());
            screen.setText("");
            control = Control.MULTIPLY;
        }
    }
    public void DividedMethod(View view){
        if (screen.getText().equals("")|| screen == null){
            screen.setText("");
        }
        else {
            number1 = Double.parseDouble(screen.getText().toString());
            screen.setText("");
            control = Control.DIVIDED;
        }
    }
    public void EqualMethod(View view){
        int Check = 1;
        if (screen.getText().equals("")|| screen == null){
            screen.setText("");
            Check = 0;}
        else{number2=Double.parseDouble(screen.getText().toString());}

        if(control==Control.PLUS && Check == 1){
            double output=number1+number2;
            if ((int)output == output){
                screen.setText( Integer.toString((int)output));

            }
            else{screen.setText(Double.toString(output));}

        }else if(control==Control.MINUS && Check == 1){
            double output=number1-number2;
            if ((int)output == output){
                screen.setText(Integer.toString((int)output));
            }
            else{screen.setText(Double.toString(output));}


        }else if(control==Control.MULTIPLY && Check == 1){
            double output=number1*number2;
            if ((int)output == output){
                screen.setText( Integer.toString((int)output));
            }
            else{screen.setText(Double.toString(output));}


        }else if(Check == 1){
            double output=number1/number2;
            if ((int)output == output){
                screen.setText( Integer.toString((int)output));
            }
            else{screen.setText(Double.toString(output));}
        }
    }
    public void SetClean(View view){
        screen.setText("");
        number1 = 0;
        number2 = 0;
    }


}
package com.example.calcolatrice;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = "MainActivity";
    EditText mResult;
    EditText mFirst;
    EditText mSecond;

    double result;
    double firstNumber;
    double secondNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        mResult = findViewById(R.id.editText_result);
        mFirst =  findViewById(R.id.editText_first);
        mSecond = findViewById(R.id.editText_second);
    }

    public void doPlus(View view) {
        firstNumber = Double.parseDouble(String.valueOf(mFirst.getText()));
        secondNumber = Double.parseDouble(String.valueOf(mSecond.getText()));
        result = firstNumber+secondNumber;
        mResult.setText(String.valueOf(result));
    }

    public void doMinus(View view) {
        firstNumber = Double.parseDouble(String.valueOf(mFirst.getText()));
        secondNumber = Double.parseDouble(String.valueOf(mSecond.getText()));
        result = firstNumber-secondNumber;
        mResult.setText(String.valueOf(result));
    }

    public void doTimes(View view) {
        firstNumber = Double.parseDouble(String.valueOf(mFirst.getText()));
        secondNumber = Double.parseDouble(String.valueOf(mSecond.getText()));
        result = firstNumber*secondNumber;
        mResult.setText(String.valueOf(result));
    }

    public void doDivide(View view) {
        firstNumber = Double.parseDouble(String.valueOf(mFirst.getText()));
        secondNumber = Double.parseDouble(String.valueOf(mSecond.getText()));
        if(secondNumber==0){
            mResult.setText(String.valueOf("Errore"));
        }
        else{
            result = firstNumber/secondNumber;
            mResult.setText(String.valueOf(result));
        }

    }
}
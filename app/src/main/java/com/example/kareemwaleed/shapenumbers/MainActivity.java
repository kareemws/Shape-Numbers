package com.example.kareemwaleed.shapenumbers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkButton(View view)
    {
        EditText numberField = (EditText) findViewById(R.id.numberField);
        if(numberField.getText().toString().isEmpty())
            Toast.makeText(getApplicationContext(), "Enter a Number !", Toast.LENGTH_LONG).show();
        else
        {
            Number number = new Number(Integer.parseInt(numberField.getText().toString()));
            if(number.isTriangular() && number.isSquare())
                Toast.makeText(getApplicationContext(), number.getNumber() + " is both, triangular and sqaure number", Toast.LENGTH_LONG).show();
            else if(number.isTriangular())
                Toast.makeText(getApplicationContext(), number.getNumber() + " is a triangular number", Toast.LENGTH_LONG).show();
            else if(number.isSquare())
                Toast.makeText(getApplicationContext(), number.getNumber() + " is a square number", Toast.LENGTH_LONG).show();
            else
                Toast.makeText(getApplicationContext(), number.getNumber() + " is neither a square nor a triangular number", Toast.LENGTH_LONG).show();
            numberField.setText(null);
        }
    }
}

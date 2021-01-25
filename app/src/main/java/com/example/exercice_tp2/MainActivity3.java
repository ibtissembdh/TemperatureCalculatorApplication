package com.example.exercice_tp2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    EditText inputValue, CelsiusValue,kelvinValue;
    //Button conBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        inputValue=this.findViewById(R.id.inputValue);
        CelsiusValue=this.findViewById(R.id.CelsiusValue);
        kelvinValue=this.findViewById(R.id.kelvinValue);
        getSupportActionBar().setTitle("Fahrenheit");
    }

    public void convert(View v) {
        double  F = Double.parseDouble(inputValue.getText().toString());

        double K =((F +459.67) / 1.8);
        kelvinValue.setText(String.valueOf(K));

        double c =((F - 32) / 1.8);
        CelsiusValue.setText(String.valueOf(c));

    }



}
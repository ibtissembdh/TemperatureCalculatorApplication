package com.example.exercice_tp2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {


    EditText inputValue, CelsiusValue,FahrenheitValue;
    //Button conBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        inputValue=this.findViewById(R.id.inputValue);
        CelsiusValue=this.findViewById(R.id.CelsiusValue);
        FahrenheitValue=this.findViewById(R.id.FahrenheitValue);
        getSupportActionBar().setTitle("Kelvin");
    }

    public void convert(View v) {
        double  K = Double.parseDouble(inputValue.getText().toString());

        double F =((K * 1.8) - 459.67);
        FahrenheitValue.setText(String.valueOf(F));

        double c =( K - 273.15);
        CelsiusValue.setText(String.valueOf(c));

    }


}
package com.example.exercice_tp2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity2 extends AppCompatActivity {

    EditText inputValue, FahrenheitValue,kelvinValue;
   // Button conBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        inputValue=this.findViewById(R.id.inputValue);
        FahrenheitValue=this.findViewById(R.id.FahrenheitValue);
        kelvinValue=this.findViewById(R.id.kelvinValue);
        getSupportActionBar().setTitle("Celsius");
    }

    public void convert(View v) {
        double  c = Double.parseDouble(inputValue.getText().toString());

        double F =((c*1.8)+32);
        FahrenheitValue.setText(String.valueOf(F));

        double k =(c+ 273.15);
        kelvinValue.setText(String.valueOf(k));

    }


}

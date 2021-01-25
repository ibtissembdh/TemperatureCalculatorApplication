package com.example.exercice_tp2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button cl,kl,fh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cl = this.findViewById(R.id.cl);
        kl= this.findViewById(R.id.kl);
        fh = this.findViewById(R.id.fh);

        cl.setOnClickListener(v -> cl_Page());

        fh.setOnClickListener(v -> fh_Page());

        kl.setOnClickListener(v -> kl_Page());



    }

    //Activities
    public void cl_Page() {
        Intent intent1= new Intent(this, MainActivity2.class);
        startActivity(intent1);


    }

    public void fh_Page() {
        Intent intent2= new Intent(this, MainActivity3.class);
        startActivity(intent2);
    }

    public void kl_Page() {
        Intent intent3= new Intent(this, MainActivity4.class);
        startActivity(intent3);
    }

    //Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    //items
    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.celsiusItem:
                cl_Page(); return true;
            case R.id.FahrenheitItem:
                fh_Page();return true;
            case R.id.KelvinItem:
                kl_Page(); return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }




}
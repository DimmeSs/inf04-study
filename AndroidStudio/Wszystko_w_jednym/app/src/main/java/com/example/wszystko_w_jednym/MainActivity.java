package com.example.wszystko_w_jednym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Btlogo,BTzdj,BTsensor,BTdata,BTtime,BTdzwiek,BTfilmik,BTpoziome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Btlogo =findViewById(R.id.BTlogo);
        BTzdj =findViewById(R.id.BTzdj);
        BTsensor =findViewById(R.id.BTsensor);
        BTdata =findViewById(R.id.BTdata);
        BTtime =findViewById(R.id.BTtime);
        BTdzwiek =findViewById(R.id.BTdzwiek);
        BTfilmik =findViewById(R.id.BTfilmik);
        BTpoziome =findViewById(R.id.BTpoziome);


    }

    public void zdjecia(View view) {
        Intent i = new Intent(this,ZDJ.class);
        startActivity(i);
    }

    public void logowanie(View view) {
        Intent i = new Intent(this,logowanie.class);
        startActivity(i);
    }

    public void sensory(View view) {
        Intent i = new Intent(this,Sensor.class);
        startActivity(i);
    }

    public void data(View view) {
        Intent i = new Intent(this,Data.class);
        startActivity(i);
    }

    public void timer(View view) {
        Intent i = new Intent(this,timer.class);
        startActivity(i);
    }

    public void dzwiek(View view) {
        Intent i = new Intent(this,dzwiek.class);
        startActivity(i);
    }

    public void filmiki(View view) {
        Intent i = new Intent(this,filmik.class);
        startActivity(i);
    }
}

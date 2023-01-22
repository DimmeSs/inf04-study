package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView t;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String currentDateString = dateFormat.format(currentDate);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.bt1);
        t = findViewById(R.id.t);
        t.setText(currentDateString);
        int wynik = 5;

        b.setOnClickListener(view -> {
            Intent i = new Intent(this,MainActivity2.class);
            i.putExtra("siema",wynik);
            startActivity(i);
        });
    }
}
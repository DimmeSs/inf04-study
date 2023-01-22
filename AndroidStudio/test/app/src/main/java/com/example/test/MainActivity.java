package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button bt1;
    TextView tw1, tw2, tw3 , wyswie;
    EditText wpisztext1;
    Random rand;
    float ha, hb, wynik,dane;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = findViewById(R.id.bt1);
        tw1 = findViewById(R.id.tw1);
        tw2 = findViewById(R.id.textView2);
        tw3 = findViewById(R.id.textView3);
        wyswie = findViewById(R.id.wyswie);
        wpisztext1 = findViewById(R.id.wpisztext1);

        ha = rand.nextInt(20) + 1;
        tw2.setText(ha + "");
        hb = rand.nextInt(20) + 1;
        tw3.setText(hb + "");

        rand = new Random();
        wynik = 0;
        bt1.setOnClickListener(view -> {
            String dane = wpisztext1.getText().toString();
        });
        Randomizacjaa();
        sprawdz();
    }

    public void sprawdz() {
        String.(wpisztext1);
        if (wynik == wpisztext1) {
            wyswie.setText("goood");
        } else if (wynik != wpisztext1) {
            wyswie.setText("Zleee");
        } else {
            wyswie.setText("?");
        }

    }

    public void Randomizacjaa() {

        int r = rand.nextInt(4) + 1;
        switch (r) {
            case 1:
                tw1.setText("*");
                wynik = ha * hb;
                break;
            case 2:
                tw1.setText("/");
                wynik = ha / hb;
                break;
            case 3:
                tw1.setText("+");
                wynik = ha + hb;
                break;
            case 4:
                tw1.setText("-");
                wynik = ha - hb;
                break;
        }


    }
}
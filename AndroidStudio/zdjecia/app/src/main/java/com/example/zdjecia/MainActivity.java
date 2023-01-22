package com.example.zdjecia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    ImageView zdj;
    Button bt1, bt2,pobierz;
    EditText wpisz;
    TextView lista;
    int aktualne = 0;
    final int[] array = new int[]{R.drawable.b0, R.drawable.b1, R.drawable.b2, R.drawable.b4, R.drawable.b3};
    //ArrayList<Integer> array = new ArrayList(
     //       Arrays.asList(R.drawable.b0, R.drawable.b1, R.drawable.b2, R.drawable.b4, R.drawable.b3));
    ArrayList<String> pobieranie = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zdj = findViewById(R.id.imageView2);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        wpisz = findViewById(R.id.wpisz);
        pobierz = findViewById(R.id.pobierz);
        lista = findViewById(R.id.lista);
    }
    public void pobierz(View z){
        String s = wpisz.getText().toString();
        pobieranie.add(s);
        lista.setText(lista.getText().toString()+s+";\n");


    }

    public void zmienzdj(int n) {
        zdj.setImageDrawable(getDrawable(array[n]));
        //zdj.setImageDrawable(getDrawable(array.get(n)));
    }

    public void przod(View x) {
        if (aktualne < 4) {
            zmienzdj(++aktualne);
        }
    }

    public void tyl(View x) {
        if (aktualne > 0) {
            zmienzdj(--aktualne);
        }
    }

    protected void onStart() {
        super.onStart();
        zmienzdj(aktualne);
        //array.add(R.drawable.uno);


    }
}
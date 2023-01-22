package com.example.wszystko_w_jednym;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.animation.LayoutTransition;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class ZDJ extends AppCompatActivity {
    ImageView zdj;
    int aktualny = 0;
    int ilosc = 0;
    Button przod, tyl, dodaj, usun;
    TextView polubienia;
    final int[] album = new int[]{R.drawable.ph1, R.drawable.ph2, R.drawable.ph3, R.drawable.zdj_3};
    Switch switchi;
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zdj);
        zdj = findViewById(R.id.img);
        przod = findViewById(R.id.przod);
        tyl = findViewById(R.id.tyl);
        usun = findViewById(R.id.usun);
        dodaj = findViewById(R.id.dodaj);
        polubienia = findViewById(R.id.polubienia);
        switchi = findViewById(R.id.switchi);
        layout = findViewById(R.id.layout1);

    }

    public void zmiana_tla() {
        if (switchi.isChecked()) {
            layout.setBackgroundColor(Color.parseColor("#1565c0"));
        } else {//#004C40
            layout.setBackgroundColor(Color.rgb(0, 76, 64));
        }
    }








    //Zmiana zdjecia
    protected void onStart() {
        super.onStart();
        zmienzdj(aktualny);
    }

    public void cofnij(View view) {
        if (aktualny > 0) {
            zmienzdj(--aktualny);
        } else if (aktualny <= 0) {
            aktualny = 2;
            zmienzdj(aktualny);
        }
    }
    public void zmienzdj(int n) {//tworzymy to zeby nie powtarzac kodu ( pobiera zdjecia z tablicy i ustawia w zaleznosci od ich miejsca w tablicy w tym przypadku [ 0 ])
        zdj.setImageDrawable(getDrawable(album[n]));
    }

    public void doprzodu(View view) {
        if (aktualny < 2) {
            zmienzdj(++aktualny);
        } else if (aktualny >= 2) {
            aktualny = 0;
            zmienzdj(aktualny);
        }
    }













    public void odejmij(View view) {
        if (ilosc != 0) {
            polubienia.setText((--ilosc) + " polubień");
        }
    }

    public void dodaj(View view) {
        polubienia.setText((++ilosc) + " polubień");
    }

    public void sprawdz(View view) {
        zmiana_tla();
    }


}

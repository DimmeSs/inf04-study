package com.example.loginappas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText email, haslo, hasloPowtorz;
    TextView autor;
    Button Przycisk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.email);
        autor = findViewById(R.id.autor);
        haslo = findViewById(R.id.haslo);
        hasloPowtorz = findViewById(R.id.hasloPowtorz);
        Przycisk = findViewById(R.id.Przycisk);
    }
//        Przycisk.setOnClickListener(view -> {
//            String e = email.getText().toString();
//            String h1 = haslo.getText().toString();
//            String h2 = haslo.getText().toString();
//
//            if (!e.contains("@")) {
//                autor.setText("Nieprawidłowy adres e-mail");
//            } else if (h1 == h2) {
//                autor.setText("Hasła się różnią");
//            } else {
//                autor.setText("Witaj " + e);
//            }
//        });

//    każą na on click zrobić
    public void klik(View view) {
        String e = email.getText().toString();
        String h1 = haslo.getText().toString();
        String h2 = hasloPowtorz.getText().toString();
        Log.d("siema",h1);
        Log.d("siema2",h2);
        Log.d("test",(h1.compareTo(h2)+""));
        if (!e.contains("@")) {//sprawdza czy email ma w sobie @
            autor.setText("Nieprawidłowy adres e-mail");
        } else if (h1.compareTo(h2) != 0) { // sprawdza czy 1 haslo jest takie samo co 2 haslo ( nie uzywaj h1 == h2 bo tutaj ma downa
            autor.setText("Hasła się różnią");
        } else {
            autor.setText("Witaj " + e);
        }
    }
}

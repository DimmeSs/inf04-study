package com.example.listaandr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
Button button;
ListView listView;
EditText wpisywanie;


List<String> toDolist;
ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= findViewById(R.id.button);
        listView= findViewById(R.id.listView);
        wpisywanie= findViewById(R.id.wpisywanie);

        toDolist = new ArrayList<>();
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,toDolist);
        listView.setAdapter(arrayAdapter);
        toDolist.add("Zakupy");
        toDolist.add("Zakupy");
        toDolist.add("Zakupy");


    }

    public void klikniecie(View view) {
        String getText = String.valueOf(wpisywanie.getText());
        toDolist.add(getText);
        arrayAdapter.notifyDataSetChanged();
        wpisywanie.setText("");

    }
}
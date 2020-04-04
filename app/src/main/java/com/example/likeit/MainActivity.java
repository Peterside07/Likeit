package com.example.likeit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.list_view);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Likes");
        arrayList.add("flowers");
        arrayList.add("Dogs");
        arrayList.add("Online games");
        arrayList.add("Long Walks");
        arrayList.add("Dislike");
        arrayList.add("Envy");
        arrayList.add("Hatred");
        arrayList.add("Nonsense");
        arrayList.add("Hobbies");
        arrayList.add("Coding");
        arrayList.add("Writing");
        arrayList.add("Cooking");
        arrayList.add("Shopping");
        arrayList.add("Football");
        arrayList.add("Photography");

        ArrayAdapter arrayAdapter =  new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, arrayList);
        listView.setAdapter(arrayAdapter);

    }
}

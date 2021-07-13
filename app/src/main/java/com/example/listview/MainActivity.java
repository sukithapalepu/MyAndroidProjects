package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.listview);
        final ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Andriod");
        arrayList.add("is");
        arrayList.add("great");
        arrayList.add("and");
        arrayList.add("it");
        arrayList.add("is");
        arrayList.add("better");
        arrayList.add("then");
        arrayList.add("other");
        arrayList.add("operatingsystem");
        arrayList.add("Andriod");
        arrayList.add("is");
        arrayList.add("great");
        arrayList.add("and");
        arrayList.add("it");
        arrayList.add("is");
        arrayList.add("better");
        arrayList.add("then");
        arrayList.add("other");
        arrayList.add("operatingsystem");

       // Create an object of ArrayAdapter and set Adapter to ListView
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);
        // implement setOnItemClickListener event on ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {

                Toast.makeText(MainActivity.this,"clicked item:"+i+""+arrayList.get(i).toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });


    }
}

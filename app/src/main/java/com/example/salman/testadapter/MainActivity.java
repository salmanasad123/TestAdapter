package com.example.salman.testadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    String days[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday",
            "Saturday"};

    Spinner S;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        S= (Spinner) findViewById(R.id.Spinner);
        ArrayAdapter<String> adapter =  new ArrayAdapter<String> (MainActivity.this,android.R.layout.simple_expandable_list_item_1,days);
        S.setAdapter(adapter);





    }
}

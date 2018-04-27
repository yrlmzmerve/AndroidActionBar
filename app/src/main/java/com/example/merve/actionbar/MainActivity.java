package com.example.merve.actionbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


     final List<Kisiler> kisiler = new ArrayList<Kisiler>(); //
    //kisi-> 2 deger alacagız class tutuyoruz
    final ListView liste = (ListView)findViewById(R.id.liste);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kisiler.add(new Kisiler ("MerveY",true));
        kisiler.add(new Kisiler ("ErdemO",false));
        kisiler.add(new Kisiler ("TunaV",false));

        ozelAdapter adapter = new ozelAdapter(this,kisiler);
        liste.setAdapter(adapter);

    }
}

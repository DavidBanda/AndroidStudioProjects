package com.example.eva1_9_listas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    ListView lstView;
    TextView txtView;

    String[] asResta = {
            "Chihuahua",
            "Juarez",
            "Delicias",
            "Camargo",
            "Parral",
            "Casas grandes",
            "Culiacan",
            "Puerto vallarta",
            "Cancun",
            "bubulubu",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstView = findViewById(R.id.listViewDatos);
        txtView = findViewById(R.id.textView);
        lstView.setAdapter(new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                asResta
        ));
        lstView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        txtView.setText(asResta[i]);
    }
}

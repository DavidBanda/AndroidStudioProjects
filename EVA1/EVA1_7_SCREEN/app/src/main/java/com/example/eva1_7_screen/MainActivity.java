package com.example.eva1_7_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnScroll;
    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnScroll = findViewById(R.id.btnScroll);
        txtView = findViewById(R.id.txtView);

        btnScroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtView.append("Jofiel me la pela \n");
            }
        });

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            Log.wtf("Pantalla", "Portrait");
        } else {
            Log.wtf("Pantalla", "LANDSCAPE");
        }
    }
}

package com.example.eva2_5_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView txtView;
    String txtIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtView = findViewById(R.id.textView);
        Intent intent = getIntent();
        txtIntent = intent.getStringExtra("datos");
        txtView.setText(txtIntent);
    }

    public void cerrar(View v) {
        finish();
    }
}

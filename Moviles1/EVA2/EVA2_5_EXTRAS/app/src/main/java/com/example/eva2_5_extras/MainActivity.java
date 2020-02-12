package com.example.eva2_5_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Intent inLanzar;
    private EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inLanzar = new Intent(this, Main2Activity.class);
        text = findViewById(R.id.editText);
    }

    public void sendInfo(View v) {
        String sMensa = text.getText().toString();
        inLanzar.putExtra("datos", sMensa);
        startActivity(inLanzar);
    }
}

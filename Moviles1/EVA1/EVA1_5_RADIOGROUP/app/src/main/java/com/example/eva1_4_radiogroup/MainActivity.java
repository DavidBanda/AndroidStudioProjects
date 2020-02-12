package com.example.eva1_4_radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
implements RadioGroup.OnCheckedChangeListener {

    private RadioGroup rdGrpComida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdGrpComida = findViewById(R.id.rdGroupComida);
        rdGrpComida.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        String Men;

        if(i == R.id.radioButton) {
            Men = "Tacos";
        } else if (i == R.id.radioButton2) {
            Men = "Tortas";
        } else if (i == R.id.radioButton3) {
            Men = "Montados";
        } else if (i == R.id.radioButton4) {
            Men = "Burritos";
        } else {
            Men = "";
        }

        Toast.makeText(this, Men, Toast.LENGTH_SHORT).show();
    }
}

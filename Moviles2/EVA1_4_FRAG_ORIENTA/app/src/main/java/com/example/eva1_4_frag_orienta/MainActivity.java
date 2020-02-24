package com.example.eva1_4_frag_orienta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    FrameLayout frmLayout;
    Intent inSecun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onMessageFromFragToMain() {
        frmLayout = findViewById(R.id.frame_layout);
        if(frmLayout != null) { //Landscape
            Toast.makeText(this, "Landscape", Toast.LENGTH_SHORT).show();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            TwoFragment two = new TwoFragment();
            two.setParam("ESTE MENSAJE TAMBIEN!!");
            ft.replace(R.id.frame_layout, two);
            ft.commit();
        } else { //Portrait
            Toast.makeText(this, "Portrait", Toast.LENGTH_SHORT).show();
            inSecun = new Intent(this, Secundaria.class);
            inSecun.putExtra("MENSAJE", "ESTE ES EL MENSAJE!!");
            startActivity(inSecun);
        }
    }

}

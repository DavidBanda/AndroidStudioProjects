package com.example.eva1_7_transicion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.imageView);
    }

    public void onClick(View v) {
        Intent in = new Intent(this, Activity2.class);
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this, img,
                ViewCompat.getTransitionName(img));
        startActivity(in, options.toBundle());
    }
}

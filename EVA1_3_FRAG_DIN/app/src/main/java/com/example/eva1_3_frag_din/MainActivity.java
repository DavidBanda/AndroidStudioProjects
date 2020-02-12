package com.example.eva1_3_frag_din;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View v){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        OneFragment one = new OneFragment();
        ft.replace(R.id.fragLy1, one);
        ft.commit();
    }

    public void click2(View v){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        TwoFragment one = new TwoFragment();
        ft.replace(R.id.fragLy1, one);
        ft.commit();
    }

}

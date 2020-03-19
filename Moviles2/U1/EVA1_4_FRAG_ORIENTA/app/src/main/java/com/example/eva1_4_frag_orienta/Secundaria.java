package com.example.eva1_4_frag_orienta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;

public class Secundaria extends AppCompatActivity {

    TwoFragment two = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        Log.wtf("SECUNDARIA", "ONCREATE");
        two.onMessageFromMainToFrag(getIntent().getStringExtra("MENSAJE"));
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        two = (TwoFragment)fragment;
        Log.wtf("SECUNDARIA", "onAttachFragment");
    }
}

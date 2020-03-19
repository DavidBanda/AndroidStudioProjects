package com.example.eva1_5_frag_eva;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        FragmentOne buttonFragment = new FragmentOne();
        /*ft.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);*/
        ft.setCustomAnimations(R.anim.anim, R.anim.anim_exit, R.anim.anim, R.anim.anim_exit);
        buttonFragment.setMiClickList(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft2 = getSupportFragmentManager().beginTransaction();
                /*ft2.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);*/
                ft2.setCustomAnimations(R.anim.anim, R.anim.anim_exit, R.anim.anim, R.anim.anim_exit);
                FragmentTwo blankFragment = new FragmentTwo();
                ft2.replace(R.id.frameLayout, blankFragment);
                ft2.addToBackStack("Hello, World");
                ft2.commit();
            }
        });
        ft.replace(R.id.frameLayout, buttonFragment);
        ft.addToBackStack("Hola2");
        ft.commit();
    }
}

package com.example.eva1_2_frag_com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    ButtonFragment btnFragment;
    ListFragment listFragment;
    TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.txtResult);
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if(fragment.getClass() == ButtonFragment.class){
            btnFragment = (ButtonFragment) fragment;
        }else{
            listFragment = (ListFragment) fragment;
        }
    }
                                        // QUIEN          Y  QUE SE ENVIA
    public void onMessageFromFragmentToMain(String sender, String param){
        if(sender.equals("List")){
            texto.setText("Lista: " + param);
            btnFragment.onMessageFromMainToFrag(param);
        }else if(sender.equals("Button")){
            texto.setText("Boton: " + param);
        }
    }

}

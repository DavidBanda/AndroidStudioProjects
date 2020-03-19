package com.example.eva1_5_frag_eva;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {

    private View.OnClickListener miClickList;

    public void setMiClickList(View.OnClickListener miClickList) {
        this.miClickList = miClickList;
    }

    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         LinearLayout ll = (LinearLayout) inflater.inflate(R.layout.fragment_fragment_one, container, false);
         Button btn = ll.findViewById(R.id.button);
         btn.setOnClickListener(miClickList);
         return ll;
    }

}

package com.example.eva1_4_frag_orienta;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * create an instance of this fragment.
 */
public class TwoFragment extends Fragment {

    TextView txt;
    private String param;

    public TwoFragment() {

    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        LinearLayout ll =  (LinearLayout) inflater.inflate(R.layout.fragment_two, container, false);
        txt = ll.findViewById(R.id.textView);
        onMessageFromMainToFrag(param);
        return ll;
    }

    public void onMessageFromMainToFrag(String param) {
        txt.setText(param);
    }

}

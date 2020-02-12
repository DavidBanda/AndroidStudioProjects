package com.example.eva1_1_fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link RedFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link RedFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RedFragment extends Fragment {

    public RedFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_red, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.wtf("red", "onAttach");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.wtf("red", "onStart");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.wtf("red", "onStop");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.wtf("red", "onResume");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.wtf("red", "onCreate");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.wtf("red", "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.wtf("red", "onDetach");
    }
}

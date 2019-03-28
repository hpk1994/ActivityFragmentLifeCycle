package com.example.myapplication;


import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentB extends Fragment {
    public static final String TAG = "FragmentB";

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e(TAG, "=====FragmentB onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "=====FragmentB onCreate");
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.e(TAG, "=====FragmentB onCreateView");
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.e(TAG, "=====FragmentB onViewCreated");

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(TAG, "=====FragmentB onActivityCreated");

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(TAG, "=====FragmentB onStart");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG, "=====FragmentB onResume");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(TAG, "=====FragmentB onPause");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(TAG, "=====FragmentB onStop");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(TAG, "=====FragmentB onDestroyView");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "=====FragmentB onDestroy");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(TAG, "=====FragmentB onDetach");

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(TAG, "=====FragmentB onSaveInstanceState");

    }
}

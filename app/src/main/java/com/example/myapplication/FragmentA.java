package com.example.myapplication;


import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentA extends Fragment {
    public static final String TAG = "FragmentA";

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e(TAG, "=====FragmentA onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "=====FragmentA onCreate");
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.e(TAG, "=====FragmentA onCreateView");
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.e(TAG, "=====FragmentA onViewCreated");

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(TAG, "=====FragmentA onActivityCreated");

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(TAG, "=====FragmentA onStart");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG, "=====FragmentA onResume");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(TAG, "=====FragmentA onPause");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(TAG, "=====FragmentA onStop");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(TAG, "=====FragmentA onDestroyView");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "=====FragmentA onDestroy");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(TAG, "=====FragmentA onDetach");

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(TAG, "=====FragmentA onSaveInstanceState");

    }
}

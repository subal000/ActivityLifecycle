package com.example.android.lifecycle;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("Harey", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("Harey", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("Harey", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("Harey", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("Harey", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("Harey", "onDestroy");
    }
}
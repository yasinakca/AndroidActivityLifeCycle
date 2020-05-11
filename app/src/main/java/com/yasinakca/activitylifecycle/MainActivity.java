package com.yasinakca.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("onCreate() methode called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("onResume() method called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("onPause() method called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("onStop() method called");
    }
}

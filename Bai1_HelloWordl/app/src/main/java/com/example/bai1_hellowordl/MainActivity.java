package com.example.bai1_hellowordl;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("cycle","MH1 Call onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("cycle","Call onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("cycle","Call onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("cycle","Call onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("dq", "Call Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("cycle","Call onDestroy");
    }
}
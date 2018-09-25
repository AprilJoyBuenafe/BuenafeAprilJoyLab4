package com.buenafe.apriljoy;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ITG_Lab4", "onCreate() has executed...");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITG_Lab4", "onStart() has executed...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITG_Lab4", "onResume() has executed...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITG_Lab4", "onPause() has executed...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITG_Lab4", "onStop() has executed...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITG_Lab4", "onRestart() has executed...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITG_Lab4", "onDestroy() has executed...");
    }

    public void showSnackBar(View v){
        Snackbar.make(v, "Back Button displayed using Snackbar", Snackbar.LENGTH_LONG).show();
    }

    public void showToast(View v){
        Toast.makeText(this, "Next Button displayed using Snackbar", Snackbar.LENGTH_LONG).show();
    }
}

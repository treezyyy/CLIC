package com.example.zz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "StartActivity";
    private Integer count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("count")) {
            count = savedInstanceState.getInt("count");
        }
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");Log.d(TAG, "onCreate");


    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
        resetUI();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count", count);
        Log.d(TAG, "onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("count")) {
            count = savedInstanceState.getInt("count");
        }
        Log.d(TAG, "onRestoreInstanceState");
    }

    @SuppressLint("SetTextI18n")
    private void resetUI() {
        ((TextView) findViewById(R.id.txt_counter)).setText(count.toString());
        Log.d(TAG, "resetUI");
    }

    @SuppressLint("SetTextI18n")
    public void onClickBtnAddDog(View view) {
        count++;
        TextView counterView = (TextView)findViewById(R.id.txt_counter);
        counterView.setText(count.toString());
    }
}

package com.example.zz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    //Button marklum;
    //TextView text;


    private Integer counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //marklum = findViewById(R.id.marklum);
    }
    @SuppressLint("SetTextI18n")
    public void onClickBtnAddDog(View view) {
        counter++;
        TextView counterView = (TextView)findViewById(R.id.txt_counter);
        counterView.setText(counter.toString());
        if (counter > 100){
            counterView.getHeight();
            counterView.getWidth();
            counterView.setHeight(200);

        }
    }
}
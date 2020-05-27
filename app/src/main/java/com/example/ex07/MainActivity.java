package com.example.ex07;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton rBGreen, rB2, rB3;
    Switch switcH;
    LinearLayout screen;
    RadioGroup rG;
    int celetedId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rG = findViewById(R.id.rG);
        switcH = findViewById(R.id.switcH);
        screen = findViewById(R.id.screen);

    }

    public void changeWithButton(View view) {
        if (!(switcH.isChecked())){
            celetedId = rG.getCheckedRadioButtonId();
            switch (celetedId){
                case R.id.rBGreen:{
                    screen.setBackgroundColor(Color.GREEN);
                    rG.clearCheck();
                }
                break;

                case R.id.rBBlue:{
                    screen.setBackgroundColor(Color.BLUE);
                    rG.clearCheck();
                }
                break;

                case R.id.rBYellow:{
                    screen.setBackgroundColor(Color.YELLOW);
                    rG.clearCheck();
                }
                break;

                case R.id.rBRed:{
                    screen.setBackgroundColor(Color.RED);
                    rG.clearCheck();
                }
                break;
            }
        }
    }

    public void changeImmediately(View view) {
        if (switcH.isChecked()){
            celetedId = rG.getCheckedRadioButtonId();
            switch (celetedId) {
                case R.id.rBGreen: {
                    screen.setBackgroundColor(Color.GREEN);
                    rG.clearCheck();
                }
                break;

                case R.id.rBBlue: {
                    screen.setBackgroundColor(Color.BLUE);
                    rG.clearCheck();
                }
                break;

                case R.id.rBYellow: {
                    screen.setBackgroundColor(Color.YELLOW);
                    rG.clearCheck();
                }
                break;

                case R.id.rBRed: {
                    screen.setBackgroundColor(Color.RED);
                    rG.clearCheck();
                }
                break;
            }
        }
    }
}

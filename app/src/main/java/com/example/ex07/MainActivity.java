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
    RadioButton rB1, rB2, rB3;
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

        if (switcH.isChecked()){
            celetedId = rG.getCheckedRadioButtonId();
            switch (celetedId) {
                case R.id.rB1: {
                    screen.setBackgroundColor(Color.GREEN);
                    rG.clearCheck();
                }
                break;

                case R.id.rB2: {
                    screen.setBackgroundColor(Color.BLUE);
                    rG.clearCheck();
                }
                break;

                case R.id.rB3: {
                    screen.setBackgroundColor(Color.YELLOW);
                    rG.clearCheck();
                }
                break;

                case R.id.rB4: {
                    screen.setBackgroundColor(Color.RED);
                    rG.clearCheck();
                }
                break;
            }
        }
    }

    public void change(View view) {
        if (!(switcH.isChecked())){
            celetedId = rG.getCheckedRadioButtonId();
            switch (celetedId){
                case R.id.rB1:{
                    screen.setBackgroundColor(Color.GREEN);
                    rG.clearCheck();
                }
                break;

                case R.id.rB2:{
                    screen.setBackgroundColor(Color.BLUE);
                    rG.clearCheck();
                }
                break;

                case R.id.rB3:{
                    screen.setBackgroundColor(Color.YELLOW);
                    rG.clearCheck();
                }
                break;

                case R.id.rB4:{
                    screen.setBackgroundColor(Color.RED);
                    rG.clearCheck();
                }
                break;
            }
        }
    }

}

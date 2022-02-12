package com.example.bodymasscalculator;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);

    }
    public void calculateBMI(View view)
    {
        double height = 0;
        double weigth = 0;
        double bmi = 0;
        String msg = "";

        EditText edht = (EditText)findViewById(R.id.Ht_id);
        EditText edwt = (EditText)findViewById(R.id.wt_id);

        TextView t1 = (TextView)findViewById(R.id.textwi);
        TextView t2 = (TextView)findViewById(R.id.text_2);

        height = Double.parseDouble(edht.getText().toString());
        weigth = Double.parseDouble(edwt.getText().toString());

        bmi = height*height;
        bmi = weigth/bmi;
        t1.setText(String.valueOf(bmi));

        if(bmi < 18.5){
            msg = "Underweight";
        }
        else if(bmi > 18.5 && bmi < 25){
            msg = "Healthy";
        }
        else{
            msg = "Overweight";
        }
        t2.setText(msg);
    }
}
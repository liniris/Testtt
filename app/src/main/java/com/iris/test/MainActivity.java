package com.iris.test;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bmi (View view){
        EditText edWeight = (EditText) findViewById(R.id.edi_weight);
        EditText edHeight = (EditText) findViewById(R.id.edi_height);
        float weight = Float.parseFloat(edWeight.getText().toString());
        float height = Float.parseFloat(edHeight.getText().toString());
        float bmi = weight/(height*height);
        new AlertDialog.Builder(this)
                .setMessage("Your Bmi is "+bmi)
                .setPositiveButton("I know",null)
                .show();

    }

}

package com.iris.test;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import static com.iris.test.R.id.rad_m;

/**
 * Created by Lin iris on 2017/10/31.
 */

public class OkActicity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_constraint);

    }

    public void ok(View view){
        EditText edWeight = (EditText) findViewById(R.id.edi_weight);
        EditText edHeight = (EditText) findViewById(R.id.edi_height);
        float weight = Float.parseFloat(edWeight.getText().toString());
        float height = Float.parseFloat(edHeight.getText().toString());
        float bmi = weight/(height*height);
        EditText edName = (EditText) findViewById(R.id.ed_name);
        String name = String.valueOf(edName.getText().toString());
        new AlertDialog.Builder(this)
                .setMessage("Hi "+name+" ,your bmi is "+bmi)
                //.setMessage("Your Bmi is "+bmi)
                .setPositiveButton("OK",null)
                .show();
        /*RadioGroup radiogroup = new RadioGroup(OkActicity.this);
        RadioButton raM = (RadioButton) findViewById(R.id.rad_m);
        RadioButton raF = (RadioButton) findViewById(R.id.rad_f);
        radiogroup.addView(raM);
        radiogroup.addView(raF);
        radiogroup.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) this);
        boolean checked = ((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.rad_m:
                if(checked){
                    new AlertDialog.Builder(this)
                            .setMessage("Hi Mr. "+edName)
                            .setMessage("Your Bmi is "+bmi)
                            .setPositiveButton("OK",null)
                            .show();
                }
            case R.id.rad_f:
                if(checked){
                    new AlertDialog.Builder(this)
                            .setMessage("Hi Mrs. "+edName)
                            .setMessage("Your Bmi is "+bmi)
                            .setPositiveButton("OK",null)
                            .show();
                }
                break;
        }*/
    }


}

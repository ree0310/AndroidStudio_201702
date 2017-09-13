package com.example.sep_13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View; // name space라고 한다. android밑에 view밑에 View가 있다.
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void copy (View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "this is after clicked in PB2", Toast.LENGTH_SHORT);
        toast.show();


        EditText aa = (EditText) findViewById(R.id.editText);
        //aa.getText();

        TextView bb = (TextView) findViewById(R.id.textView);
        bb.setText(aa.getText());
    }


}

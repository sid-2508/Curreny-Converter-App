package com.siddharth.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        EditText amt = (EditText) findViewById(R.id.input);
        Double n = Double.parseDouble(amt.getText().toString());
        Double i = n * 72.71;
        Toast.makeText(this, "₹" + String.format("%.2f", i), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
package com.example.form;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class secondform extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.submitted_form);
        TextView tv1 = findViewById(R.id.tv1);
        TextView tv2 = findViewById(R.id.tv2);
        TextView tv3 = findViewById(R.id.tv3);
        TextView tv4 = findViewById(R.id.tv4);
        TextView tv5 = findViewById(R.id.tv5);
        TextView tv6 = findViewById(R.id.tv6);
        TextView tv7 = findViewById(R.id.tv7);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String s1 = extras.getString("a");
        String s2 = extras.getString("b");
        String s3 = extras.getString("c");
        String s4 = extras.getString("d");
        String s5 = extras.getString("e");
        String s6 = extras.getString("f");
        String s7 = extras.getString("g");

        tv1.setText("Student ID: " + s1);
        tv2.setText("Name: " + s2);
        tv3.setText("Course: "+ s3);
        tv4.setText("Academic Year: " + s4);
        tv5.setText("Year: " + s5);
        tv6.setText("Semester: " + s6);
        tv7.setText("Module: " + s7);

    }
}

package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner program = findViewById(R.id.program);
        String[] pname = {"BE IT", "BE C","BE ECE", "BE ICE","BE EG"};
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, pname);
        adapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        program.setAdapter(adapter);

        Spinner year = findViewById(R.id.year);
        String[] y1 = {"1", "2","3", "4","5"};
        ArrayAdapter adapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, y1);
        adapter1.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        year.setAdapter(adapter1);

        Spinner sem = findViewById(R.id.sem);
        String[] s1 = {"1", "2"};
        ArrayAdapter adapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, s1);
        adapter2.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        sem.setAdapter(adapter2);

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Registered();
            }
        });
    }
    private void Registered() {
        EditText editTextNumber = (EditText) findViewById(R.id.editTextNumber);
        String stid = editTextNumber.getText().toString();

        EditText name = findViewById(R.id.name);
        String stname = name.getText().toString();

        Spinner pro = findViewById(R.id.program);
        String stpro = pro.getSelectedItem().toString();

        RadioGroup radG = findViewById(R.id.radG);
        int selectedId = radG.getCheckedRadioButtonId();
        RadioButton rb = findViewById(selectedId);
        String stradG = rb.getText().toString();

        Spinner yearS = findViewById(R.id.year);
        String yearSe = yearS.getSelectedItem().toString();

        Spinner semester = findViewById(R.id.sem);
        String stSemester = semester.getSelectedItem().toString();

        CheckBox c1 = findViewById(R.id.c1);
        CheckBox c2 = findViewById(R.id.c2);
        CheckBox c3 = findViewById(R.id.c3);
        CheckBox c4 = findViewById(R.id.c4);
        String stcheck = "";
        if (c1.isChecked()) {
            stcheck = stcheck+c1.getText().toString() +" ";
        }
        if (c2.isChecked()) {
            stcheck = stcheck+c2.getText().toString() +" ";
        }
        if (c3.isChecked()) {
            stcheck = stcheck+c3.getText().toString()+" ";
        }
        if (c4.isChecked()) {
            stcheck = stcheck+c4.getText().toString()+" ";
        }

        Intent intent = new Intent(MainActivity.this, secondform.class);
        Bundle extras = new Bundle();
        intent.putExtra("a",stid);
        intent.putExtra("b", stname);
        intent.putExtra("c", stpro);
        intent.putExtra("d", stradG);
        intent.putExtra("e", yearSe);
        intent.putExtra("f", stSemester);
        intent.putExtra("g", stcheck);

        startActivity(intent);



    }
}
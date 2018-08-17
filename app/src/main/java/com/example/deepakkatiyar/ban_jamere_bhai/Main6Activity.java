package com.example.deepakkatiyar.ban_jamere_bhai;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main6Activity extends AppCompatActivity {
    Spinner spinner;
    Button button1, button2,btn4;
    DatePickerDialog.OnDateSetListener date;
    DatePickerDialog.OnDateSetListener date1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        spinner=findViewById(R.id.spinner16);
        List<String> list2 = new ArrayList<>();
        list2.add("Select Leave Type");
        list2.add("CL");
        list2.add("Maternity");
        list2.add("PL");
        list2.add("Emergency");
        list2.add("PDl");


        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, list2);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter2);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position2, long id) {
                spinner.setSelection(position2);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        button1=findViewById(R.id.button17);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year=cal.get(Calendar.YEAR);
                int month=cal.get(Calendar.MONTH);
                int day=cal.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog dg=new DatePickerDialog(Main6Activity.this,android.R.style.Theme_Holo_Light_Dialog_MinWidth,date,year,month,day);
                dg.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dg.show();
            }
        });
        date= new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                String dt=month +"/"+ dayOfMonth +"/"+year;
                button1.setText(dt);


            }
        };
        button2=findViewById(R.id.button18);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year=cal.get(Calendar.YEAR);
                int month=cal.get(Calendar.MONTH);
                int day=cal.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog dg=new DatePickerDialog(Main6Activity.this,android.R.style.Theme_Holo_Light_Dialog_MinWidth,date1,year,month,day);
                dg.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dg.show();
            }
        });
        date1= new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                String date2=month +"/"+ dayOfMonth +"/"+year;
                button2.setText(date2);
            }
        };
        btn4=findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"data stored succesfully ",Toast.LENGTH_LONG).show();
                Intent in=new Intent(Main6Activity.this,Main5Activity.class);
                startActivity(in);
            }
        });
    }
}


package com.example.deepakkatiyar.ban_jamere_bhai;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main8Activity extends AppCompatActivity {
    Button button,button1,btn6;
    ImageView imageview;
    Spinner spinner1, spinner2,spinner3,spinner4;
    DatePickerDialog.OnDateSetListener date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        spinner1=findViewById(R.id.spinner28);
        spinner2=findViewById(R.id.spinner29);
        spinner3=findViewById(R.id.spinner31);
        spinner4=findViewById(R.id.spinner32);
        List<String> list = new ArrayList<>();
        list.add("Select Center Type");
        list.add("Anganvadi");
        list.add("School");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(arrayAdapter);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                spinner1.setSelection(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        List<String> list1 = new ArrayList<>();
        list1.add("Select School name");
        list1.add("A P J Abdul kalam university");
        list1.add("V N SD college");
        list1.add("SVM university");
        list1.add("D U university");
        list1.add(" bbd university");
        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, list1);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(arrayAdapter1);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position1, long id) {
                spinner2.setSelection(position1);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        List<String> list2 = new ArrayList<>();
        list2.add("Select Disease");
        list2.add("Club foot");
        list2.add("Neural Tube defect");
        list2.add("down's Syndrome");
        list2.add("Irregular periods");
        list2.add("Substance Abuse");


        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, list2);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(arrayAdapter2);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position2, long id) {
                spinner3.setSelection(position2);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        List<String> list3 = new ArrayList<>();
        list3.add("Refferal Center");
        list3.add("AFHC");
        list3.add("DEIC");
        list3.add("D H");
        list3.add("NRC");
        list3.add("KMC");
        ArrayAdapter<String> arrayAdapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, list3);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(arrayAdapter3);
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                spinner4.setSelection(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        button1=findViewById(R.id.button28);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year=cal.get(Calendar.YEAR);
                int month=cal.get(Calendar.MONTH);
                int day=cal.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog dg;
                dg = new DatePickerDialog(Main8Activity.this,android.R.style.Theme_Holo_Light_Dialog_MinWidth,date,year,month,day);
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
        btn6=findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"data stored succesfully ",Toast.LENGTH_LONG).show();
                Intent in=new Intent(Main8Activity.this,Main2Activity.class);
                startActivity(in);
            }
        });

        button = findViewById(R.id.button27);
        imageview =findViewById(R.id.imageview11);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 0);
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap bitmap = (Bitmap) data.getExtras().get("data");
        imageview.setImageBitmap(bitmap);
    }

}




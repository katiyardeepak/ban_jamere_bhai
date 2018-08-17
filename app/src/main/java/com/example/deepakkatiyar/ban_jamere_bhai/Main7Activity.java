package com.example.deepakkatiyar.ban_jamere_bhai;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Main7Activity extends AppCompatActivity {
Spinner spinner1,spinner2;
Button button,btn5;
ImageView imageview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        spinner1=findViewById(R.id.spinner20);
        spinner2=findViewById(R.id.spinner21);
        button = findViewById(R.id.button222);
        imageview =findViewById(R.id.imageiew2);
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
        btn5=findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"data stored succesfully ",Toast.LENGTH_LONG).show();
                Intent in=new Intent(Main7Activity.this,Main2Activity.class);
                startActivity(in);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 0);
            }
        });
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode,resultCode,data);
        Bitmap bitmap=(Bitmap)data.getExtras().get("data");
        imageview.setImageBitmap(bitmap);
        button.setVisibility(View.GONE);
    }

    }


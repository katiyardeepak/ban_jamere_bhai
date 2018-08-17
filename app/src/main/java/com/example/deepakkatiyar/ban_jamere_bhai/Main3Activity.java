package com.example.deepakkatiyar.ban_jamere_bhai;

import android.content.Intent;
import android.graphics.Bitmap;
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

public class Main3Activity extends AppCompatActivity {
 Spinner spinner1,spinner2, spinner3;
 ImageView imageview;
 Button button,btn3;
    final int CAMERA_PIC_REQUEST = 1337;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button =  findViewById(R.id.button22);
        btn3 =  findViewById(R.id.jmakre1);
        imageview=findViewById(R.id.imageView);
        spinner1 = findViewById(R.id.spinner1);
        spinner2 = findViewById(R.id.spinner2);
        spinner3 = findViewById(R.id.spinner3);
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
        list2.add("कर्मचारी अपना नाम चुनें");
        list2.add("A.k pal");
        list2.add("manisha singh");
        list2.add("Amit singh");
        list2.add("Anklush verma");
        list2.add("kamal singh");


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


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, CAMERA_PIC_REQUEST);
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CAMERA_PIC_REQUEST) {
            Bitmap image = (Bitmap) data.getExtras().get("data");
            //sets imageview as the bitmap
            imageview.setImageBitmap(image);
            imageview.setVisibility(View.VISIBLE );
        }
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"data stored succesfully ",Toast.LENGTH_LONG).show();
             Intent in=new Intent(Main3Activity.this,Main2Activity.class);
             startActivity(in);
            }
        });
    }
    }



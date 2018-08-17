package com.example.deepakkatiyar.ban_jamere_bhai;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public class tab1 extends Fragment {
    Spinner spinner1, spinner2;
    Button button1, button2,btn7;
    ImageView imageview2;
    DatePickerDialog.OnDateSetListener date;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        spinner1 = view.findViewById(R.id.spinner24);
        spinner2 = view.findViewById(R.id.spinner30);
        button2 = view.findViewById(R.id.button37);
        button1 = view.findViewById(R.id.button22);
        imageview2 = view.findViewById(R.id.imageView2);
        btn7=view.findViewById(R.id.btn7);
        data();
    }

    private void data() {
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog dg = new DatePickerDialog(getContext(), android.R.style.Theme_Holo_Light_Dialog_MinWidth, date, year, month, day);
                dg.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dg.show();
            }
        });

        date = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                String date2 = month + "/" + dayOfMonth + "/" + year;
                button2.setText(date2);
            }
        };
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"data stored succesfully ",Toast.LENGTH_LONG).show();
                Intent in=new Intent(getActivity(),Main2Activity.class);
                startActivity(in);
            }
        });


        List<String> list = new ArrayList<>();
        list.add("Student ID");
        list.add("1001");
        list.add("1002");
        list.add("1003");
        list.add("1004");
        list.add("1005");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, list);
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
        list1.add("Refferal Center");
        list1.add("AFHC");
        list1.add("DEIC");
        list1.add("D H");
        list1.add("NRC");
        list1.add("KMC");
        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, list1);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(arrayAdapter1);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                spinner2.setSelection(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 0);
            }
        });
    }
    public void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode,resultCode,data);
        Bitmap bitmap=(Bitmap)data.getExtras().get("data");
        imageview2.setImageBitmap(bitmap);
        button1.setVisibility(View.GONE);
    }
    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.tab1, container, false);
    }

}


package com.example.deepakkatiyar.ban_jamere_bhai;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    TextView textview,tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textview = findViewById(R.id.textView11);
        tv1 = findViewById(R.id.textView19);
        tv2 = findViewById(R.id.textView20);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.button1:
                Intent intent =new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(intent);
                break;
            case R.id.button2:
                Intent intent1 =new Intent(Main2Activity.this,Main4Activity.class);
                startActivity(intent1);
                break;
            case R.id.button3:
                Intent intent2 =new Intent(Main2Activity.this,Main5Activity.class);
                startActivity(intent2);
                break;
            case R.id.button4:
                Intent intent3 =new Intent(Main2Activity.this,Main7Activity.class);
                startActivity(intent3);
                break;
                case R.id.button5:
            Intent intent4 =new Intent(Main2Activity.this,Main8Activity.class);
            startActivity(intent4);
            break;
            case R.id.button6:
                Intent intent5 =new Intent(Main2Activity.this,Main8Activity.class);
                startActivity(intent5);
                break;
                case R.id.button7:
            Intent intent6 =new Intent(Main2Activity.this,Main10Activity.class);
            startActivity(intent6);
            break;
            case R.id.button8:
                Toast.makeText(getApplicationContext(),"डाटा ताज़ा किया जा रहा है ",Toast.LENGTH_LONG).show();
                break;
            case R.id.button9:
                Toast.makeText(getApplicationContext(),"Uploading file ",Toast.LENGTH_LONG).show();
                break;


        }

    }
}

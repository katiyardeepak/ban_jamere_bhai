package com.example.deepakkatiyar.ban_jamere_bhai;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login;
    EditText username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (Button) findViewById(R.id.btnlogin);
        username = (EditText) findViewById(R.id.txtuser);
        password = (EditText) findViewById(R.id.txtpass);
        ImageView imageView=findViewById(R.id.imageView);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                log();
            }
        });
    }
    public void log() {
        String user = username.getText().toString();
        String pass = password.getText().toString();
        if (user.equals("admin") && pass.equals("admin")) {
            Toast.makeText(getApplicationContext(), "username and password matched!", Toast.LENGTH_LONG).show();
            Intent in = new Intent(this, Main2Activity.class);
            startActivity(in);
        } else {

                Toast.makeText(getApplicationContext(), "username and password do not matched!", Toast.LENGTH_LONG).show();
            }
        }
    }



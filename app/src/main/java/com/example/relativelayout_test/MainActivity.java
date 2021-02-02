package com.example.relativelayout_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends
        AppCompatActivity implements View.OnClickListener  {

    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if(view.getId()== R.id.btnLogin){
            Toast.makeText(this,
                    "1", Toast.LENGTH_SHORT).show();
        }
    }
}
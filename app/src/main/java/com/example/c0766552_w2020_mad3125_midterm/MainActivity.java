package com.example.c0766552_w2020_mad3125_midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout txtPIN;
    private TextInputLayout txtFName;
    private TextInputLayout txtLName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPIN = findViewById(R.id.personSINNumberTextInputLayout);
        txtFName= findViewById(R.id.firstNameTextInputLayout);
        txtLName = findViewById(R.id.lastNameTextInputLayout);
    }
}

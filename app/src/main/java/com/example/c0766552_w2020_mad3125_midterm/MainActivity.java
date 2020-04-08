package com.example.c0766552_w2020_mad3125_midterm;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout txtPIN;
    private TextInputLayout txtFName;
    private TextInputLayout txtLName;
    private TextView txtBDate;
   // private Button btnBDate;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPIN = findViewById(R.id.personSINNumberTextInputLayout);
        txtFName= findViewById(R.id.firstNameTextInputLayout);
        txtLName = findViewById(R.id.lastNameTextInputLayout);
        txtBDate = findViewById(R.id.textViewBirthDate);
    //    btnBDate = findViewById(R.id.buttonBirthDate);

//        MaterialDatePicker.Builder builder = MaterialDatePicker.Builder.datePicker();
//        builder.setTitleText("Select Birth Date");
//        final MaterialDatePicker materialDatePicker = builder.build();
//
//        btnBDate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                materialDatePicker.show(getSupportFragmentManager(),null);
//            }
//        });
    }
}

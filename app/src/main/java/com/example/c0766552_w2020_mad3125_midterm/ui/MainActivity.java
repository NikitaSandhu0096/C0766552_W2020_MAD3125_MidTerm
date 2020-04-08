package com.example.c0766552_w2020_mad3125_midterm.ui;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.c0766552_w2020_mad3125_midterm.R;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout txtSIN;
    private TextInputLayout txtFName;
    private TextInputLayout txtLName;
    private TextInputLayout txtBrDate;
    private RadioGroup rGender;
    private String rgGender;
    private TextInputLayout txtGIncome;
    private TextInputLayout txtRContributed;
    private Button btnSubmit;

    // private TextView txtBDate;
   // private Button btnBDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // SIN, First Name and Last Name
        txtSIN = findViewById(R.id.personSINNumberTextInputLayout);
        txtFName= findViewById(R.id.firstNameTextInputLayout);
        txtLName = findViewById(R.id.lastNameTextInputLayout);

        // Radio Group Gender
        rGender = findViewById(R.id.radioGroup);
        rGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radioButton:
                        rgGender = "Female";
                        Toast.makeText(MainActivity.this, rgGender, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton2:
                        rgGender = "Male";
                        Toast.makeText(MainActivity.this, rgGender, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton3:
                        rgGender = "Other";
                        Toast.makeText(MainActivity.this, rgGender, Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        // Birth Date
        txtBrDate = findViewById(R.id.birthDateTextInputLayout);

//        txtBrDate.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                DatePickerDialog dialog = new DatePickerDialog(v.getContext(),
//                        (DatePickerDialog.OnDateSetListener) MainActivity.this, Calendar.getInstance().get(Calendar.YEAR),
//                        Calendar.getInstance().get(Calendar.MONTH),
//                        Calendar.getInstance().get(Calendar.DATE));
//                dialog.show();
//                return false;
//            }
//        });

//        txtBrDate.setOnClickListener(new View.OnClickListener() {    //https://stackoverflow.com/questions/14933330/datepicker-how-to-popup-datepicker-when-click-on-edittext
//            @Override
//            public void onClick(View v) {
//                DatePickerDialog dialog = new DatePickerDialog(v.getContext(),
//                        (DatePickerDialog.OnDateSetListener) MainActivity.this, Calendar.getInstance().get(Calendar.YEAR),
//                        Calendar.getInstance().get(Calendar.MONTH),
//                        Calendar.getInstance().get(Calendar.DATE));
//                dialog.show();
//            }
//        });

       // txtBDate = findViewById(R.id.textViewBirthDate);
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

        // Gross Income and RRSP Contributed
        txtGIncome = findViewById(R.id.grossIncomeTextInputLayout);
        txtRContributed = findViewById(R.id.RRSPContributedTextInputLayout);

        //Submit Button
        btnSubmit = findViewById(R.id.buttonSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mint = new Intent(MainActivity.this, CustomerDetailsActivity.class);
                startActivity(mint);
            }
        });
    }
}

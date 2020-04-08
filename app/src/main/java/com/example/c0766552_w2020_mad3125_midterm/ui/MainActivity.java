package com.example.c0766552_w2020_mad3125_midterm.ui;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.c0766552_w2020_mad3125_midterm.R;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout txtPIN;
    private TextInputLayout txtFName;
    private TextInputLayout txtLName;
    private TextInputLayout txtBrDate;

    // private TextView txtBDate;
   // private Button btnBDate;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPIN = findViewById(R.id.personSINNumberTextInputLayout);
        txtFName= findViewById(R.id.firstNameTextInputLayout);
        txtLName = findViewById(R.id.lastNameTextInputLayout);
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
    }
}

package com.example.c0766552_w2020_mad3125_midterm.ui;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.c0766552_w2020_mad3125_midterm.R;
import com.example.c0766552_w2020_mad3125_midterm.model.CRACustomer;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText txtSIN;
    private TextInputEditText txtFName;
    private TextInputEditText txtLName;
    private TextInputEditText txtBrDate;
    private RadioGroup rGender;
    private String rgGender;
    private TextInputEditText txtGIncome;
    private TextInputEditText txtRContributed;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // SIN, First Name and Last Name
        txtSIN = findViewById(R.id.personSINNumberTextInputEditText);
        txtFName= findViewById(R.id.firstNameTextInputEditText);
        txtLName = findViewById(R.id.lastNameTextInputEditText);

        // Radio Group Gender
        rGender = findViewById(R.id.radioGroup);
        rGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radioButton:
                        rgGender = "Female";
                       // Toast.makeText(MainActivity.this, rgGender, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton2:
                        rgGender = "Male";
                       // Toast.makeText(MainActivity.this, rgGender, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton3:
                        rgGender = "Other";
                       // Toast.makeText(MainActivity.this, rgGender, Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        // Birth Date
        txtBrDate = findViewById(R.id.birthDateTextInputEditText);

        txtBrDate.setOnClickListener(new View.OnClickListener() {      //https://www.journaldev.com/9976/android-date-time-picker-dialog
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {
                DatePickerDialog dialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {       //https://android--code.blogspot.com/2015/08/android-datepickerdialog-date-format.html
                        //txtBrDate.setText(dayOfMonth + "-" + (month + 1) + "-" + year);
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(year,month,dayOfMonth);
                        Date date = calendar.getTime();

                        Calendar calendar1 = Calendar.getInstance();
                      //  Date date1 = calendar1.getTime();

                        int age = calendar1.get(Calendar.YEAR) - calendar.get(Calendar.YEAR);           //https://stackoverflow.com/questions/7906301/how-can-i-find-the-number-of-years-between-two-dates

                        if(age > 18) {
                            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
                            String s = dateFormat.format(date);
                            txtBrDate.setText(s);
                        }else{
                            txtBrDate.setText("Cannot File Tax");
                            txtBrDate.setTextColor(getResources().getColor(R.color.red));
                            btnSubmit.setVisibility(View.INVISIBLE);
                           // txtBrDate.setError("Cannot fill Tax");
                        }
                    }
                },Calendar.getInstance().get(Calendar.YEAR),
                      Calendar.getInstance().get(Calendar.MONTH),
                       Calendar.getInstance().get(Calendar.DAY_OF_MONTH) );
                dialog.show();
            }
        });

        // Gross Income and RRSP Contributed
        txtGIncome = findViewById(R.id.grossIncomeTextInputEditText);
        txtRContributed = findViewById(R.id.RRSPContributedTextInputEditText);

        //Submit Button
        btnSubmit = findViewById(R.id.buttonSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                String sin = txtSIN.getText().toString().trim();
                String fname = txtFName.getText().toString().trim();
                String lname = txtLName.getText().toString().trim();
                String bdate = txtBrDate.getText().toString().trim();
                String gincome = txtGIncome.getText().toString().trim();
                String rcontributed = txtRContributed.getText().toString().trim();

                if(sin.isEmpty()){
                    txtSIN.setError("Please enter SIN Number");
                }else if(fname.isEmpty()){
                    txtFName.setError("Please enter First Name");
                } else if(lname.isEmpty()){
                    txtLName.setError("Please enter Last Name");
                } else if(bdate.isEmpty()){
                    txtBrDate.setError("Please enter Birth Date");
                } else if(gincome.isEmpty()){
                    txtGIncome.setError("Please enter Gross Income");
                } else if(rcontributed.isEmpty()){
                    txtRContributed.setError("Please enter RRSP Contributed");
                } else if(txtSIN.getText().toString().matches("^(\\d{3}-\\d{3}-\\d{3})|(\\d{9})$")) {          //https://stackoverflow.com/questions/20082855/regular-expression-for-canadian-sin-social-insurance-number
                    CRACustomer tempobj = new CRACustomer(sin, fname, lname, bdate, rgGender, Double.parseDouble(gincome), Double.parseDouble(rcontributed));
                    Intent mint = new Intent(MainActivity.this, CustomerDetailsActivity.class);
                    mint.putExtra("tempobj", tempobj);
                    startActivity(mint);
                } else {
                    Toast.makeText(MainActivity.this, "error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

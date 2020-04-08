package com.example.c0766552_w2020_mad3125_midterm.ui;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.c0766552_w2020_mad3125_midterm.R;

public class CustomerDetailsActivity extends AppCompatActivity {

    private TextView txtSINNumber;
    private TextView txtFullName;
    private TextView txtBirthDate;
    private TextView txtGender;
    private TextView txtAge;
    private TextView txtTaxFilingDate;
    private TextView txtGrossIncome;
    private TextView txtFederalTax;
    private TextView txtProvincialTax;
    private TextView txtCPP;
    private TextView txtEI;
    private TextView txtRRSPContributed;
    private TextView txtCarryForwardRRSP;
    private TextView txtTotalTaxableIncome;
    private TextView txtTotalTaxPayed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_details);

        ActionBar actBar = getSupportActionBar();
        actBar.setTitle("Customer Details");

        txtSINNumber = findViewById(R.id.textView);
        txtFullName = findViewById(R.id.textView4);
        txtBirthDate = findViewById(R.id.textView5);
        txtGender = findViewById(R.id.textView6);
        txtAge = findViewById(R.id.textView7);
        txtTaxFilingDate = findViewById(R.id.textView8);
        txtGrossIncome= findViewById(R.id.textView9);
        txtFederalTax = findViewById(R.id.textView10);
        txtProvincialTax = findViewById(R.id.textView11);
        txtCPP = findViewById(R.id.textView12);
        txtEI = findViewById(R.id.textView13);
        txtRRSPContributed = findViewById(R.id.textView14);
        txtCarryForwardRRSP = findViewById(R.id.textView15);
        txtTotalTaxableIncome = findViewById(R.id.textView16);
        txtTotalTaxPayed = findViewById(R.id.textView17);

        txtSINNumber.setText("Person SIN Number : ");

        txtFullName.setText("Full Name : ");

        txtBirthDate.setText("Birth Date : ");

        txtGender.setText("Gender : ");

        txtAge.setText("Age : ");

        txtTaxFilingDate.setText("Tax Filing Date : ");

        txtGrossIncome.setText("Gross Income : ");

        txtFederalTax.setText("Federal Tax : ");

        txtProvincialTax.setText("Provincial Tax : ");

        txtCPP.setText("CPP : ");

        txtEI.setText("EI : ");

        txtRRSPContributed.setText("RRSP Contributed : ");

        txtCarryForwardRRSP.setText("Carry Forward RRSP : ");

        txtTotalTaxableIncome.setText("Total Taxable Income : ");

        txtTotalTaxPayed.setText("Total Tax Payed : ");
    }
}

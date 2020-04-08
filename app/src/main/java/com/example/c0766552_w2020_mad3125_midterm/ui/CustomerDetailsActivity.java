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
        txtSINNumber.setTextSize(16);

        txtFullName.setText("Full Name : ");
        txtFullName.setTextSize(16);

        txtBirthDate.setText("Birth Date : ");
        txtBirthDate.setTextSize(16);

        txtGender.setText("Gender : ");
        txtGender.setTextSize(16);

        txtAge.setText("Age : ");
        txtAge.setTextSize(16);

        txtTaxFilingDate.setText("Tax Filing Date : ");
        txtTaxFilingDate.setTextSize(16);

        txtGrossIncome.setText("Gross Income : ");
        txtGrossIncome.setTextSize(16);

        txtFederalTax.setText("Federal Tax : ");
        txtFederalTax.setTextSize(16);

        txtProvincialTax.setText("Provincial Tax : ");
        txtProvincialTax.setTextSize(16);

        txtCPP.setText("CPP : ");
        txtCPP.setTextSize(16);

        txtEI.setText("EI : ");
        txtEI.setTextSize(16);

        txtRRSPContributed.setText("RRSP Contributed : ");
        txtRRSPContributed.setTextSize(16);

        txtCarryForwardRRSP.setText("Carry Forward RRSP : ");
        txtCarryForwardRRSP.setTextSize(16);

        txtTotalTaxableIncome.setText("Total Taxable Income : ");
        txtTotalTaxableIncome.setTextSize(16);

        txtTotalTaxPayed.setText("Total Tax Payed : ");
        txtTotalTaxPayed.setTextSize(16);
    }
}

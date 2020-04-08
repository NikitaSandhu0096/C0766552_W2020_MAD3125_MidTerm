package com.example.c0766552_w2020_mad3125_midterm.ui;

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
    }
}

package com.example.c0766552_w2020_mad3125_midterm.ui;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.c0766552_w2020_mad3125_midterm.R;
import com.example.c0766552_w2020_mad3125_midterm.model.CRACustomer;

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
    private TextView txtMaxRRSPAllowed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_details);

        ActionBar actBar = getSupportActionBar();
        actBar.setTitle("Customer Tax Details");

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
        txtMaxRRSPAllowed = findViewById(R.id.textView18);

        CRACustomer tempobj = (CRACustomer) getIntent().getSerializableExtra("tempobj");

        txtSINNumber.setText("Person SIN Number         : " + tempobj.getsNumber());
        txtSINNumber.setTextSize(18);

        txtFullName.setText("Full Name                          : " + tempobj.getFullName());
        txtFullName.setTextSize(18);

        txtBirthDate.setText("Birth Date                          : " + tempobj.getBirthDate());
        txtBirthDate.setTextSize(18);

        txtGender.setText("Gender                               : " + tempobj.getGender());
        txtGender.setTextSize(18);

        txtAge.setText("Age                                     : " + tempobj.getAge());
        txtAge.setTextSize(18);

        txtTaxFilingDate.setText("Tax Filing Date                  : " + tempobj.getTxtFilingDate());
        txtTaxFilingDate.setTextSize(18);

        txtGrossIncome.setText("Gross Income                   :  $" + tempobj.getGrossIncome());
        txtGrossIncome.setTextSize(18);

        txtFederalTax.setText("Federal Tax                       :  $" + tempobj.getFederalTax());
        txtFederalTax.setTextSize(18);

        txtProvincialTax.setText("Provincial Tax                   :  $" + tempobj.getProvincialTax());
        txtProvincialTax.setTextSize(18);

        txtCPP.setText("CPP                                    :  $" + tempobj.getCpp());
        txtCPP.setTextSize(18);

        txtEI.setText("EI                                        :  $" + tempobj.getEi());
        txtEI.setTextSize(18);

        txtRRSPContributed.setText("RRSP Contributed            :  $" + tempobj.getRrspContributed());
        txtRRSPContributed.setTextSize(18);

        double d = tempobj.getCarryForwardRRSP();
        if (d > 0) {                //https://stackoverflow.com/questions/13553555/changing-textview-color-based-on-positive-negative-number-through-xml
            txtCarryForwardRRSP.setText("Carry Forward RRSP        :  $" + tempobj.getCarryForwardRRSP());
            txtCarryForwardRRSP.setTextSize(18);
        }else {
            txtCarryForwardRRSP.setText("Carry Forward RRSP        :  $" + tempobj.getCarryForwardRRSP());
            txtCarryForwardRRSP.setTextColor(getResources().getColor(R.color.red));
            txtCarryForwardRRSP.setTextSize(18);
        }

        txtTotalTaxableIncome.setText("Total Taxable Income      :  $" + tempobj.getTotalTaxableIncome());
        txtTotalTaxableIncome.setTextSize(18);

        txtTotalTaxPayed.setText("Total Tax Payed               :  $" + tempobj.getTotalTaxPayed());
        txtTotalTaxPayed.setTextSize(18);

        txtMaxRRSPAllowed.setText("Max RRSP Allowed          :  $" + tempobj.getMaxRRSPAllowed());
        txtMaxRRSPAllowed.setTextSize(18);
    }
}

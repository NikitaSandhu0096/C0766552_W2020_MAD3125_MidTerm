package com.example.c0766552_w2020_mad3125_midterm.model;

public class CRACustomer {
    private int sNumber;
    private String firstName;
    private String lastName;
    private String fullName;
    private String birthDate;
    private String gender;
    private int age;
    private String txtFilingDate;
    private float grossIncome;
    private float federalTax;
    private float provincialTax;
    private float cpp;
    private float ei;
    private float rrspContributed;
    private float carryForwardRRSP;
    private float totalTaxableIncome;
    private float totalTaxPayed;

    public CRACustomer(int sNumber, String firstName, String lastName, String fullName, String birthDate, String gender, int age, String txtFilingDate, float grossIncome, float federalTax, float provincialTax, float cpp, float ei, float rrspContributed, float carryForwardRRSP, float totalTaxableIncome, float totalTaxPayed) {
        this.sNumber = sNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.age = age;
        this.txtFilingDate = txtFilingDate;
        this.grossIncome = grossIncome;
        this.federalTax = federalTax;
        this.provincialTax = provincialTax;
        this.cpp = cpp;
        this.ei = ei;
        this.rrspContributed = rrspContributed;
        this.carryForwardRRSP = carryForwardRRSP;
        this.totalTaxableIncome = totalTaxableIncome;
        this.totalTaxPayed = totalTaxPayed;
    }


}

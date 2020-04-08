package com.example.c0766552_w2020_mad3125_midterm.model;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.LocalDate;

public class CRACustomer {
    private int sNumber;
    private String firstName;
    private String lastName;
    private String fullName;
    private LocalDate birthDate;
    private String gender;
    private int age;
    private LocalDate txtFilingDate;
    private float grossIncome;
    private float federalTax;
    private float provincialTax;
    private float cpp;
    private float ei;
    private float rrspContributed;
    private float carryForwardRRSP;
    private float totalTaxableIncome;
    private float totalTaxPayed;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public CRACustomer(int sNumber, String firstName, String lastName, LocalDate birthDate, String gender, float grossIncome, float rrspContributed) {
        this.sNumber = sNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.age = calculateAge();
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

    public int getsNumber() {
        return sNumber;
    }

    public void setsNumber(int sNumber) {
        this.sNumber = sNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getTxtFilingDate() {
        return txtFilingDate;
    }

    public void setTxtFilingDate(LocalDate txtFilingDate) {
        this.txtFilingDate = txtFilingDate;
    }

    public float getGrossIncome() {
        return grossIncome;
    }

    public void setGrossIncome(float grossIncome) {
        this.grossIncome = grossIncome;
    }

    public float getFederalTax() {
        return federalTax;
    }

    public void setFederalTax(float federalTax) {
        this.federalTax = federalTax;
    }

    public float getProvincialTax() {
        return provincialTax;
    }

    public void setProvincialTax(float provincialTax) {
        this.provincialTax = provincialTax;
    }

    public float getCpp() {
        return cpp;
    }

    public void setCpp(float cpp) {
        this.cpp = cpp;
    }

    public float getEi() {
        return ei;
    }

    public void setEi(float ei) {
        this.ei = ei;
    }

    public float getRrspContributed() {
        return rrspContributed;
    }

    public void setRrspContributed(float rrspContributed) {
        this.rrspContributed = rrspContributed;
    }

    public float getCarryForwardRRSP() {
        return carryForwardRRSP;
    }

    public void setCarryForwardRRSP(float carryForwardRRSP) {
        this.carryForwardRRSP = carryForwardRRSP;
    }

    public float getTotalTaxableIncome() {
        return totalTaxableIncome;
    }

    public void setTotalTaxableIncome(float totalTaxableIncome) {
        this.totalTaxableIncome = totalTaxableIncome;
    }

    public float getTotalTaxPayed() {
        return totalTaxPayed;
    }

    public void setTotalTaxPayed(float totalTaxPayed) {
        this.totalTaxPayed = totalTaxPayed;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private int calculateAge(){
        int age;
        LocalDate today = LocalDate.now();
        age = today.getYear() - birthDate.getYear();
        return age;
    }
}

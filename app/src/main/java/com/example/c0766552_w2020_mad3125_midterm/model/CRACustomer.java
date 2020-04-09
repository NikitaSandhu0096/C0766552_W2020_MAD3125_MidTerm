package com.example.c0766552_w2020_mad3125_midterm.model;

import android.icu.text.SimpleDateFormat;
import android.icu.text.TimeZoneFormat;
import android.os.Build;

import androidx.annotation.RequiresApi;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class CRACustomer implements Serializable {
    private String sNumber;
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
    private float maxRRSPAllowed;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public CRACustomer(String sNumber, String firstName, String lastName, String birthDate, String gender, float grossIncome, float rrspContributed) {
        this.sNumber = sNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = calculateFullName();
        this.birthDate = birthDate;
        this.gender = gender;
        this.age = calculateAge(birthDate);
        this.txtFilingDate = calculateFilingDate();
        this.grossIncome = grossIncome;
        this.federalTax = federalTax;
        this.provincialTax = provincialTax;
        this.cpp = calculateCPP();
        this.ei = calculateEI();
        this.rrspContributed = rrspContributed;
        this.carryForwardRRSP = carryForwardRRSP;
        this.totalTaxableIncome = totalTaxableIncome;
        this.totalTaxPayed = totalTaxPayed;
        this.maxRRSPAllowed = maxRRSPAllowed;
    }

    public String getsNumber() {
        return sNumber;
    }

    public float getMaxRRSPAllowed() { return maxRRSPAllowed; }

    public void setMaxRRSPAllowed(float maxRRSPAllowed) { this.maxRRSPAllowed = maxRRSPAllowed; }

    public void setsNumber(String sNumber) {
        this.sNumber = sNumber;
    }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() { return fullName; }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDate() { return birthDate; }

    public void setBirthDate(String birthDate) {
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

    public String getTxtFilingDate() {
        return txtFilingDate;
    }

    public void setTxtFilingDate(String txtFilingDate) { this.txtFilingDate = txtFilingDate; }

    public float getGrossIncome() { return grossIncome; }

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

    public void setRrspContributed(float rrspContributed) { this.rrspContributed = rrspContributed; }

    public float getCarryForwardRRSP() {
        return carryForwardRRSP;
    }

    public void setCarryForwardRRSP(float carryForwardRRSP) { this.carryForwardRRSP = carryForwardRRSP; }

    public float getTotalTaxableIncome() {
        return totalTaxableIncome;
    }

    public void setTotalTaxableIncome(float totalTaxableIncome) { this.totalTaxableIncome = totalTaxableIncome; }

    public float getTotalTaxPayed() {
        return totalTaxPayed;
    }

    public void setTotalTaxPayed(float totalTaxPayed) {
        this.totalTaxPayed = totalTaxPayed;
    }

    private String calculateFullName(){
        String fullName;
        fullName = lastName.toUpperCase() + ", " + firstName.toLowerCase();
        return fullName;
    }

   // @RequiresApi(api = Build.VERSION_CODES.O)
//    private int calculateAge(String birthDate){
//        int age;
//        LocalDate today = LocalDate.now();
//        age = today.getYear();
//                //- birthDate.getYear();
//        return age;
//    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private int calculateAge(String birthDate) {        //https://www.candidjava.com/tutorial/java-program-to-calculate-age-from-date-of-birth/
//        int age;
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
//        Date date1 = dateFormat.parse(birthDate);
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(date1);
//        int year = calendar.get(Calendar.YEAR);
//        int month = calendar.get(Calendar.MONTH) + 1;
//        int date = calendar.get(Calendar.DATE);
//        LocalDate localDate = LocalDate.of(year, month, date);
//        LocalDate now = LocalDate.now();
//        Period period = Period.between(localDate, now);
//        age = period.getYears();
        return age;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private String calculateFilingDate(){           //https://stackoverflow.com/questions/8654990/how-can-i-get-current-date-in-android
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        Date date = Calendar.getInstance().getTime();
        return dateFormat.format(date);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private String calculateBDate() throws ParseException {
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-MM-yyyy");
        Date date = dateFormat1.parse(birthDate);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        birthDate = dateFormat.format(date);
        return birthDate;
    }

    private float calculateCPP(){
        if (grossIncome > 57400){
            cpp = (float) 2927.40;
        }else {
            cpp = (float) (grossIncome*0.051);
        }
        return cpp;
    }

    private float calculateEI(){
        if (grossIncome > 53100){
            ei = (float) 860.22;
        }else {
            ei = (float) (grossIncome*0.0162);
        }
        return ei;
    }
}

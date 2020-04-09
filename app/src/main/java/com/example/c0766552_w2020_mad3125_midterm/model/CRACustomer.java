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
    private double grossIncome;
    private double federalTax;
    private double provincialTax;
    private double cpp;
    private double ei;
    private double rrspContributed;
    private double carryForwardRRSP;
    private double totalTaxableIncome;
    private double totalTaxPayed;
    private double maxRRSPAllowed;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public CRACustomer(String sNumber, String firstName, String lastName, String birthDate, String gender, double grossIncome, double rrspContributed) {
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
        this.provincialTax = calculateProvincialTax();
        this.cpp = calculateCPP();
        this.ei = calculateEI();
        this.rrspContributed = rrspContributed;
        this.carryForwardRRSP = calculateCarryForwardRRSP();
        this.totalTaxableIncome = calculateTotalTaxableIncome();
        this.totalTaxPayed = totalTaxPayed;
        this.maxRRSPAllowed = calculateMaxRRSPAllowed();
    }

    public String getsNumber() {
        return sNumber;
    }

    public double getMaxRRSPAllowed() { return maxRRSPAllowed; }

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

    public double getGrossIncome() { return grossIncome; }

    public void setGrossIncome(double grossIncome) {
        this.grossIncome = grossIncome;
    }

    public double getFederalTax() {
        return federalTax;
    }

    public void setFederalTax(double federalTax) {
        this.federalTax = federalTax;
    }

    public double getProvincialTax() {
        return provincialTax;
    }

    public void setProvincialTax(double provincialTax) {
        this.provincialTax = provincialTax;
    }

    public double getCpp() {
        return cpp;
    }

    public void setCpp(double cpp) {
        this.cpp = cpp;
    }

    public double getEi() {
        return ei;
    }

    public void setEi(double ei) {
        this.ei = ei;
    }

    public double getRrspContributed() {
        return rrspContributed;
    }

    public void setRrspContributed(double rrspContributed) { this.rrspContributed = rrspContributed; }

    public double getCarryForwardRRSP() {
        return carryForwardRRSP;
    }

    public void setCarryForwardRRSP(float carryForwardRRSP) { this.carryForwardRRSP = carryForwardRRSP; }

    public double getTotalTaxableIncome() {
        return totalTaxableIncome;
    }

    public void setTotalTaxableIncome(double totalTaxableIncome) { this.totalTaxableIncome = totalTaxableIncome; }

    public double getTotalTaxPayed() {
        return totalTaxPayed;
    }

    public void setTotalTaxPayed(double totalTaxPayed) {
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

    private double calculateCPP(){
        if (grossIncome > 57400){
            cpp = 2927.40;
        }else {
            cpp = (grossIncome*0.051);
        }
        return cpp;
    }

    private double calculateEI(){
        if (grossIncome > 53100){
            ei = 860.22;
        }else {
            ei = (grossIncome*0.0162);
        }
        return ei;
    }

    private double calculateMaxRRSPAllowed(){
        maxRRSPAllowed = (grossIncome*0.18);
        return maxRRSPAllowed;
    }

    private double calculateTotalTaxableIncome(){
        totalTaxableIncome = (grossIncome - (calculateCPP() + calculateEI() + rrspContributed));
        return totalTaxableIncome;
    }

    private double calculateCarryForwardRRSP(){
        carryForwardRRSP = (calculateMaxRRSPAllowed() - rrspContributed);
        return carryForwardRRSP;
    }

    private double calculateProvincialTax(){

        return provincialTax;
    }
}

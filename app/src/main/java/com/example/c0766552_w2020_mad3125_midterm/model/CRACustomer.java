package com.example.c0766552_w2020_mad3125_midterm.model;

import android.icu.text.SimpleDateFormat;
import android.icu.text.TimeZoneFormat;
import android.os.Build;

import androidx.annotation.RequiresApi;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
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
        this.federalTax = calculateFederalTax();
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
        double totalTaxableIncome1;
        totalTaxableIncome1 = calculateTotalTaxableIncome();
        double tax = 0;
        if(totalTaxableIncome1 > 10582){
            totalTaxableIncome1 = totalTaxableIncome1 - 10582;
            tax = 0;
            if(totalTaxableIncome1 > 43906){
                double a = 43906-10582.01;
                totalTaxableIncome1 = totalTaxableIncome1 - a;
                tax = a*0.0505;
                if(totalTaxableIncome1 > 87813){
                    double b = 87813-43906.01;
                    totalTaxableIncome1 = totalTaxableIncome1 - b;
                    tax = b*0.0915;
                    if (totalTaxableIncome1 > 150000){
                        double c = 150000-87813.01;
                        totalTaxableIncome1 = totalTaxableIncome1 - c;
                        tax = c*0.1116;
                        if (totalTaxableIncome1 > 220000){
                            double d = 220000-150000.01;
                            totalTaxableIncome1 = totalTaxableIncome1 - d;
                            tax = d*0.1216;
                            if (totalTaxableIncome1 > 220000.01){
                                tax = totalTaxableIncome1*0.1316;
                            }
                        }else {
                            tax = totalTaxableIncome1*0.1216;
                        }
                    }else {
                        tax = totalTaxableIncome1*0.1116;
                    }
                }else {
                    tax = totalTaxableIncome1*0.0915;
                }
            }else {
                tax = totalTaxableIncome1*0.0505;
            }
        }
        provincialTax = (tax*100)/100;
        return provincialTax;
    }

    private double calculateFederalTax(){
        double totalTaxableIncome1;
        totalTaxableIncome1 = calculateTotalTaxableIncome();
        double tax = 0;
        if(totalTaxableIncome1 > 12069){
            totalTaxableIncome1 = totalTaxableIncome1 - 12069;
            tax = 0;
            if(totalTaxableIncome1 > 47630){
                double a = 47630-12069.01;
                totalTaxableIncome1 = totalTaxableIncome1 - a;
                tax = a*0.15;
                if(totalTaxableIncome1 > 95259){
                    double b = 95259-47630.01;
                    totalTaxableIncome1 = totalTaxableIncome1 - b;
                    tax = b*0.2050;
                    if (totalTaxableIncome1 > 147667){
                        double c = 147667-95259.01;
                        totalTaxableIncome1 = totalTaxableIncome1 - c;
                        tax = c*0.26;
                        if (totalTaxableIncome1 > 210371){
                            double d = 210371-147667.01;
                            totalTaxableIncome1 = totalTaxableIncome1 - d;
                            tax = d*0.29;
                            if (totalTaxableIncome1 > 210371.01){
                                tax = totalTaxableIncome1*0.33;
                            }
                        }else {
                            tax = totalTaxableIncome1*0.29;
                        }
                    }else {
                        tax = totalTaxableIncome1*0.26;
                    }
                }else {
                    tax = totalTaxableIncome1*0.2050;
                }
            }else {
                tax = totalTaxableIncome1*0.15;
            }
        }
        federalTax = (tax*100)/100;
        BigDecimal bigDecimal = new BigDecimal(federalTax).setScale(2, RoundingMode.UP);        //https://mkyong.com/java/how-to-round-double-float-value-to-2-decimal-points-in-java/
        federalTax = bigDecimal.doubleValue();
        return federalTax;
    }
}

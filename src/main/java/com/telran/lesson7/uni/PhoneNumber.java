package com.telran.lesson7.uni;

import java.util.List;

public class PhoneNumber {

    // cell operator code, number
    // get info about code and number
    // get full number(code+number)

    private int cellOperatorCode;
    private int phoneNumber;

    public PhoneNumber(int cellOperatorCode, int phoneNumber) {
        this.cellOperatorCode = cellOperatorCode;
        this.phoneNumber = phoneNumber;
    }

    public int getCellOperatorCode() {
        return cellOperatorCode;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void getInfoCodeAndNumber() {
        System.out.println("Operator is: " + cellOperatorCode);
        System.out.println("Phone number is: " + phoneNumber);
    }

    public int getFullNumber() {
        return cellOperatorCode + phoneNumber;
    }

    public static void main(String[] args) {
        PhoneNumber phone = new PhoneNumber(0112, 86434576);

        phone.getInfoCodeAndNumber();

        int fullNumber = phone.getFullNumber();

        System.out.println("Operator and Phone number are: " + phone );
    }
}

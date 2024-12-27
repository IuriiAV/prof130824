package com.telran.homeworks.homework4_Tasks.uni;

public class PhoneNumber {

    // cell operator code, number

    // get info about code and number
    // get full number(code+number)


    private String code;
    private String number;

    public PhoneNumber(String code, String number) {
        this.code = code;
        this.number = number;
    }

    public String getInfo() {
        return "Code: " + code + ", Number: " + number;
    }

    public String getFullNumber() {
        return code + number;
    }

    @Override
    public String toString() {
        return getFullNumber();
    }
}
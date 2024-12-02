package com.telran.myLesson7.uni;

public class PhoneNumber {
    //cell operator code, number

    //get info about code and number
    //get full number (code + number)

    private int number;

    private int code;

    public PhoneNumber(int code, int number) {
        this.number = number;
        this.code = code;
    }

    public int getNumber() {
        return number;
    }

    public int getCode() {
        return code;
    }

    public String getFullNumber() {
        return code + " " + number;
    }

    @Override
    public String toString() {
        return code + " " + number;
    }
}

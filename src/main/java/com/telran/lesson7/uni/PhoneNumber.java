package com.telran.lesson7.uni;

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

    public String getCode() {
        return code;
    }

    public String getNumber() {
        return number;
    }

    public String getFullNumber() {
        return code + number;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "code='" + code + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}

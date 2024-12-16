package com.telran.lesson7.uni;

public class PhoneNumber {

    private String code;
    private String number;

    public PhoneNumber(String code, String number) {
        this.code = checkCode(code);
        this.number = checkNumber(number);
    }

    private String checkCode(String code) {
        String operatorCodeRegex = "\\d{3}";
        if (!code.matches(operatorCodeRegex)) {
            throw new IllegalArgumentException("Wrong code: " + code);
        }
        return code;
    }

    private String checkNumber(String number) {
        String phoneNumberRegex = "\\d{3}-\\d{3}-\\d{2}";
        if (!number.matches(phoneNumberRegex)) {
            throw new IllegalArgumentException("Wrong number format: " + number);
        }
        return number;
    }

    public String getCode() {
        return code;
    }

    public String getNumber() {
        return "0" + number;
    }

    public String getFullNumber() {
        return code + number;
    }

    @Override
    public String toString() {
        return "Phone number: +49" + code + number;
    }
}

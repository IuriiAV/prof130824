package com.telran.homework.homework3;

public class PhoneNumber {

    // cell operator code, number
    // get info about code and number
    // get full number(code+number)

    private String operatorCode;
    private String number;

    public PhoneNumber(String operatorCode, String number) {
        this.operatorCode = operatorCode;
        this.number = number;
    }

    public String getFullNumber() {
        return operatorCode + number;
    }

    public String getInfo() {
        return "Код оператора: " + operatorCode + ", Номер: " + number;
    }

    public String getOperatorCode() {
        return operatorCode;
    }

    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Код оператора: " + operatorCode + ", Номер: " + number;
    }
}
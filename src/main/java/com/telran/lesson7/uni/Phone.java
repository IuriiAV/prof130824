package com.telran.lesson7.uni;

/**
 * get info about students , get list of phone numbers
 * cell operator code, number
 * get info about code and number
 * get full number(code+number)
 */
public class Phone {

    String codOperator;

    String number;

    public Phone(String codOperator, String number) {
        this.codOperator = codOperator;
        this.number = number;
    }


    public String getFullNumber(){
        return getCodOperator()+getNumber();
    }


    public String getCodOperator() {
        return codOperator;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Phone " + getFullNumber() ;
    }
}

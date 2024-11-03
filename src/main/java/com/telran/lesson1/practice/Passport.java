package com.telran.lesson1.practice;

public class Passport {

    private String number; //passportNumber - incorrect!!!

    private String validFrom;

    private String validTo;

    public Passport(String number, String validFrom, String validTo) {
        this.number = number;
        this.validFrom = validFrom;
        this.validTo = validTo;
    }

    public String getInfo() {
        return "passport number " + number +
                " valid from " + validFrom +
                " until " + validTo;
    }

    public String getNumber() {
        return number;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public String getValidTo() {
        return validTo;
    }

//    @Override
//    public String toString() {
//        return "passport number " + number +
//                " valid from " + validFrom +
//                " until " + validTo;
   // }


    @Override
    public String toString() {
        return "Passport{" +
                "number='" + number + '\'' +
                ", validFrom='" + validFrom + '\'' +
                ", validTo='" + validTo + '\'' +
                '}';
    }
}

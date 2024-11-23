package com.telran.lesson5;

public class EnumExample {
    public static void main(String[] args) {

        Color white = new Color("White");
        Color red = new Color("Red");

        Days friday = Days.FRIDAY;
        System.out.println(friday);

        Days [] days = Days.values();
        for (Days day : days) {
            System.out.println(day);
        }

        int ordinal = Days.MONDAY.ordinal();
        System.out.println(ordinal);

        String monday = "MONDAY";
        Days days1 = Days.valueOf(monday);
        System.out.println(days1);


    }
}

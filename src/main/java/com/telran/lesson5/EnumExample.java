package com.telran.lesson5;

public class EnumExample {

    public static void main(String[] args) {
        //Colors : Red, White, Black etc
        //Days : Monday,Tuesday  etc
        //Accepted, Rejected etc

        Color white = new Color("White");
        Color red = new Color("Red");

        Day friday = Day.FRIDAY;
        System.out.println(friday);

        //Получение всех значений енама
        Day[] days = Day.values();
        for (Day day : days) {
            System.out.println(day);
        }

        //получение порядкового номера енама
        int ordinal = Day.MONDAY.ordinal();
        System.out.println(ordinal);

        //Получение енама из строкового значения
        String monday = "MONDAY";
        Day day = Day.valueOf(monday);
        System.out.println(day);

        //Получение строкового представления енама
        String name = Day.WEDNESDAY.name();

    }
}

package com.telran.mylesson5;

public class EnumExample {

    public static void main(String[] args) {

        Day friday = Day.FRIDAY;
        System.out.println(Day.SATURDAY);

        // получение всех значений
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

        //получение строкового представления енама
        String name = Day.WEDNSDAY.name();
    }
}

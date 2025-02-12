package com.telran.lesson25;

import java.time.LocalDate;
import java.util.Locale;

public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(" " + now.getYear() + " " + now.getMonth() +
                " " + now.getDayOfWeek() + " " + now.getMonthValue() +
        " " + now.getEra());
        LocalDate date = LocalDate.of(2025, 10, 5);
        System.out.println(date);
        date = date.minusMonths(22);
        System.out.println(date);
        date = date.plusDays(453);
        System.out.println(date);

        System.out.println(date.isLeapYear());


    }
}

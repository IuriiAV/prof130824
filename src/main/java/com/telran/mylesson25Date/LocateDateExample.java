package com.telran.mylesson25Date;

import java.time.LocalDate;

public class LocateDateExample {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getYear() + " "
                + now.getMonth() + " "
                + now.getDayOfWeek() + " "
                + now.getMonthValue());
        LocalDate date = LocalDate.of(2025,10,5);
        System.out.println(date);

        //прибавление и вычитание даты
        date = date.minusMonths(2);
        System.out.println(date);

        date = date.plusDays(453);
        System.out.println(date);

        System.out.println(date.isLeapYear());

    }
}

package com.telran.mylesson25Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDate localDate = now.toLocalDate();
        LocalTime localTime = now.toLocalTime();

        System.out.println("local date " + localDate + "\nlocal time " + localTime);

        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String format = now.format(formatter);
        System.out.println(format);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("YY-MM-dd");
        System.out.println(now.format(formatter1));

    }
}

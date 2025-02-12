package com.telran.lesson25;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDate date = now.toLocalDate();
        LocalTime time = now.toLocalTime();

        LocalDateTime of = LocalDateTime.of(date, time);
        LocalDateTime of1 = LocalDateTime.of(2025, 11, 02, 00, 00);
        System.out.println(of);
        System.out.println(of1);

        DateTimeFormatter formatter = DateTimeFormatter.ISO_WEEK_DATE;
        String format = now.format(formatter);
        System.out.println(format);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("YYYY-MM-dd");
        System.out.println(now.format(formatter1));
    }
}

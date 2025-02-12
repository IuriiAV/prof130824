package com.telran.mylesson25Date;

import java.time.LocalTime;
import java.util.Locale;

public class LocalTimeExample {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();

        System.out.println(now);
        System.out.println(now.getHour() + " " + now.getMinute() + " " + now.getSecond());

        LocalTime time = now.plusHours(4);
        System.out.println(time);
    }
}

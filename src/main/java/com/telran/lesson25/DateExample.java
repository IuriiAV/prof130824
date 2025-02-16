package com.telran.lesson25;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateExample {

    public static void main(String[] args) {
        // 1 Jan 1970 03:00
        Date date = new Date();
        System.out.println("Current date is " + date);

        Date dateTwo = new Date(544453345345l);
        System.out.println("Generated date is " + dateTwo);

        long time = date.getTime();
        System.out.println("Time in mills " + time);
        System.out.println("Date from mills " + new Date(time));

        boolean after = dateTwo.after(date);
        System.out.println(" after " + after);

        boolean before = dateTwo.before(date);
        System.out.println(" before " + before);

        Date customDate = new Date(2025-1900, 02, 11);
        System.out.println("Custom date " + customDate);

        Locale locale = new Locale("fr");
        Date dateLocale = new Date();
        String format = String.format(locale, "%tc\n", dateLocale) + // full
                String.format(locale, "%tD\n", dateLocale) + //MM/DD/YY
                String.format(locale, "%tF\n", dateLocale) + //YYYY-MM-DD
                String.format(locale, "%tr\n", dateLocale) + // Full 12 time
                String.format(locale, "%tz\n", dateLocale) + // GMT offset
                String.format(locale, "%tZ\n", dateLocale); // Time zone
        System.out.println(format);

        Calendar instance = Calendar.getInstance();
        System.out.println(instance);

        SimpleDateFormat dateFormat = new SimpleDateFormat(" E yyyy - dd - MMMM HH:mm:ss");
        String format1 = dateFormat.format(new Date());
        System.out.println(format1);
    }

}

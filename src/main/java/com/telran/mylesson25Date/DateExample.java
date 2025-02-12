package com.telran.mylesson25Date;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateExample {

    public static void main(String[] args) {
        //1 Jan 1970 03:00
        Date date = new Date();
        System.out.println(date);

        Date dateTwo = new Date(0L);
        System.out.println(dateTwo);

        long time = date.getTime();
        System.out.println(time);

        System.out.println("Date from mills: " + new Date(time) );

        boolean after = dateTwo.after(date);
        System.out.println(after);

        Locale locale = new Locale("de");
        Date dateLocale = new Date();
        String format = String.format(locale,"%tc\n",dateLocale);
        System.out.println(format);

        Calendar instance = Calendar.getInstance();
        System.out.println(instance);
    }
}

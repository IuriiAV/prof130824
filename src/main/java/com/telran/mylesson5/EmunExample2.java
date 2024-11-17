package com.telran.mylesson5;

import java.util.Locale;
import java.util.Scanner;

public class EmunExample2 {
    public static void main(String[] args) {
        System.out.println("Input a day: ");
        Scanner sc = new Scanner(System.in);
        String dayOfWeek = sc.next();

        Day day = Day.valueOf(dayOfWeek.toUpperCase(Locale.ROOT));
        System.out.println("This day is " + (day.ordinal() + 1) + " day");

        sc.close();
    }
}

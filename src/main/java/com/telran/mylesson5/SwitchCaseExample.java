package com.telran.mylesson5;

import java.util.Locale;
import java.util.Scanner;

public class SwitchCaseExample {

    public static void main(String[] args) {
        //switch - Enam, String, int
        System.out.println("Input a day: ");
        Scanner sc = new Scanner(System.in);
        String dayOfWeek = sc.next();

        Day day = Day.valueOf(dayOfWeek.toUpperCase(Locale.ROOT));
        dayIsNice(day);

    }

    private static void dayIsNice(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("First working day");
                break;
            case FRIDAY:
                System.out.println("Last working day");
                break;
            case SATURDAY:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Oops");
        }
    }
}

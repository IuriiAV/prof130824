package com.telran.lesson5;

import java.util.Scanner;

public class SwitchCaseExample {

    public static void main(String[] args) {
        //switch- case - Enum, String, int
        System.out.println("Please input day : ");
        Scanner scanner = new Scanner(System.in);
        String dayOfWeek = scanner.next();

        Day day = Day.valueOf(dayOfWeek.toUpperCase());
        dayIsNice(day);
    }

    private static void dayIsNice(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("Bad day");
                break;
            case FRIDAY:
                System.out.println("Funny day");
                break;
            case SUNDAY:
            case SATURDAY:
                System.out.println("Best day");
                break;
            default:
                System.out.println("Oops!");
        }
    }
}

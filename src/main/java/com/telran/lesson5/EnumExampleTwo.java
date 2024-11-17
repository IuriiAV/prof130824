package com.telran.lesson5;

import java.util.Scanner;

public class EnumExampleTwo {

    public static void main(String[] args) {
        System.out.println("Please input day : ");
        Scanner scanner = new Scanner(System.in);
        String dayOfWeek = scanner.next();

        Day day = Day.valueOf(dayOfWeek.toUpperCase());
        System.out.println("This day is " + (day.ordinal() + 1) + " day");

        scanner.close(); // закрытие ресурса сканнер
    }
}

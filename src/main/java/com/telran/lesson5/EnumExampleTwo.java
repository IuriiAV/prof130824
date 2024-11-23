package com.telran.lesson5;

import java.util.Scanner;

public class EnumExampleTwo {

    public static void main(String[] args) {

        System.out.println("Please input day");
        Scanner scanner = new Scanner(System.in);
        String dayOfWeek = scanner.next();

        Days days = Days.valueOf(dayOfWeek);
        System.out.println("This day is " + (days.ordinal() + 1) + " day");

        String name = Days.WEDNESDAY.name();
        System.out.println(name);


        scanner.close();



    }
}

package com.telran.lesson4.passbyvalue;

public class PrimitiveExample {

    public static void main(String[] args) {
        int number = 10;
        // Pass by value - копию значения
        methodOne(number); // methodOne(10);

        System.out.println("Number from main " + number);

        number = methodTwo(number);
        System.out.println("Number from main " + number);
    }

    private static void methodOne(int number) {
        //int number = 10;
        number += 5;
        System.out.println("Number from method " + number);
    }

    private static int methodTwo(int number) {
        //int number = 10;
        number += 5;
        System.out.println("Number from method " + number);
        return number;
    }
}

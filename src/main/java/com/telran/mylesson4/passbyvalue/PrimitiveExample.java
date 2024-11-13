package com.telran.mylesson4.passbyvalue;

public class PrimitiveExample {

    public static void main(String[] args) {
        int number = 10;
        //Pass by value (передача по значению)
        methodOne(number); // methodOne(10)
        System.out.println("Number from method " + number);

        number = methodTwo(number);
        System.out.println("Number from method " + number);
    }

    private static void methodOne(int number) {
        number += 5;
        System.out.println("Number from method " + number);
    }

    private static int methodTwo(int number) {
        number += 5;
        System.out.println("Number from method " + number);
        return number;
    }
}

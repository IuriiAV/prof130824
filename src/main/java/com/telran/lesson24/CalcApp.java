package com.telran.lesson24;

public class CalcApp {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int sum = calculator.sum(5, 7);
        System.out.println("Sum = " + sum);
    }
}

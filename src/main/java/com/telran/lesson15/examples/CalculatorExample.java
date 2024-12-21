package com.telran.lesson15.examples;

public class CalculatorExample {

    public static void main(String[] args) {
        Calculator calculator = (a, b) -> a + b;
        int sum = calculator.sum(10, 5);
        System.out.println(sum);

        System.out.println(calculator.sum(1,5));
        System.out.println(calculator.sum(12,45));

        CalculatorTwo multiplier = ((a, b) -> a * b);
        System.out.println(multiplier.mult(10,4));
    }
}

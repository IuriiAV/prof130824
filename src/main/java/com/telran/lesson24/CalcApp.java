package com.telran.lesson24;

public class CalcApp {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.sum(34345, 45335);
        System.out.println("sum " + sum);
    }
}

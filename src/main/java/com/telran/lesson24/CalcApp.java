package com.telran.lesson24;

public class CalcApp {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.sum(5455, 74123);
        System.out.println("sum " + sum);
        int sub = calculator.sub(5456,5455);
        System.out.println("sub " + sub);
    }
}

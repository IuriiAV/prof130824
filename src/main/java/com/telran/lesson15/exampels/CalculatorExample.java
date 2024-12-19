package com.telran.lesson15.exampels;

public class CalculatorExample {

    public static void main(String[] args) {


        Calculator cal = (a,b) -> a + b;
        int sum = cal.sum(10,5);
        System.out.println(sum);
        System.out.println(cal.sum(1,5));
        System.out.println(cal.sum(5,3));

        CalculatorTwo mult = (a,b) -> a * b;
        System.out.println(mult.mult(10,5));


    }
}

package com.telran.mylesson26ReflectionAPI.customTest;

public class CustomTestCalc {

    @CustomTest
    public void testSum() {
        System.out.println("Sum a + b = 5");
    }

    @CustomTest
    public void testSub() {
        System.out.println("Sum a - b = 1");
        throw new IllegalArgumentException("Incorrect Arg");

    }

    @CustomTest
    public void printResult() {
        System.out.println("Result");

    }
}

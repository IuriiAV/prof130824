package com.telran.lesson26.customtest;

public class CustomTestCalculator {

    @CustomTest
    public void testSum() {
        System.out.println("Sum a + b = 5");
    }

    @CustomTest
    public void testSub() {
        System.out.println("Sum a + b = 1");
        throw new IllegalArgumentException("Incorrect arg");
    }

    @CustomParamTest(ints = {5, 5, 3, 2, 5, 6, 2, 6, 7})
    public void testMult(int param) {
        System.out.println("Mult " + param + " = " + (param * param));
    }

    @CustomParamTest(strings = {"Hello", "Hi", "Hallo", "Hola"})
    public void testSayGreetings(String greeting) {
        System.out.println("Say " + greeting);
    }

    public void printResult() {
        System.out.println("Result");
    }
}

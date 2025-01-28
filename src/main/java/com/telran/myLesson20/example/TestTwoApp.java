package com.telran.myLesson20.example;

public class TestTwoApp {

    public static void main(String[] args) {
        TestTwo<Integer,String> testTwo = new TestTwo<>(1,"Hi","Java");
        System.out.println(testTwo);

        TestTwo<Double, Boolean> hallo = new TestTwo<>(1.00, true, "Hallo");
    }
}

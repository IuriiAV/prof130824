package com.telran.myLesson20;

public class TestApp {

    public static void main(String[] args) {
        TestInteger testInteger = new TestInteger(5);
        System.out.println("Integer obj " + testInteger.getObj());

        TestString hi = new TestString("Hi");
        String obj = hi.getObj();
        System.out.println("String obj " + obj);

        TestObject testObject = new TestObject(5.20);
        Object obj1 = testObject.getObj();
        System.out.println();

        Test<Double> test = new Test<>(1.00);

    }
}

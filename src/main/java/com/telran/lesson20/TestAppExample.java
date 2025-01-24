package com.telran.lesson20;

public class TestAppExample {

    public static void main(String[] args) {

        TestInteger testInteger = new TestInteger(5);
        Integer obj = testInteger.getObj();
        System.out.println("Int obj " + obj);

        TestString testString = new TestString("hello");
        String obj1 = testString.getObj();
        System.out.println("String obj " + obj1);


        TestObject testObject = new TestObject(5.20);
        Double obj2 = (Double) testObject.getObj();
        System.out.println("Double obj " + obj2);

        Test<Boolean> booleanTest = new Test<>(Boolean.TRUE);
        Boolean obj3 = booleanTest.getObj();
        System.out.println("Boolean " + obj3);

        Test<Object> objectTest = new Test<>();

        TestTwo<Integer,String> testTwo = new TestTwo<>(1,"Hello","Java");
        System.out.println(testTwo);




    }
}

package com.telran.summary2401_lesson20;

public class TestAppExample {

    public static void main(String[] args) {
        TestInteger testInteger = new TestInteger(5);
        Integer obj = testInteger.getObj();
        System.out.println("Integer obj " + obj);

        TestString testString = new TestString("Hello");
        String obj1 = testString.getObj();
        System.out.println("String obj " + obj1);

        TestObject testObject = new TestObject(5.20);
        Double obj2 = (Double)testObject.getObj();
        System.out.println("Double obj " + obj2);

        Test<Boolean> testBoolean = new Test<>(Boolean.TRUE);
        Boolean obj3 = testBoolean.getObj();
        System.out.println("Boolean obj " + obj3);

        Test<String> stringTest = new Test<>("Hello");
        String obj4 = stringTest.getObj();

        TestTwo<Integer, String> testTwo = new TestTwo<>(1, "Hello", "Java");
        System.out.println(testTwo);
    }
}

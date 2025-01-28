package com.telran.myLesson20.example;

public class GenericTwoExample {

    public static void main(String[] args) {
        printInfo("hello");
        printInfo(1);
        printInfo(new Student());
        printInfo(Boolean.TRUE);
    }

    public static <T> void printInfo(T element) {
        int i = element.hashCode();
        String name = element.getClass().getName();
        System.out.println("hashCode is " + i + "\n" + "object is " + name);
    }

    public static String getClassName(String element) {
        String name = element.getClass().getName();
        return name;
    }

    public static <T, U> U getClassName(T element) {
        String name = element.getClass().getName();
        return (U) name;
    }
}

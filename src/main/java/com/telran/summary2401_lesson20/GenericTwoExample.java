package com.telran.summary2401_lesson20;

import com.telran.summary2401_lesson20.example.Student;

public class GenericTwoExample {

    public static void main(String[] args) {

        printInfo("hello");
        printInfo(1);
       // printInfo(new Student("AAA"));
        printInfo(Boolean.TRUE);
    }

//    public static void printInfo (String element) {
//        int i = element.hashCode();
//        String name = element.getClass().getName();
//        System.out.println(" hash " + i + " for object with type " + name);
//    }

    public static <T> void printInfo (T element) {
        int i = element.hashCode();
        String name = element.getClass().getName();
        System.out.println(" hash " + i + " for object with type " + name);
    }

    public static String getClassName(String element) {
        String name = element.getClass().getName();
        return name;
    }

//    public static <T, U> getClassName(T element) {
//        String name = element.getClass().getName();
//        return (U) name;
    }


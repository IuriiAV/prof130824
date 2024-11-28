package com.telran.lesson9;

import java.util.HashSet;
import java.util.Set;

public class IncorrectExample {

    public static void main(String[] args) {

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student(1, "Alex", 25));
        studentSet.add(new Student(2, "Oleg", 32));

        System.out.println(studentSet);
        checkInSet(studentSet);
    }

    private static void checkInSet(Set<Student> stSet){
        Student alex = new Student(1, "Alex", 25);
        boolean contains = stSet.contains(alex);
        System.out.println("Set contains Alex = " + contains);
    }
}

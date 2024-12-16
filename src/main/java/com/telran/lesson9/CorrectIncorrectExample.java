package com.telran.lesson9;

import java.util.HashSet;
import java.util.Set;

public class CorrectIncorrectExample {

    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();

        //1,"Alex",25 - 44444
        Student alex = new Student(1, "Alex", 25);
        studentSet.add(alex);
        //2, "Oleg", 30 - 55555
        studentSet.add(new Student(2, "Oleg", 30));

        System.out.println(studentSet);
        alex.setAge(30);
        //1,"Alex",30

        checkInSet(studentSet);
    }

    private static void checkInSet(Set<Student> studentSet) {
        // Alex, 1 , 30
        //1,"Alex",30 - 44455
        Student alex = new Student(1, "Alex", 30);
        boolean contains = studentSet.contains(alex);
        System.out.println("Set contains Alex = " + contains);
    }
}
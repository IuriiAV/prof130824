package com.telran.lesson9;

import java.util.HashSet;
import java.util.Set;

public class CorrectIncorrectExample {

    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();

        //1,"Alex",25 - 44444
        studentSet.add(new Student(1, "Alex", 25)) ;
        studentSet.add(new Student(2, "Oleg", 30)) ;



        System.out.println(studentSet);
        checkInSet(studentSet);
    }

    private static void checkInSet(Set<Student> studentSet) {
        // Alex 1, 25
        //1,"Alex",25 - 44444
        Student alex = new Student(1, "Alex", 25);
        boolean contains = studentSet.contains(alex);
        System.out.println("Set contains Alex : " + contains);


    }
}

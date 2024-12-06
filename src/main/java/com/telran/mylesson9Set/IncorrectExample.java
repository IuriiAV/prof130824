package com.telran.mylesson9Set;

import java.util.HashSet;
import java.util.Set;

public class IncorrectExample {

    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        Student alex = new Student(1, "Alex", 25);
        Student oleg = new Student(2, "Oleg", 30);

        students.add(alex);
        students.add(oleg);

        System.out.println(students);
        checkInSet(students);
    }

    private static void checkInSet(Set<Student> students) {
        Student alex = new Student(1, "Alex", 25);
        students.contains(alex);
        System.out.println();
    }
}

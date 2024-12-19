package com.telran.lesson15;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample {

    public static void main(String[] args) {
        List<Student2> students = Arrays.asList(
                new Student2("Alex", 15),
                new Student2("Oleg", 20),
                new Student2("Max", 18));
        System.out.println("Before " + students);

        SortByAge sortByAge = new SortByAge();
        //Collections.sort(students, sortByAge);
        //System.out.println("After " + students);

        Comparator<Student2> byAgeComparator = new Comparator<Student2>() {
            @Override
            public int compare(Student2 o1, Student2 o2) {
                return o1.getAge() - o2.getAge();
            }
        };

        Collections.sort(students, byAgeComparator);
        System.out.println("After " + students);
    }
}
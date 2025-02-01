package com.telran.lesson15;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alex", 15),
                new Student("Oleg", 20),
                new Student("Max", 18));
        System.out.println("Before " + students);

        SortByAge sortByAge = new SortByAge();
        //Collections.sort(students, sortByAge);
        //System.out.println("After " + students);

        Comparator<Student> byAgeComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        };

        Collections.sort(students, byAgeComparator);
        System.out.println("After " + students);
    }
}

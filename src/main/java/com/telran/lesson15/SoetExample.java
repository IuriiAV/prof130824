package com.telran.lesson15;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SoetExample {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Oleg",15),
                new Student("D",1),
                new Student("A",45)
        );

//        SortByAge sortByAge = new SortByAge();
//        Collections.sort(students,sortByAge);
//        System.out.println(students);

        Comparator<Student> byAgeComtor = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        Collections.sort(students,byAgeComtor);
        System.out.println(students);


        Printer printer = () -> System.out.println("Yo");



    }
}

package com.telran.lesson16.studentapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentApp {

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("Oleg", 25),
                new Student("Max", 35),
                new Student("Petr", 18)
        );

        List<Student> students = new ArrayList<>();
        for (Student student : list) {
            int age = student.getAge();
            student.setAge(age + 5);
            students.add(student);
        }

        List<Student> collect = list.stream()
                .peek(student -> student.setAge(student.getAge() + 5))
                .collect(Collectors.toList());

        list.stream()
                .forEach(student -> student.setAge(student.getAge() + 5));

    }
}
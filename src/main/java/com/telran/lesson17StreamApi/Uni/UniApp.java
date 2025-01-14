package com.telran.lesson17StreamApi.Uni;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniApp {

    public static void main(String[] args) {
        Student studentOne = new Student(1, "Alex");
        Student studentTwo = new Student(2, "John");

        studentOne.addBook("Alice in Wonderland");
        studentOne.addBook("Brit Mari");
        studentOne.addBook("Snow");

        studentTwo.addBook("Alice in Wonderland");
        studentTwo.addBook("Tree");
        studentTwo.addBook("Sky");

        List<Student> students = Arrays.asList(studentOne, studentTwo);

        students.stream()
                .map(student -> student.getBooks())
                .flatMap(b -> b.stream())
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }
}

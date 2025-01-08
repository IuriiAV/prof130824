package com.telran.lesson16StreamApi;

import com.telran.lesson16StreamApi.studentApp.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiMapExample {

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("Oleg", 25),
                new Student("Max", 35),
                new Student("Petr", 18));

        List<String> collect = list.stream()
                .map(student -> student.getName())
                .sorted().collect(Collectors.toList());

        System.out.println(collect);
    }
}

package com.telran.myLesson10.example;

import java.util.HashSet;
import java.util.Set;

public class App {

    public static void main(String[] args) {
        Set<Object> set = new HashSet<>();
        Person person = new Person("Alex");
        set.add(person);
        System.out.println(set);
        Student student = new Student("Alex");

        System.out.println(person.hashCode());
        System.out.println(student.hashCode());

        System.out.println("" + set.contains(student));
    }
}

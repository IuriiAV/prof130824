package com.telran.lesson10.Example;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ExampleApp {

    public static void main(String[] args) {

        Set<Object> set = new HashSet<>();

        Person person = new Person("Alex");
        set.add(person);

        Student student = new Student("Alex");

        System.out.println(person.hashCode());
        System.out.println(student.hashCode());


    }
}

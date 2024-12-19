package com.telran.lesson15_StreamAPI.baseFI;

import com.telran.lesson15_StreamAPI.Student;

import java.util.function.Function;

/**
 *
 */

public class FunctionExample {

    public static void main(String[] args) {
        Function<Integer, Double> half = (a) -> a / 2.0;
        System.out.println(half.apply(5));

        Function<String, String> translator = (a) -> a.toLowerCase();
        System.out.println(translator.apply("HeLlO"));

        Student student = new Student("Oleg", 35);
        Function<Student, String> nameGetter = (st) -> st.getName();
        System.out.println(nameGetter.apply(student));
    }
}

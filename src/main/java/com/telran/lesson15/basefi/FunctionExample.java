package com.telran.lesson15.basefi;

import com.telran.lesson15.Student;

import java.util.function.Function;

/**
 * Function :
 * method apply
 * Принимает один параметр и возвращает другой параметр
 * Тип принимаемого и возвращаемого значения может один и тот же или разный
 * Function<Тип принимаемого, Тип возвращаемого>
 */
public class FunctionExample {

    public static void main(String[] args) {
        Function<Integer,Double> half = (a) -> a / 2.0;
        Double result = half.apply(5);
        System.out.println(result);

        Function<String, String> translator = (text) -> text.toLowerCase();
        System.out.println(translator.apply("HELLO"));

        Student student = new Student("Oleg", 35);
        Function<Student, String> nameGetter = st -> st.getName();

        System.out.println(nameGetter.apply(student));
    }
}

package com.telran.summary9;

import java.util.stream.Stream;

/**
 * Annotation notEmpty  поле null and empty
 * Должен быть не обязательный параметр skip
 * указываем что пропускаем при валидации
 * Annotation notEmpty
 * Student name Email address
 * Validator method validate
 */
public class ValidatorApp {

    public static void main(String[] args) {
        Student studentOne = new Student("Max", "123odin@gmail.com", 46, "Address123");
        Student studentTwo = new Student(null, "123odin@gmail.com", 50, "Address999");
        Student studentThree = new Student("", "123two@gmail.com", 48, "");

        Validator validator = new Validator();
        Stream.of(studentOne,studentTwo,studentThree).forEach(student -> {
            try {
                validator.validate(student);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });


    }
}

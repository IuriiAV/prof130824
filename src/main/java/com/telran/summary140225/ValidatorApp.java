package com.telran.summary140225;

import java.util.stream.Stream;

/**
 * Аннотация NotEmpty
 * проверка на пустоту и на 0
 * Должен біть обяз параметр skip
 * в єтом параматере будет enam где мы укажем что пропускаем при валидации при проверке
 * 1 Аннотация NotEmpty
 * 2 Класс Student name, email,age, Address
 * 3 Объект валидатор с методом validate куда будет передавать обїект для валидации
 */
public class ValidatorApp {

    public static void main(String[] args) {

        Student studentOne = new Student("Max", "123odin@gmail.com", 46, "Address123");
        Student studentTwo = new Student(null, "123odin@gmail.com", 50, "Address999");
        Student studentThree = new Student("Oleg", "123two@gmail.com", 48, "");

        Validator validator = new Validator();

        Stream.of(studentOne, studentTwo, studentThree).forEach(student -> {
            try {
                validator.validate(student);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });
    }
}
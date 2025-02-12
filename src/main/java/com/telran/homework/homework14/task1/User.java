package com.telran.homework.homework14.task1;

import lombok.Getter;

@Getter
public class User {

    private final String name;

    private final int age;

    public User(String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("age does not meet requirements");
        }
        this.name = name;
        this.age = age;
    }

}
//  1 уровень сложности: Задача 1:
//Создайте класс User, который содержит имя и возраст.
//Реализуйте класс InvalidAgeException, который наследуется от Exception и выбрасывается в случае, если возраст меньше 18 лет.
//
//Требования:
//
//
//Создать класс User с полями name (String) и age (int).
//Создать конструктор, который выбрасывает InvalidAgeException, если age < 18.
//Реализовать геттеры для полей.
package com.telran.homeworks.homework14.task1;

/**
 * Создайте класс User, который содержит имя и возраст.
 * Реализуйте класс InvalidAgeException, который наследуется от Exception и выбрасывается в случае, если возраст меньше 18 лет.
 *
 * Требования:
 *
 *
 * Создать класс User с полями name (String) и age (int).
 * Создать конструктор, который выбрасывает InvalidAgeException, если age < 18.
 * Реализовать геттеры для полей.
 */
public class User {

    private String name;

    private int age;

    public User(String name, int age) throws InvalidAgeException {
        if (age < 18){
            throw new InvalidAgeException("Age must be 18 or older");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

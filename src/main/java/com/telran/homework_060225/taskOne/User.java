package com.telran.homework_060225.taskOne;

public class User {

    private String name;

    private int age;

    public User(String name, int age) throws InvalidAgeException {
        this.name = name;
        if (age < 18){
            throw new InvalidAgeException("Age must be 18 or older");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

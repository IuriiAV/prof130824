package com.telran.homework14.taskUser;

public class User {

    private String name;

    private int age;

    public User(String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You are too young");
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

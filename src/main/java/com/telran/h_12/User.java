package com.telran.h_12;

public class User {

    private String name;

    private int Age;

    public User(String name, int age) throws InvalidAgeException {
        this.name = name;

        if (age < 18) {
                throw new InvalidAgeException("InvalidAgeException,  age < 18.");
        } else {
            Age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return Age;
    }
}

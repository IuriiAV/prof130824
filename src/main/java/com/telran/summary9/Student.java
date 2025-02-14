package com.telran.summary9;

import lombok.Getter;

@Getter
public class Student {

    @NonEmpty
    private String name;

    @NonEmpty
    private String email;

    private int age;

    @NonEmpty(skip = Skip.SKIP_EMPTY)
    private String address;

    public Student(String name, String email, int age, String address) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}

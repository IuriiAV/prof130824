package com.telran.homework.homework9.university;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public class Student {

    @Getter
    private final int id;

    @Setter
    @Getter
    private String firstName;

    @Setter
    @Getter
    private String lastName;

    private static int currentId = 0;

    public Student(String firstName, String lastName) {
        this.id = ++currentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return firstName + ' ' + lastName + " {ID: " + id + "}";
    }
}

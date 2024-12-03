package com.telran.lesson7.uni;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {

    private String name;
    private int age;
    private int rate;
    private final List<PhoneNumber> numbers = new ArrayList<>();

    public Student(String name, int age, int rate) {
        this.name = name;
        this.age = age;
        this.rate = rate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setNumber(String code, String number) {
        try {
            numbers.add(new PhoneNumber(code, number));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        numbers.add(new PhoneNumber(code, number));
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRate() {
        return rate;
    }

    public List<PhoneNumber> getNumbers() {
        return numbers;
    }

    @Override
    public String toString() {
        return "NAME: " + name + ", " +
                "AGE: " + age + ", " +
                "RATE: " + rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && rate == student.rate &&
                Objects.equals(name, student.name) &&
                Objects.equals(numbers, student.numbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, rate, numbers);
    }
}

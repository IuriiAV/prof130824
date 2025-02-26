package com.telran.lesson7.uni;

import java.util.List;
import java.util.Objects;

public class Student {

    // name, age, rate, few phone numbers

    // get info about students , get list of phone numbers
    private String name;
    private int age;
    private int rate;
    private List<PhoneNumber> numbers;

    public Student(String name, int age, int rate, List<PhoneNumber> numbers) {
        this.name = name;
        this.age = age;
        this.rate = rate;
        this.numbers = numbers;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public void addRate(int points){
        this.rate+=points;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rate=" + rate +
                ", numbers=" + numbers +
                '}';
    }
}

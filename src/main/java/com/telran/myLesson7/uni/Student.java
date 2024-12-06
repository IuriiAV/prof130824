package com.telran.myLesson7.uni;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {

    //name, age, rate, a few phone numbers

    //get info about student
    //get list of phone numbers

    private String name;

    private int age;

    private double rate;

    private List<PhoneNumber> phoneNumbers = new ArrayList<>();

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void addPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumbers.add(phoneNumber);
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void upRate() {
        this.rate++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rate=" + rate +
                ", phoneNumbers=" + phoneNumbers +
                "}\n";
    }
}

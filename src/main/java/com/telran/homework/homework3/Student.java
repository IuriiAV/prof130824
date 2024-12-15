package com.telran.homework.homework3;

import java.util.ArrayList;
import java.util.List;

public class Student {

    // name, age, rate, few phone numbers

    // get info about students , get list of phone numbers

    private String name;
    private int age;
    private int rate;

    List<PhoneNumber>phoneNumbers = new ArrayList<>();

    public Student(String name, int age, int rate, List<PhoneNumber> phoneNumbers) {
        this.name = name;
        this.age = age;
        this.rate = rate;
        this.phoneNumbers = phoneNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name :'" + name + '\'' +
                ", age :" + age +
                ", rate :" + rate +
                ", phoneNumbers :" + phoneNumbers +
                '}';
    }
}
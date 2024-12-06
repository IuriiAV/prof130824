package com.telran.homeworks.homework4_Tasks.uni;

import java.util.ArrayList;
import java.util.List;

public class Student {

    // name, age, rate, few phone numbers

    //get info about students, get list of phone numbers

    private String name;
    private int age;
    private double rate;
    private List<PhoneNumber> phoneNumbers;

    public Student(String name, int age, double rate) {
        this.name = name;
        this.age = age;
        this.rate = rate;
        this.phoneNumbers = new ArrayList<>();
    }

    public void addPhoneNumber(PhoneNumber phoneNumber) {
        phoneNumbers.add(phoneNumber);
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public String getInfo() {
        return "Name: " + name + ", Age: " + age + ", Rate: " + rate;
    }

    public void upgradeRate() {
        this.rate += 1;
    }

    @Override
    public String toString() {
        return getInfo() + ", Phones: " + phoneNumbers;
    }


}
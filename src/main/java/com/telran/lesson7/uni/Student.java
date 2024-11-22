package com.telran.lesson7.uni;

import java.util.ArrayList;
import java.util.List;

/**
 *  name, age, rate, few phone numbers
 */
public class Student {

    String name;

    int age;

    int rate;

    List<Phone>  phoneNumber ;

    public Student(String name, int age, int rate, List<Phone> phoneNumber) {
        this.name = name;
        this.age = age;
        this.rate = rate;
        this.phoneNumber = phoneNumber;
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

    public List<Phone> getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return " Student is " + this.name + " age= " + this.age +
                " rate= " + this.rate +
                ",Number=" + this.phoneNumber +
                "\n";
    }
}

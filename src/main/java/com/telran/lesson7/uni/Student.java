package com.telran.lesson7.uni;

import java.util.List;

public class Student {

    // name, age, rate, few phone numbers

    // get info about students , get list of phone numbers
    private String name;

    private int age;

    private int rate;

    private List<String> phoneNumbers;

    public Student(String name, int age, int rate, List<String> phoneNumbers) {
        this.name = name;
        this.age = age;
        this.rate = rate;
        this.phoneNumbers = phoneNumbers;
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

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    //public void addPhoneNumber(Integer phoneNumber) {
    //    phoneNumber.add(phoneNumber);
    //}

    public String getStudentInfo() {
        return "Student: " + name + ", age: " + age + ", rate: "
                + rate + ".";
    }

    public List getListPhone() {
        return phoneNumbers;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass())
        return false;
        Student student = (Student) obj;
        return name.equals(student.name) && age == student.age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }



    public static void main(String[] args) {

    }

}




package com.telran.homeworks.hw01_05_11_24;

public class Person {

    private String name;

    private String fullName;

    private int age;

    public Person() {}

    public Person(String name, String fullName, int age) {
        this.name = name;
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(this.fullName + " is moving.");
    }

    public void talk() {
        System.out.println(this.fullName + " is talking.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

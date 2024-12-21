package com.telran.lesson15_StreamAPI.task1;

public class Person {

    private int id;

    private String name;

    private String lastName;

    private int rate;

    public Person(int id, String name, String lastName, int rate) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.rate = rate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rate=" + rate +
                '}';
    }
}

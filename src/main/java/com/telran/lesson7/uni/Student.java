package com.telran.lesson7.uni;

import java.util.List;

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
    public boolean equals(Student student){
        return this.name.equals(student.name) && this.age==student.getAge();
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

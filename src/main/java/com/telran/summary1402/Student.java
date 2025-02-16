package com.telran.summary1402;

public class Student {

    //Класс Student с полями NAme,email,age,address
    @NotEmpty
    private String name;

    @NotEmpty
    private String email;

    private int age;

    @NotEmpty(skip = Skip.SKIP_EMPTY)
    private String address;

    public Student(String name, String email, int age, String address) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
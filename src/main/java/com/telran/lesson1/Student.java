package com.telran.lesson1;


public class Student {

    String name;

    int age;
    //Конструктор есть у любого класса, если он явно не написан
    //то он будет добавлен в код при компиляции приложения
    //Ниже конструктор по умолчанию, или - конструктор без параметров
    public Student() {
        System.out.println("Call default constructor when create student");
    }

    public Student(String studentName) {
        name = studentName;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(int age) {
        this.age = age;
    }
}

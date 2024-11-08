package com.telran.homework.homework_051124.task_1;

public class PersonApp {


    public static void main(String[] args) {

        Person personOne = new Person();
        Person personTwo = new Person("Tom", "Tomson", 30);

        personOne.setName("Max");
        personOne.setFullName("Maximov");
        personOne.setAge(25);

        personOne.talk();
        personOne.move();

        personTwo.move();
        personTwo.talk();
    }
}

package com.telran.lesson1;

public class StudentApp {

    public static void main(String[] args) {
        //Объявление типа + имя переменной = new + вызов конструктора класса
        //на основании которого создается объект
        Student studentOne = new Student();
        studentOne.name = "Alex";
        studentOne.age = 25;
        System.out.println("Student one info " + studentOne.name + " , " + studentOne.age);

        Student studentTwo = new Student("Max");
        studentTwo.age = 30;
        System.out.println("Student two info " + studentTwo.name + " , " + studentTwo.age);

        Student studentThree = new Student("Oleg", 27);
        System.out.println("Student three info " + studentThree.name + " , " + studentThree.age);

        Student studentFour = new Student(30);
    }
}

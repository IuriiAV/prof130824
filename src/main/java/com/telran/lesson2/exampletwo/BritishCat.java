package com.telran.lesson2.exampletwo;

public class BritishCat extends Cat {

    public void printCatInfo() {
        //super - обращение к переменной, методу, конструктору родительского класса
        System.out.println("Cat name " + getName() + " breed " + super.breed);
    }
}

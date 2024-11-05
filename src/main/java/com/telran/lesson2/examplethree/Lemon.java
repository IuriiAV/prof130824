package com.telran.lesson2.examplethree;

public class Lemon extends Fruit {

    public Lemon(String title, int weight, String color) {
        super(title, weight, color);
    }

    @Override
    public boolean isRipe() {
        //вернуть результат работы метода родительского класса
        //return super.isRipe();
        return false;
    }
}

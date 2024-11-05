package com.telran.lesson2.examplethree;

public class Apple extends Fruit {
    //super() - вызов конструктора родительского класса
    public Apple(String title, int weight, String color) {
        super(title, weight, color);
    }

    public Apple(String title, int weight) {
        super(title, weight);
    }
}

package com.telran.lesson2.examplethree;

import java.util.function.Function;

public class FruitApp {

    public static void main(String[] args) {
        Apple appleRed = new Apple("apple", 150, "red");
        Banana banana = new Banana("banana", 200, "green");
        PineApple pineApple = new PineApple("pineapple", 450, "yellow");
        Apple apple = new Apple("apple", 300);
        Banana bananaOne = new Banana("banana", 150, "yellow", "Ecuador");
        Lemon lemon = new Lemon("lemon", 120, "yellow");
        Pear pear = new Pear("pear", 50, "green");


        Fruit[] fruits = {appleRed, apple, banana, pineApple, bananaOne, lemon, pear};
        for (Fruit fruit : fruits) {
            printFruit(fruit);
            if (fruit.isRipe()) {
                System.out.println("This fruit " + fruit.getTitle() + " is ripe");
            } else {
                System.out.println("This fruit " + fruit.getTitle() + " is not ripe");
            }
        }
    }

    private static void printFruit(Fruit fruit) {
        System.out.println(fruit);
    }
}

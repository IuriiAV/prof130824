package com.telran.lesson3;

public class ZooExampleTwo {

    public static void main(String[] args) {
        Bird bird = new Bird("Bird");
        Bug bug = new Bug();
        Animal[] animals = {new Lion("Lion"), new Whale("Whale"),
                new Rabbit("Rabbit"), bird};
        for (Animal animal : animals) {
            System.out.println("Animal name " + animal.getName());
            workWithAnimal(animal);
        }

        Flyable[] flyables = {bird, bug};
        for (Flyable flyable : flyables) {
            flyable.fly();
        }
    }

    private static void workWithAnimal(Animal animal) {
        animal.drink();
        animal.eat();
    }
}

package com.telran.lesson3;

public class ZooExampleTwo {

    public static void main(String[] args) {
        Animal[] animals = {new Lion("Lion"), new Whale("Whale"),
                new Rabbit("Rabbit")};
        for (Animal animal : animals) {
            System.out.println("Animal name " + animal.getName());
            workWithAnimal(animal);
        }
    }

    private static void workWithAnimal(Animal animal) {
        animal.drink();
        animal.eat();
    }
}

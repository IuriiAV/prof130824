package com.telran.lesson3;


public class ZooExample {

    public static void main(String[] args) {
        Horse horse = new Horse();
        Lion lion = new Lion();
        Rabbit rabbit = new Rabbit();

//        horse.setName("Horse");
//        lion.setName("Lion");
//        rabbit.setName("Rabbit");

        Animal[] animals = {horse,lion,rabbit};
        for (Animal animal : animals) {
            animal.eat();
            animal.drink();
        }
    }
}

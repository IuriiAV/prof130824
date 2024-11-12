package com.telran.lesson3.interfaceexample;

public class App {

    public static void main(String[] args) {
        Horse horse = new Horse();
        Whale whale = new Whale();
        Rabbit rabbit = new Rabbit();
        Shark shark = new Shark();
        Ship ship = new Ship();

        CanEat[] canEats = {horse, whale, rabbit, shark};
        for (CanEat canEat : canEats) {
            canEat.eat();
            canEat.print();
        }

        CanSwim[] canSwims = {whale, shark, ship};
        for (CanSwim swim : canSwims) {
            swim.swim();
        }

        CanJump[] canJumps = {rabbit, horse};
        for (CanJump canJump : canJumps) {
            canJump.jump();
        }
//
//        Animal horse1 = new Horse();
//        Animal rabbit1 = new Rabbit();
//        Animal[] animals = {horse1, rabbit1};
//        for (Animal animal : animals) {
//            animal.print();
//            if (animal instanceof Horse) {
//                Horse horse2 = (Horse) animal;
//                horse2.run();
//            }
//        }
    }
}

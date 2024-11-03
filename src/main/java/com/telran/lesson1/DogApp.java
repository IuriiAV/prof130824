package com.telran.lesson1;

public class DogApp {

    public static void main(String[] args) {
        Dog barsik = new Dog("Barsik", 35);
        System.out.println("Dog name " + barsik.getName() + " , age =  " + barsik.getAge());

        barsik.setAge(40);
        System.out.println("Dog name " + barsik.getName() + " , age =  " + barsik.getAge());

        barsik.setAge(30);
        System.out.println("Dog name " + barsik.getName() + " , age =  " + barsik.getAge());

        barsik.greetings(false);

    }
}

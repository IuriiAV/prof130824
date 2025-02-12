package com.telran.h_12;

public class App {

    public static void main(String[] args) {

        try {
            User kostya = new User("Kostya", 35);
            System.out.println(kostya.getAge());

            User max = new User("Max", 5);
            System.out.println(max.getAge());
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }

    }
}

package com.telran.lesson4.example;

public class PersonApp {

    public static void main(String[] args) {
        Person alex = new Person("Alex", 25); // #FFEEAA
        System.out.println(alex);

        changePersonAge(alex); //changePersonAge(#FFEEAA)

        System.out.println(alex); // #FFEEAA
    }

    private static void changePersonAge(Person person) {
        //Person person = #FFEEAA
        person.setAge(40);
    }
}

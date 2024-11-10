package com.telran.lesson1.h1;

public class PersonApp {

    public static void main(String[] args) {


        Person person1 = new Person();
        Person person2 = new Person("Dulsineja", "Tobosskaja", 400);
        person1.move();
        person2.move();
        person1.talkTalkTalk();
        person2.talkTalkTalk();

    }
}

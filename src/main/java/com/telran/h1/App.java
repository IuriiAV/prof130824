package com.telran.h1;

public class App {
    public static void main(String[] args) {

        Person personOne = new Person();
        personOne.setName("Olga");
        personOne.setFullName("Sierikova");
        personOne.setAge(35);

        Person personTwo = new Person("Konstantin", "Sieriko", 35);

        personOne.move();
        personOne.talk();

        personTwo.move();
        personTwo.talk();

        Phone phoneOne = new Phone("050785054","Samsung x25",150);
        Phone phoneTwo = new Phone("069456216","Nokia 2517", 100);
        Phone phoneThree = new Phone("093685635", "Asus c58", 180);


        Phone[] phones = {phoneOne,phoneTwo,phoneThree};
        for(Phone tempPhone : phones){

            System.out.println("Номер телефона " + tempPhone.getNumber());
            System.out.println("Модель телефона " + tempPhone.getModel());
            System.out.println("Вес телефона " + tempPhone.getWeight());

            System.out.println(tempPhone);

            tempPhone.receiveCall(personTwo);

        }
    }



}


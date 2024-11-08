package com.telran.homeworks.hw01_05_11_24;

public class App {

    public static void main(String[] args) {
        Person personOne = new Person();
        Person personTwo = new Person("John", "John Doe", 45);
        Person personThree = new Person("Robert", "Robert Downey Jr.", 59);

        personOne.setName("Matthew");
        personOne.setFullName("Matthew McConaughey");
        personOne.setAge(55);

        Person[] people = {personOne, personTwo, personThree};

        for (Person person: people) {
            System.out.println();
            person.talk();
            person.move();
        }

        Phone phoneOne = new Phone(123456, "iPhone", 210);
        Phone phoneTwo = new Phone(234567, "Samsung", 200);
        Phone phoneThree = new Phone(345678, "Xiaomi", 190);

        Phone[] phones = {phoneOne, phoneTwo, phoneThree};
        for (Phone phone: phones) {
            System.out.printf("\n%s has number: %d. And the weight of it is %d g.", phone.getModel(), phone.getNumber(), phone.getWeight());
        }

        System.out.println();

        for (int i = 0; i < phones.length; i++) {
            phones[i].receiveCall(people[i].getFullName());
            System.out.println(phones[i].getNumber());
        }
    }
}

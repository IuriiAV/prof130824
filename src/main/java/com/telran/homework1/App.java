package com.telran.homework1;

public class App {

    public static void main(String[] args) {

        Person personOne = new Person();
        personOne.setName("Ivan");
        personOne.setFullName("Ivan Ivanov");
        personOne.setAge(35);

        Person personTwo = new Person("Petr", "Petr Petrov", 33);

        Person[] people = {personOne, personTwo};

        for (Person person : people) {
            person.move();
            person.talk();
        }

        Phone phoneOne = new Phone(12345, "Samsung", 18.3);
        Phone phoneTwo = new Phone(45677, "iPhone", 12.4);
        Phone phoneThree = new Phone(8765, "Nokia", 33.1);

        Phone[] phones = {phoneOne, phoneTwo, phoneThree};

        for (Phone phone : phones) {
            System.out.println("Phone's info: " + phone.getModel() + ", "
                    + phone.getNumber() + ", " + phone.getWeight());
        }

        phoneOne.receiveCall(personOne.getFullName());
        phoneTwo.receiveCall(personTwo.getFullName());
        phoneThree.receiveCall("Maria Markova");
    }
}

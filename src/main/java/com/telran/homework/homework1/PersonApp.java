package org.telran.homework.homework1;

public class PersonApp {
    public static void main(String[] args) {


        Person personOne = new Person();
        personOne.setName("Donald");
        personOne.setFullName("Donald Trump");
        personOne.setAge(90);


        Person personTwo = new Person("Boris", "Boris Johnsonyuk",60);

        personOne.move();
        personOne.talk();

        personTwo.move();
        personTwo.talk();

    }



}

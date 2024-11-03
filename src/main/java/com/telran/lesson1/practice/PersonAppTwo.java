package com.telran.lesson1.practice;

public class PersonAppTwo {

    public static void main(String[] args) {
        Person one = new Person("Alex", "Alexeev", 30, "alex@gmail.com");
        Passport onePassport = new Passport("5555555", "2020-10-10", "2030-10-10");
        one.setPassport(onePassport);

//        String infoOne = onePassport.getInfo();
//        System.out.println(infoOne);

//        String infoTwo = onePassport.toString();
//        System.out.println(infoTwo);
        System.out.println(one);

        one.showPassport();


        //        System.out.println("Person : " + one.getName() + " " + one.getSurname() +
        //                " , with age " + one.getAge() + " , contact email " + one.getEmail() +
        //                " passport : " + one.getPassport().getNumber() + " valid : "
        //                + one.getPassport().getNumber());
    }
}

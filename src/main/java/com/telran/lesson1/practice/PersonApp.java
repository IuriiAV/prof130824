package com.telran.lesson1.practice;

public class PersonApp {

    public static void main(String[] args) {

        Person one = new Person("Alex", "Alexeev", 30, "alex@gmail.com");
        Person two = new Person("Max", "Maximov", 25, "max@gmail.com");

        Passport onePassport = new Passport("5555555","2020-10-10","2030-10-10");
        Passport twoPassport = new Passport("4444444","2010-05-05","2010-05-05");

        Passport olegPassport = new Passport("222222","2011-07-05","2011-07-05");
        Person three = new Person("Oleg","Olegov",20,"oleg@gmail.com", olegPassport);

        one.setPassport(onePassport);
        two.setPassport(twoPassport);

        Person[] people = {one, two};

        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            System.out.println("Person : " + person.getName() + " " + person.getSurname() +
                    " , with age " + person.getAge() + " , contact email " + person.getEmail());
        }

        // for(TypeElementOfArray nameVariable : array) {
        //   в каждой итерации цикла , в переменную nameVariable
        //   будет записываться очередной элемент массива
        // }

        for (Person person : people) { // person = people[0]; person = people[1] etc
            person.printInfo();
            person.setAge(18);
            String info = person.getInfo();
            System.out.println(info);

//            System.out.println("Person : " + person.getName() + " " + person.getSurname() +
//                    " , with age " + person.getAge() + " , contact email " + person.getEmail());
        }
    }
}

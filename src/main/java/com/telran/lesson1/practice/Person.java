package com.telran.lesson1.practice;

public class Person {

    // name, surname , age , email
    // constructor, getters

    private String name;

    private String surname;

    private int age;

    private String email;

    private Passport passport;

    public Person(String name, String surname, int age, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
    }

    //this(); super(); - this() - вызов конструктора текущего класса
    public Person(String name, String surname, int age, String email, Passport passport) {
        this(name, surname, age, email);
        this.passport = passport;
    }

    public String getInfo() {
        //inline variable
        return "Person : " + name + " " + surname +
                " , with age " + age + " , contact email " + email
                + ", passport : " + passport.getInfo();
    }

    public void printInfo() {
        System.out.println("Person : " + name + " " + surname +
                " , with age " + age + " , contact email " + email
                + ", passport : " + passport.getInfo());
    }

    public void showPassport() {
//        if(passport == null) {
//            System.out.println("Passport not exists");
//            return;
//        }
//        System.out.println(passport);
        if (passport != null) {
            System.out.println(passport);
        }
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public void setAge(int age) {
        // current age < age < 60
        //        if (age > this.age && age < 60) {
        //            this.age = age;
        //        } else {
        //            System.out.println("Age is incorrect");
        //        }
        if (age <= this.age || age >= 60) {
            System.out.println("Age is incorrect");
            return;
        }

        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public Passport getPassport() {
        return passport;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", passport=" + passport +
                '}';
    }
}

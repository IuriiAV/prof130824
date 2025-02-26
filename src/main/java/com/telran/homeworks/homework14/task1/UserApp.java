package com.telran.homeworks.homework14.task1;

public class UserApp {

    public static void main(String[] args) {
        try {
            User user = new User("Alice", 25);
            System.out.println("User created: " + user.getName() + ", Age: " + user.getAge());
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        try {
            User user = new User("Bob", 17);
            System.out.println("User created: " + user.getName() + ", Age: " + user.getAge());
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

package com.telran.homework.homework14;

import com.telran.homework.homework14.task1.InvalidAgeException;
import com.telran.homework.homework14.task1.User;

public class App {

    public static void main(String[] args) {
        try {
            User alex = new User("Alex", 20);
            User anna = new User("Anna", 14);
            System.out.println(alex.getName() + anna.getName());
        } catch (InvalidAgeException e) {
            System.err.println(e.getMessage());
        }
    }
}

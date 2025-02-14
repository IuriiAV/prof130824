package com.telran.homework14.taskUser;

public class UserApp {

    public static void main(String[] args) {
        try {
            User user = new User("Alex", 12);
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }
    }
}

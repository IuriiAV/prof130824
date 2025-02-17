package com.telran.homework_060225.taskTwo;

import com.telran.homework_060225.taskOne.InvalidAgeException;
import com.telran.homework_060225.taskOne.User;

public class BankApp {

    public static void main(String[] args) {
        try {
            User user1 = new User("John", 16);
            User user2 = new User("Jan", 26);
            User user3 = new User("Ben", 32);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            BankAccount account1 = new BankAccount(100);
            account1.deposit(-50);
            account1.withdraw(200);
            System.out.println("Balance :" + account1.getBalance());
        } catch (NegativeDepositException |InsufficientFundsException e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

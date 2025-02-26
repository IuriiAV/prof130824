package com.telran.homeworks.homework14.task2;

public class BankAccountApp {

    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount(100.0);
            account.deposit(50.0);
            account.withdraw(30.0);
            System.out.println("Current balance: " + account.getBalance());
        } catch (NegativeDepositException | InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            BankAccount account2 = new BankAccount(100.0);
            account2.withdraw(150.0);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            BankAccount account3 = new BankAccount(100.0);
            account3.deposit(-50.0);
        } catch (NegativeDepositException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

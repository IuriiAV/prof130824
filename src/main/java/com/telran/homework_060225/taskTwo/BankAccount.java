package com.telran.homework_060225.taskTwo;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount)throws NegativeDepositException {
        if (amount < 0) {
            throw new NegativeDepositException("Deposit amount cannot be negative");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > this.balance) {
            throw new InsufficientFundsException("Insufficient funds");
        }
        this.balance -= amount;
    }
    public double getBalance() {
        return this.balance;
    }
}

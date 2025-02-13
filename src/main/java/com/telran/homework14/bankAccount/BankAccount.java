package com.telran.homework14.bankAccount;

public class BankAccount {

    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public void deposit(double amount) throws NegativeDepositException {
        if (amount <= 0) {
            throw new NegativeDepositException("Amount less than zero cannot be added");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("The amount cannot be withdrawn, cause it's greater than your balance :(");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

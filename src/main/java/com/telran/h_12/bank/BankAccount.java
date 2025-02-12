package com.telran.h_12.bank;

public class BankAccount {

    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public void deposit(double amount) throws NegativeDepositException {
        if (amount <= 0){
            throw new NegativeDepositException("попытке пополнить счет на отрицательную сумму");
        }
        balance = balance + amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance){
            throw new InsufficientFundsException("попытке пополнить счет на отрицательную сумму");
        }
        balance-=amount;
    }

    public double getBalance() {
        return balance;
    }
}

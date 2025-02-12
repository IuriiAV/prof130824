package com.telran.homework.homework14.task2;

import lombok.Getter;

@Getter
public class BankAccount {

    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public void deposit(double amount) throws NegativeDepositException {
        if (amount <= 0) {
            throw new NegativeDepositException("Amount less than zero cannot be added");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Amount cannot be withdrawn, cause it's greater than your balance");
        }
        this.balance -= amount;
    }

    public void resetBalance() {
        balance = 0;
    }
}

//Описание:
//Создайте класс BankAccount, который хранит баланс пользователя. Реализуйте два собственных исключения:
//
//
//InsufficientFundsException – выбрасывается при попытке снять больше денег, чем есть на счете.
//NegativeDepositException – выбрасывается при попытке пополнить счет на отрицательную сумму.
//
//Требования:
//
//
//Класс BankAccount с полем balance (double).
//Метод deposit(double amount), который увеличивает баланс (но выбрасывает NegativeDepositException, если amount < 0).
//Метод withdraw(double amount), который уменьшает баланс (но выбрасывает InsufficientFundsException, если amount > balance).
//Метод getBalance().

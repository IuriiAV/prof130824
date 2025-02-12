package com.telran.h_12.bank;

public class BankApp {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.getBalance());


        try {
            bankAccount.deposit(150);
        } catch (NegativeDepositException e) {
            throw new RuntimeException(e);
        }
        System.out.println(bankAccount.getBalance());


    }
}

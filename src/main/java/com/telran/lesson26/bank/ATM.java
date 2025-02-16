package com.telran.lesson26.bank;

public class ATM {

    private final String iban = "TR 3434 343434 23433";

    public void depositMoney(int amount) {
        transferMoney(amount);
    }

    private void transferMoney(int amount) {
        System.out.println("Use " + iban);
        System.out.println("Money transferred to " + iban);
    }
}

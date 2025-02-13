package com.telran.mylesson26ReflectionAPI.bank;

public class ATM {

    private String iban = "TR 3452 3421 2345 6644";

    public void depositMoney(int amount) {
        transferMoney(amount);
    }

    private void transferMoney(int amount) {
        System.out.println("Use " + iban);
        System.out.println("Money transferred to " + iban);
    }
}

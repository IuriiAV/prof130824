package com.telran.lesson26;

public class ATM {

    private String iban = "TR 357 88799 98984 545";

    public void depositMoney(int amount){
        transferMoney(amount);
    }
    private void transferMoney(int amount){
        System.out.println("Use " + iban );
        System.out.println("Money transferred to " + iban);
    }
}

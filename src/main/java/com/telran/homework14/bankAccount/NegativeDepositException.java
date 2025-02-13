package com.telran.homework14.bankAccount;

public class NegativeDepositException extends Exception {

    public NegativeDepositException(String message) {
        super(message);
    }
}

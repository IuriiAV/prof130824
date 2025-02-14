package com.telran.homework14.bankAccount;

public class InsufficientFundsException extends Exception{

    public InsufficientFundsException(String message) {
        super(message);
    }
}

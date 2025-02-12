package com.telran.h_12.bank;

public class NegativeDepositException extends Exception{
    public NegativeDepositException(String message) {
        super(message);
    }
}

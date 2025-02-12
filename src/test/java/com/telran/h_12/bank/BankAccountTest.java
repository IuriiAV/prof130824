package com.telran.h_12.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount bankAccount = new BankAccount();

    @Test
    public void testDepositNegative() {
        assertThrows(NegativeDepositException.class, () -> bankAccount.deposit(0));
    }

    @Test
    public void testDepositPositive(){
        assertDoesNotThrow(() -> bankAccount.deposit(10.0));
        assertEquals(10.0, bankAccount.getBalance());
    }

}
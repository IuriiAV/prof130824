package com.telran.homework14.bankAccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount bankAccount = new BankAccount();

    @Test
    public void testDepositNegative() {
        assertThrows(NegativeDepositException.class, () -> bankAccount.deposit(0));
    }

    @Test
    public void testDepositPositive() {
        assertDoesNotThrow(() -> bankAccount.deposit(10.0));
        assertEquals(10.0, bankAccount.getBalance());
    }

    @Test
    void testWithdrawNegative() {
        assertThrows(InsufficientFundsException.class, () -> bankAccount.withdraw(bankAccount.getBalance() + 1));
    }

    @Test
    public void testWithdrawPositive() {
        assertDoesNotThrow(() -> bankAccount.withdraw(bankAccount.getBalance() - 1));
    }
}
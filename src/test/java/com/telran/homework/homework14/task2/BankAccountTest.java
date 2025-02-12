package com.telran.homework.homework14.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    static BankAccount bankAccount = new BankAccount();

    @BeforeEach
    public void resetAccount() {
        bankAccount.resetBalance();
    }

    @Test
    public void testDepositNegative() {
        assertThrows(NegativeDepositException.class, () -> bankAccount.deposit(0));
        assertEquals(bankAccount.getBalance(), 0);
    }

    @Test
    public void testDepositPositive(){
        assertDoesNotThrow(() -> bankAccount.deposit(10.0));
        assertEquals(10.0, bankAccount.getBalance());
    }

    @Test
    public void testWithdrawCorrect() throws NegativeDepositException {
        bankAccount.deposit(5);
        assertDoesNotThrow(() -> bankAccount.withdraw(1));
        assertEquals(4, bankAccount.getBalance());
    }

    @Test
    public void testWithdrawToMuchMoney() {
        assertThrows(InsufficientFundsException.class, () -> bankAccount.withdraw(100));
        assertEquals(0, bankAccount.getBalance());
    }
}
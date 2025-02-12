package com.telran.h_12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    public void testValidAge() {
        assertDoesNotThrow(() -> new User("Max", 18));
    }

    @Test
    public void testInvalidAge() {
        assertThrows(InvalidAgeException.class, () -> new User("Max", 17));
    }
}
package com.telran.homework14.taskUser;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UserTest {

    @Test
    public void testValidAge() {
        assertDoesNotThrow(() -> new User("Alex", 18));
    }

    @Test
    public void testInvalidAge() {
        assertThrows(InvalidAgeException.class, () -> new User("Alex", 17));
    }
}
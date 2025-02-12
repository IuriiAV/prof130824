package com.telran.homework.homework14;

import com.telran.homework.homework14.task1.InvalidAgeException;
import com.telran.homework.homework14.task1.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
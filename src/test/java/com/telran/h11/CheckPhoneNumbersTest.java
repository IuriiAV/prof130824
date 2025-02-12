package com.telran.h11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CheckPhoneNumbersTest {

    CheckPhoneNumbers check = new CheckPhoneNumbers();


    @ParameterizedTest
    @MethodSource(value = "data")
    public void testCheckAll(String text, boolean res) {
        assertEquals(res, check.checkPhoneNumbersOne(text));
    }

    private static Stream<Arguments> data() {
        Arguments textNumberOne = Arguments.of("1234567", true);
        Arguments textNumberTwo = Arguments.of("123-4567", true);
        Arguments textNumberThree = Arguments.of("123 5678", true);
        return Stream.of(textNumberOne, textNumberTwo, textNumberThree);
    }

    @Test
    public void testPassword() {
        assertTrue(check.checkPassword("Ann@mail"));
    }

}
package com.telran.h11;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CheckPhoneNumbersTest {

    CheckPhoneNumbers check = new CheckPhoneNumbers();

    @BeforeAll
    public static void start() {

    }

    @ParameterizedTest
    @MethodSource(value = "data")
    public void testCheckAll(String text, boolean res) {
        assertEquals(res, check.checkPhoneNumbersOne(text));
    }

    private static Stream<Arguments> data() {
        Arguments textNumberOne = Arguments.of(new String("1234567"), true);

        return Stream.of(textNumberOne);
    }

}
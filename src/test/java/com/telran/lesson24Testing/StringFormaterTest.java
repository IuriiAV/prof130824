package com.telran.lesson24Testing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringFormaterTest {

    StringFormater stringFormater = new StringFormater();

    @ParameterizedTest
    @ValueSource(strings = {"HELLO", "hello"})
    public void testReverseStringPositive(String text){
        assertEquals("olleh", stringFormater.reverseStringInLowerCase(text));
    }

//    @Test
//    public void testReverseStringWhenInUpperCase() {
//        assertEquals("olleh", stringFormater.reverseStringInLowerCase("HELLO"));
//    }
//
//    @Test
//    public void testReverseStringWhenInLowerCase() {
//        assertEquals("olleh", stringFormater.reverseStringInLowerCase("hello"));
//    }

    @ParameterizedTest
    @NullAndEmptySource
    public void testReverseStringWhenIIsEmpty(String text) {
        assertEquals("", stringFormater.reverseStringInLowerCase(text));
    }

}
package com.telran.lesson24;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.ValueSources;

import static org.junit.jupiter.api.Assertions.*;

class StringFormatterTest {

    private StringFormatter stringFormatter = new StringFormatter();

    @ParameterizedTest
    @ValueSource(strings = {"HELLO", "hello"})
    public void testReverseStringWhenStringIsCorrect(String text) {
        assertEquals("olleh",
                stringFormatter.reverseStringInLowerCase(text));
    }

//    @Test
//    public void testReverseStringWhenStringInUpperCase() {
//        assertEquals("olleh",
//                stringFormatter.reverseStringInLowerCase("HELLO"));
//    }

//    @Test
//    public void testReverseStringWhenStringInLowerCase() {
//        assertEquals("olleh",
//                stringFormatter.reverseStringInLowerCase("hello"));
//    }

    @ParameterizedTest
    @NullAndEmptySource
    public void testReverseStringWhenStringIsEmptyOrNull(String text) {
        assertEquals("",
                stringFormatter.reverseStringInLowerCase(text));
    }
}
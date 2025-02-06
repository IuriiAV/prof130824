package com.telran.lesson24;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.ValueSources;

import static org.junit.jupiter.api.Assertions.*;

class StringFormatterTest {

    private StringFormatter stringFormatter = new StringFormatter();


    @ParameterizedTest
    @ValueSource(strings = {"HELLO","hello"})
    public void testReversStringWhenStringIsCorrect(String text){
        assertEquals("olleh", stringFormatter.reversStringLoweCase(text));
    }
//
//    @Test
//    public void testReversStringWhenStringInUpperCase(){
//        assertEquals("olleh", stringFormatter.reversStringLoweCase("HELLO"));
//    }
//
//    @Test
//    public void testReversStringWhenStringInLowerCase(){
//        assertEquals("olleh", stringFormatter.reversStringLoweCase("hello"));
//    }

    @ParameterizedTest
    @NullAndEmptySource
    public void testReversStringWhenStringIsEmpty(String text){
        assertEquals("", stringFormatter.reversStringLoweCase(text));
    }
  
}
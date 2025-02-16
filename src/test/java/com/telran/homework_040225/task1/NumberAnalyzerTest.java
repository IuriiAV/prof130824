package com.telran.homework_040225.task1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberAnalyzerTest {

    @Test
    void getMax() {
        NumberAnalyzer analyzer= new NumberAnalyzer(List.of(1,2,3,4,5));
        assertEquals(5,analyzer.getMax());
    }

    @Test
    void getMin() {
        NumberAnalyzer analyzer= new NumberAnalyzer(List.of(1,2,3,4,5));
        assertEquals(1,analyzer.getMin());
    }

    @Test
    void getAverage() {
        NumberAnalyzer analyzer= new NumberAnalyzer(List.of(1,2,3,4,5));
        assertEquals(3.0,analyzer.getAverage());
    }
    @Test
    void testEmptyListThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new NumberAnalyzer(List.of()));
        assertEquals("List cannot be null or empty", exception.getMessage());
    }
}
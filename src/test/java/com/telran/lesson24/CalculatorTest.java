package com.telran.lesson24;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        int result = calculator.sum(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSub() {
        int result = calculator.sub(3, 1);
        assertEquals(2, result);
    }


    @Test
    public void testFindMax() {
        int[] arr = {1, 3, 4, 7, 2};
        int max = calculator.findMax(arr);
        assertEquals(7, max);
    }

    @Test
    public void testFindMaxWhenArrayIsNegative() {
        int[] arr = {-3, -5, -4, -2};
        int max = calculator.findMax(arr);
        assertEquals(-2, max);
    }

    @ParameterizedTest
    @MethodSource(value = "generateData")
    public void testFindMaxWhenArrayIsCorrect(int[] array, int result) {
        assertEquals(result, calculator.findMax(array));
    }

    private static Stream<Arguments> generateData() {
        Arguments arguments1 = Arguments.of(new int[]{1, 3, 4, 7, 2}, 7);
        Arguments arguments2 = Arguments.of(new int[]{-3, -5, -4, -2}, -2);
        return Stream.of(arguments1,arguments2);
    }


    @ParameterizedTest
    @NullAndEmptySource
    public void testFindMaxWhenArrayIsEmptyOrNull(int[] arr) {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.findMax(arr));
    }

}
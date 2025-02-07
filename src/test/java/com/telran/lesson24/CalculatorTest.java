package com.telran.lesson24;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        int result = calculator.sum(2, 3);
        assertEquals(5, result);
    }

    @ParameterizedTest
    @MethodSource("provideIntsForSub")
    public void testSub(int inputFirst, int inputSecond, int expected){
        assertEquals(expected,calculator.sub(inputFirst,inputSecond));
    }

    private static Stream<Arguments> provideIntsForSub() {
        return Stream.of(
                Arguments.of(5, 3, 2),
                Arguments.of(3, 5, -2),
                Arguments.of(3, 0, 3),
                Arguments.of(0, 3, -3)
        );
    }


    //TODO HW :
    //Write test on sub method
    //Write test on findMin method

    @Test
    public void testFindMaxWhenArrayIsPositive() {
        int[] arr = {1, 3, 4, 7, 2};
        int max = calculator.findMax(arr);
        assertEquals(7, max);
    }

    @Test
    public void testFindMaxWhenArrayIsNegative() {
        int[] arr = {-3, -5, -4, -2};
        assertEquals(-2, calculator.findMax(arr));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void testFindMaxWhenArrayIsEmptyOrNull(int[] arr) {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.findMax(arr));
    }

//    @Test
//    public void testFindMaxWhenArrayIsEmpty() {
//        int[] arr = {};
//        assertThrows(IllegalArgumentException.class,
//                () -> calculator.findMax(arr));
//    }

//    @Test
//    public void testFindMaxWhenArrayIsNull() {
//        assertThrows(IllegalArgumentException.class,
//                () -> calculator.findMax(null));
//    }
}
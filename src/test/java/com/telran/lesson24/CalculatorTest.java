package com.telran.lesson24;

import com.telran.summary070225.CustomAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        int result = calculator.sum(2, 3);
        assertEquals(5, result);
    }

    //TODO HW :
    //Write test on sub method
    //Write test on findMin method

    @ParameterizedTest
    @MethodSource("generateDataForSub")
    public void testSub(int inputFirst, int inputSecond, int expected) {
        assertEquals(expected, calculator.sub(inputFirst, inputSecond));
    }

    private static Stream<Arguments> generateDataForSub() {
        return Stream.of(
                Arguments.of(8, 7, 1),
                        Arguments.of(1, 5, -4));
    }
//    @Test
//    public void testFindMaxWhenArrayIsPositive() {
//        int[] arr = {1, 3, 4, 7, 2};
//        int max = calculator.findMax(arr);
//        assertEquals(7, max);
//    }
//
//    @Test
//    public void testFindMaxWhenArrayIsNegative() {
//        int[] arr = {-3, -5, -4, -2};
//        assertEquals(-2, calculator.findMax(arr));
//    }

    @ParameterizedTest
    @MethodSource(value = "generateData")
    @CustomAnnotation("Hello")
    public void testFindMaxWhenArrayIsCorrect (int[] arr, int result) {
        assertEquals(result, calculator.findMax(arr));
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 4, 7, 2},7),
                Arguments.of(new int[]{-3, -5, -4, -2},-2));
    }

  @ParameterizedTest
  @NullAndEmptySource
    public void testFindMaxWhenArrayIsEmptyOrNull(int[] arr) {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.findMax(arr));
    }

    @ParameterizedTest
    @MethodSource("testFindMinWhenArrayIsCorrect")
    public void testFindMinPositive(int[] arr, int expected) {
        assertEquals(expected, calculator.findMin(arr));
    }
    private static Stream<Arguments> testFindMinWhenArrayIsCorrect() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 5, 5, 3, 2}, 1),
                Arguments.of(new int[]{100, 90, 80}, 80),
                Arguments.of(new int[]{0, -5, -10, 6, 1}, -10),
                Arguments.of(new int[]{56}, 56)
        );
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


    @ParameterizedTest
    @NullAndEmptySource
    public void testFindMinWhenArrayIsEmptyOrNull(int[] arr) {
        assertThrows(IllegalArgumentException.class, () -> calculator.findMin(arr));
    }
}
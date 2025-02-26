package com.telran.homeworks.homework13;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NumberAnalyzerTest {

    @ParameterizedTest
    @MethodSource("provideNumbersForMax")
    void testGetMax(List<Integer> numbers, int expectedMax) {
        NumberAnalyzer analyzer = new NumberAnalyzer(numbers);
        assertEquals(expectedMax, analyzer.getMax());
    }

    private static Stream<Arguments> provideNumbersForMax() {
        return Stream.of(
                Arguments.of(Arrays.asList(100, 2252, 385, 40, 105), 2252),
                Arguments.of(Arrays.asList(-105, -12, -453, -14, -5), -5),
                Arguments.of(Arrays.asList(10, -20, 0), 30)
        );
    }

    @ParameterizedTest
    @MethodSource("provideNumbersForMin")
    void testGetMin(List<Integer> numbers, int expectedMin) {
        NumberAnalyzer analyzer = new NumberAnalyzer(numbers);
        assertEquals(expectedMin, analyzer.getMin());
    }

    private static Stream<Arguments> provideNumbersForMin() {
        return Stream.of(
                Arguments.of(Arrays.asList(1, 2, 3, 4, 5), 1),
                Arguments.of(Arrays.asList(-13, -21, -33, -54, -59), -59),
                Arguments.of(Arrays.asList(10, 20, 30), 10)
        );
    }

    @ParameterizedTest
    @MethodSource("provideNumbersForAverage")
    void testGetAverage(List<Integer> numbers, double expectedAverage) {
        NumberAnalyzer analyzer = new NumberAnalyzer(numbers);
        assertEquals(expectedAverage, analyzer.getAverage(), 0.001);
    }

    private static Stream<Arguments> provideNumbersForAverage() {
        return Stream.of(
                Arguments.of(Arrays.asList(1, 2, 3, 4, 5), 3.0),
                Arguments.of(Arrays.asList(-1, -2, -3, -4, -5), -3.0),
                Arguments.of(Arrays.asList(10, 20, 30), 20.0)
        );
    }

    @Test
    void testEmptyListThrowsException() {
        List<Integer> emptyList = Collections.emptyList();
        assertThrows(IllegalArgumentException.class, () -> new NumberAnalyzer(emptyList));
    }

}
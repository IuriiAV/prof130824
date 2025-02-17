package com.telran.homework.homework15.task1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NumberAnalyzerTest {

    @ParameterizedTest
    @NullAndEmptySource
    public void testConstructorWhenListIsNullOrEmpty(List<Integer> integers) {
        Exception exception = assertThrows(Exception.class, () -> new NumberAnalyzer(integers));
        assertTrue(exception instanceof NullPointerException || exception instanceof IllegalArgumentException);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 5, 10})
    void testGetMaxForSingleElement(int maxValue) throws IllegalArgumentException {
        List<Integer> integers = List.of(maxValue);
        NumberAnalyzer analyzer = new NumberAnalyzer(integers);
        assertEquals(maxValue, analyzer.getMax());
    }

    @ParameterizedTest
    @MethodSource(value = "provideIntegerListsForMax")
    void testGetMax(List<Integer> integers, int expectedMax) throws IllegalArgumentException {
        NumberAnalyzer analyzer = new NumberAnalyzer(integers);
        assertEquals(expectedMax, analyzer.getMax());
    }

    static Stream<Arguments> provideIntegerListsForMax() {
        return Stream.of(
                Arguments.of(Arrays.asList(1, 2, 3), 3),
                Arguments.of(Arrays.asList(10, 20, 30), 30),
                Arguments.of(List.of(5), 5),
                Arguments.of(Arrays.asList(7, 7, 7), 7)
        );
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 7, 1})
    public void testGetMinForSingleElement(int minValue) throws IllegalArgumentException {
        NumberAnalyzer analyzer = new NumberAnalyzer(List.of(minValue));
        assertEquals(minValue, analyzer.getMin());
    }

    @ParameterizedTest
    @MethodSource("provideIntegerListForMin")
    public void testGetMin(List<Integer> integers, int minValue) throws IllegalArgumentException {
        NumberAnalyzer analyzer = new NumberAnalyzer(integers);
        assertEquals(minValue, analyzer.getMin());
    }

    static Stream<Arguments> provideIntegerListForMin() {
        return Stream.of(
                Arguments.of(Arrays.asList(2,8,45,1), 1),
                Arguments.of(Arrays.asList(-1, -5, -7, -52, -2), -52),
                Arguments.of(Arrays.asList(0, 0, 0), 0),
                Arguments.of(Arrays.asList(-400, 500, 0), -400)
        );
    }

    @ParameterizedTest
    @ValueSource(ints = {-2, 0, 3})
    public void testGetAverageForSingleElement(int avgValue) throws IllegalArgumentException {
        NumberAnalyzer analyzer = new NumberAnalyzer(List.of(avgValue));
        assertEquals(avgValue, analyzer.getAverage());
    }

    @ParameterizedTest
    @MethodSource(value = "provideIntegerListForAverage")
    public void testGetAverage(List<Integer> integers, int avgValue) throws IllegalArgumentException {
        NumberAnalyzer analyzer = new NumberAnalyzer(integers);

        assertEquals(avgValue, analyzer.getAverage());
    }

    static Stream<Arguments> provideIntegerListForAverage() {
        return Stream.of(
                Arguments.of(Arrays.asList(1,2,3,4,5,6), 3),
                Arguments.of(Arrays.asList(-2, -4, -6, -8), -5),
                Arguments.of(Arrays.asList(-10, 5, -4, 2, -8, 7), -1)
        );
    }
}
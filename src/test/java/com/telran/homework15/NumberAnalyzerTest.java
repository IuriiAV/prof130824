package com.telran.homework15;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NumberAnalyzerTest {

    NumberAnalyzer analyzer = new NumberAnalyzer();

    @ParameterizedTest
    @MethodSource("provideMaxData")
    void testFindMaxPositive(List<Integer> numbers, int expected) {
        assertEquals(expected, analyzer.findMax(numbers));
    }

    public static Stream<Arguments> provideMaxData() {
        return Stream.of(
                Arguments.of(List.of(new Integer[]{4, 7, 1, 8, 7}), 8),
                Arguments.of(List.of(new Integer[]{4, 4, 4, 4, 4}), 4),
                Arguments.of(List.of(new Integer[]{999}), 999),
                Arguments.of(List.of(new Integer[]{-4, -99, -2, 0, -11}), 0)
        );
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void testFindMaxThrowsException(List<Integer> numbers) {
        assertThrows(IllegalArgumentException.class, () -> analyzer.findMax(numbers));
    }

    @ParameterizedTest
    @MethodSource("provideMinData")
    void testFindMinPositive(List<Integer> numbers, int expected) {
        assertEquals(expected, analyzer.findMin(numbers));
    }

    public static Stream<Arguments> provideMinData() {
        return Stream.of(
                Arguments.of(List.of(new Integer[]{4, 7, 1, 8, 7}), 1),
                Arguments.of(List.of(new Integer[]{4, 4, 4, 4, 4}), 4),
                Arguments.of(List.of(new Integer[]{999}), 999),
                Arguments.of(List.of(new Integer[]{-4, -99, -2, 0, -11}), -99),
                Arguments.of(List.of(new Integer[]{4, 99, 2, 0, 11}), 0)
        );
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void testFindMinThrowsException(List<Integer> numbers) {
        assertThrows(IllegalArgumentException.class, () -> analyzer.findMin(numbers));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void testFindAvgThrowsException(List<Integer> numbers) {
        assertThrows(IllegalArgumentException.class, () -> analyzer.findAvg(numbers));
    }

    @ParameterizedTest
    @MethodSource("provideAvgData")
    void testFindAvgPositive(List<Integer> numbers, double expected) {
        assertEquals(expected, analyzer.findAvg(numbers));
    }

    public static Stream<Arguments> provideAvgData() {
        return Stream.of(
                Arguments.of(List.of(new Integer[]{4, 7, 1, 8, 7}), 5.4),
                Arguments.of(List.of(new Integer[]{4, 4, 4, 4, 4}), 4),
                Arguments.of(List.of(new Integer[]{999}), 999),
                Arguments.of(List.of(new Integer[]{-4, -99, -2, 0, -11}), -23.2),
                Arguments.of(List.of(new Integer[]{-1, 1}), 0)
        );
    }
}
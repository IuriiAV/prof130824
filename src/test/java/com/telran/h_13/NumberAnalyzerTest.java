package com.telran.h_13;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NumberAnalyzerTest {
    NumberAnalyzer numberAnalyzer = new NumberAnalyzer();

    @ParameterizedTest
    @MethodSource(value = "generateDataMax")
    public void testMax(List<Integer> list, int res) {
        assertEquals(res,numberAnalyzer.getMax(list));
    }
    public static Stream<Arguments> generateDataMax(){
        Arguments argMaxPositive = Arguments.of(List.of(1, 2, 3), 3);
        Arguments argMaxNegative = Arguments.of(List.of(-1, -2, -3), -1);
        return Stream.of(argMaxNegative,argMaxPositive);
    }

    @ParameterizedTest
    @MethodSource(value = "generateDataMin")
    public void testMin(List<Integer> list, int res) {
        assertEquals(res,numberAnalyzer.getMin(list));
    }
    public static Stream<Arguments> generateDataMin(){
        Arguments argMinPositive = Arguments.of(List.of(1, 2, 3), 1);
        Arguments argMinNegative = Arguments.of(List.of(-1, -2, -3), -3);
        return Stream.of(argMinPositive,argMinNegative);
    }

    @ParameterizedTest
    @MethodSource(value = "generateDataAVG")
    public void testAVG(List<Integer> list, int res) {
        assertEquals(res,numberAnalyzer.getAverage(list));
    }
    public static Stream<Arguments> generateDataAVG(){
        Arguments argAVGPositive = Arguments.of(List.of(1, 2, 3), 2);
        Arguments argAVGNegative = Arguments.of(List.of(-1, -2, -3), -2);
        return Stream.of(argAVGPositive,argAVGNegative);
    }

    @Test
    public void testAllMethodException(){
        assertThrows(IllegalArgumentException.class, () -> numberAnalyzer.getMax(List.of()));
        assertThrows(IllegalArgumentException.class, () -> numberAnalyzer.getMin(List.of()));
        assertThrows(IllegalArgumentException.class, () -> numberAnalyzer.getAverage(List.of()));
    }
  
}
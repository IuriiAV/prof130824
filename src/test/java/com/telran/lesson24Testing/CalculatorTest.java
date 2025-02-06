package com.telran.lesson24Testing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @ParameterizedTest
    @NullAndEmptySource
    public void test(int[] arr) {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.findMax(arr));
    }
}
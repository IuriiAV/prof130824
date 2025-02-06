package com.telran.lesson24;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

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
    public void testFindMax(){
        int[] arr = {1,3,4,7,2};
        int max = calculator.findMax(arr);
        assertEquals(7,max);
    }

    @Test
    public void testFindMaxWhenArrayIsNegative(){
        int[] arr = {-3,-5,-4,-2};
        int max = calculator.findMax(arr);
        assertEquals(-2,max);
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void testFindMaxWhenArrayIsEmptyOrNull(int[] arr){
        assertThrows(IllegalArgumentException.class,
                () -> calculator.findMax(arr));
    }

}
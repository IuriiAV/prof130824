package com.telran.lesson24;

import com.telran.summary0702.CustomAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

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

//    @Test
//    public void testFindMaxWhenArrayIsPositive() {
//        int[] arr = {1, 3, 4, 7, 2};
//        int max = calculator.findMax(arr);
//        assertEquals(7, max);
//        // assertEquals(3, calculator.findMax(new int[]{2, 3, 4, 2}));
//    }

//    @Test
//    public void testFindMaxWhenArrayIsNegative() {
//        int[] arr = {-3, -5, -4, -2};
//        assertEquals(-2, calculator.findMax(arr));
//    }



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
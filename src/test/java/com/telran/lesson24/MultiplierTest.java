package com.telran.lesson24;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplierTest {

    @Test
    public void testProduct() {
        Multiplier multiplier = new Multiplier();
        int result = multiplier.product(5, 3);
        assertEquals(15, result);
    }
}

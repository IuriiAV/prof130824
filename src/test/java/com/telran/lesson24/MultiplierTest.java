package com.telran.lesson24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplierTest {

    @Test
    public void multiplierTest() {

        Multiplier multiplier = new Multiplier();
        int res = multiplier.product(5, 3);
        Assertions.assertEquals(15, res);
    }
}

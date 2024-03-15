package com.learning.core.day10;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class D10P07 {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(3, 5);
        assertEquals(8, result); // Expected result is 8 (3 + 5)
    }

    @Test
    public void testSub() {
        Calculator calc = new Calculator();
        int result = calc.sub(10, 4);
        assertEquals(6, result); // Expected result is 6 (10 - 4)
    }
}

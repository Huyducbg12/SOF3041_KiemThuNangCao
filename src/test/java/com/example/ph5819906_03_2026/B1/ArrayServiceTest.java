package com.example.ph5819906_03_2026.B1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayServiceTest {
    ArrayService service = new ArrayService();

    @Test
    void testSumNormal() {
        assertEquals(15, service.calculateSum(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void testSumEmpty() {
        assertEquals(0, service.calculateSum(new int[]{}));
    }

    @Test
    void testSumWithNegative() {
        assertEquals(0, service.calculateSum(new int[]{-1, 1, -2, 2}));
    }

    @Test
    void testSumNull() {
        assertEquals(0, service.calculateSum(null));
    }

    @Test
    void testSumLargeNumbers() {
        assertEquals(1000, service.calculateSum(new int[]{500, 500}));
    }
}
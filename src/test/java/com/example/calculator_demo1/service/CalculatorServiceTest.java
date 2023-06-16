package com.example.calculator_demo1.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    CalculatorService service = new CalculatorService();

    @Test
    void testPlus() {
        assertEquals(3, service.plus(1,2));
        assertEquals(-3, service.plus(-1,-2));
        assertEquals(1, service.plus(-1,2));
        assertEquals(-1, service.plus(1,-2));
        assertEquals(1, service.plus(1,0));
        assertEquals(-2, service.plus(0,-2));
        assertEquals(3, service.plus(3,0));
    }
    @Test
    void testMinus() {
        assertEquals(-1, service.minus(1, 2));
        assertEquals(1, service.minus(-5, -6));
        assertEquals(-11, service.minus(-5, 6));
        assertEquals(11, service.minus(5, -6));
        assertEquals(0, service.minus(0, 0));
    }

    @Test
    void testMultiply() {
        assertEquals(2, service.multiply(1, 2));
        assertEquals(30, service.multiply(-5, -6));
        assertEquals(-30, service.multiply(-5, 6));
        assertEquals(-30, service.multiply(5, -6));
        assertEquals(0, service.multiply(0, 0));
    }

    @Test
    void testDivide() {
        assertEquals(0, service.divide(1, 2));
        assertEquals(1, service.divide(-6, -6));
        assertEquals(-2, service.divide(-12, 6));
        assertEquals(-2, service.divide(12, -6));
        assertEquals(0, service.divide(0, 0));
    }
}
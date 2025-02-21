package com.example.calculator.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAddNumbers() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    public void testSubNumbers() {
        assertEquals(1, Calculator.subtract(3, 2));
    }

    @Test
    public void testDivideNumbers() {
        assertEquals(2.0, Calculator.divide(6, 3));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, Calculator.factorial(5));
    }

    @Test
    public void testCalculeDayBetweenDate() {
        assertEquals(5, Calculator.calculeDayBetweenDate("2024-02-01", "2024-02-06"));
    }

    @Test
    public void testIntegerToBinary() {
        assertEquals("1010", Calculator.integerToBinary(10));
    }

    @Test
    public void testIntegerToHexadecimal() {
        assertEquals("a", Calculator.integerToHexadecimal(10));
    }
}

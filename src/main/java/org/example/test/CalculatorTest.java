package org.example.test;

import org.example.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(5, 3);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(4, 3);
        Assertions.assertEquals(12, result);
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(10, 2);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testDivisionByZero() {
        Calculator calculator = new Calculator();
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}
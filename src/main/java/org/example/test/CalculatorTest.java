package org.example.test;

import org.example.calculator.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    /**
     * Testowa klasa dla klasy kalkulator.
     */
    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        if (result != 5) {
            throw new AssertionError("Addition test failed. Expected: 5, but got: " + result);
        }
    }
    /**
     * Test dla dodawania.
     */
    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(5, 3);
        if (result != 2) {
            throw new AssertionError("Subtraction test failed. Expected: 2, but got: " + result);
        }
    }
    /**
     * Test dla mnożenia.
     */
    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(4, 3);
        if (result != 12) {
            throw new AssertionError("Multiplication test failed. Expected: 12, but got: " + result);
        }
    }
    /**
     * Test dla dzielenia.
     */
    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(10, 2);
        if (result != 5) {
            throw new AssertionError("Division test failed. Expected: 5, but got: " + result);
        }
    }
    /**
     * Test dla dzielenia przez 0.
     */
    @Test
    public void testDivisionByZero() {
        Calculator calculator = new Calculator();
        try {
            calculator.divide(10, 0);
            throw new AssertionError("Division by zero test failed. Expected ArithmeticException, but no exception was thrown.");
        } catch (ArithmeticException e) {
            // Test passed
        }
    }
}
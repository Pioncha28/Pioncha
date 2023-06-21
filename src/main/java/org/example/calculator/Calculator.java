package org.example.calculator;
/**
 * Klasa reprezentująca prosty kalkulator.
 */

public class Calculator {
/**
 * Dodaje dwie liczby.
 */
 public int add(int a, int b) {
        return a + b;
    }
/**
 * Odejmuje jedną liczbę od drugiej.
 */
    public int subtract(int a, int b) {
        return a - b;
    }
/**
 * Mnoży dwie liczby.
 */

 public int multiply(int a, int b) {
        return a * b;
    }
/**
 * Dzieli jedną liczbę przez drugą.
 */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}

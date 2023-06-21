package org.example.app;

import org.example.calculator.Calculator;

/**
 * Klasa `CalculatorApp` jest aplikacją konsolową, która demonstruje funkcje klasy `Calculator`.
 */
public class CalculatorApp {
/**
 * Metoda główna aplikacji.
 */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int a = 10;
        int b = 5;

        int sum = calculator.add(a, b);
        System.out.println("Sum: " + sum);

        int difference = calculator.subtract(a, b);
        System.out.println("Difference: " + difference);

        int product = calculator.multiply(a, b);
        System.out.println("Product: " + product);

        int quotient = calculator.divide(a, b);
        System.out.println("Quotient: " + quotient);
    }
}
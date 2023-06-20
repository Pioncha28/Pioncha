package org.example.app;

import org.example.calculator.Calculator;

public class CalculatorApp {
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
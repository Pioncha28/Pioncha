package org.example;

public class Main {
    public static void main(String[] args) {
        LoggerUtil.log("Hello, world!");

        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        LoggerUtil.log("Result: " + result);
    }
}
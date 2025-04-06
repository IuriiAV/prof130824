package com.telran.homework16.calculator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CalculatorApp {
    public static void main(String[] args) {
        String input = "src/main/java/com/telran/homework16/calculator/input.txt";
        String output = "src/main/java/com/telran/homework16/calculator/output.txt";
        writeResult(input, output);
    }

    public static void writeResult(String input, String output) {
        String expressionRead = null;
        try {
            expressionRead = Files.readString(Path.of(input));
        } catch (IOException e) {
            System.err.println("error during file reading: " + e.getMessage());
        }

        try {
            Double result = calculateExpression(expressionRead);
            Files.write(Path.of(output), result.toString().getBytes());
        } catch (IOException e) {
            System.err.println("error in calculation " + e.getMessage());
        }
    }

    public static Double calculateExpression(String expression) {
        if (expression == null || expression.isEmpty()) {
            throw new IllegalArgumentException("Expression is empty");
        }

        String[] expr = expression.split(" ");

        if (expr.length != 3) {
            throw new IllegalArgumentException("Incorrect format of expression");
        }

        double a, b;
        try {
            a = Double.parseDouble(expr[0]);
            b = Double.parseDouble(expr[2]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Impossible to parse into number: " + e.getMessage());
        }

        return switch (expr[1]) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> {
                if (b == 0) {
                    throw new ArithmeticException("we don't divide by 0");
                }
                yield a / b;
            }
            default -> throw new UnsupportedOperationException("Incorrect operator");
        };
    }
}

package com.telran.lesson19.homework.calculator;

import java.io.*;
import java.util.Stack;

public class Calculator {

    public void writeSolve(String exercisePath, String solutionPath) {
        try (
                BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(exercisePath)));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(solutionPath)))
        ) {
            while (bf.ready()) {
                String currentExercise = bf.readLine();
                String result = solveExercise(currentExercise);
                bw.write(currentExercise + " = " + result + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String solveExercise(String exercise) {
        StringBuilder strNumber = new StringBuilder();
        Stack<Integer> result = new Stack<>();
        char sign = ' ';
        for (char c : exercise.toCharArray()) {
            if (!String.valueOf(c).matches("[0-9+\\-*/]")) {
                return "Symbol [" + c + "] not allowed!";
            }
            if (Character.isDigit(c)) {
                strNumber.append(Character.getNumericValue(c));
            } else {
                if (!strNumber.isEmpty()) {
                    result.push(Integer.parseInt(strNumber.toString()));
                    strNumber.setLength(0);
                }
                if (result.size() == 2) {
                    try {
                        int num2 = result.pop();
                        int num1 = result.pop();
                        result.push(doMath(num1, num2, sign));
                    } catch (ArithmeticException e) {
                        return e.getMessage();
                    }
                }
                sign = c;
            }
        }
        if (!strNumber.isEmpty()) {
            result.push(Integer.parseInt(strNumber.toString()));
        }
        if (result.size() == 2) {
            try {
                int num2 = result.pop();
                int num1 = result.pop();
                result.push(doMath(num1, num2, sign));
            } catch (ArithmeticException e) {
                return e.getMessage();
            }
        }

        return String.valueOf(result.pop());
    }

    public int doMath(int num1, int num2, char sign) {
        return switch (sign) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero!!!");
                }
                yield num1 / num2;
            }
            default -> throw new ArithmeticException("Something is wrong with the math sign...");
        };
    }
}

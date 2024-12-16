package com.telran.homework.homework8;

import java.util.Scanner;
import java.util.Stack;

public class Calculator {

    public static void main(String[] args) {
        // 32+5 * 22 + 87 /4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your expression:");
        String[] symbols = scanner.nextLine().replaceAll(" ", "").split("");
        Stack<Double> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < symbols.length; i++) {
            if (stack.isEmpty() && isNum(symbols[i])) {
                sb.append(symbols[i]);
                if (i == symbols.length - 1 || !isNum(symbols[i + 1])) {
                    stack.push(Double.parseDouble(sb.toString()));
                    sb.setLength(0);
                }
            } else {
                String sign = symbols[i];
                while (isNum(symbols[i + 1])) {
                    sb.append(symbols[++i]);
                    if (i == symbols.length - 1) break;
                }
                Double num1 = stack.pop();
                Double num2 = Double.parseDouble(sb.toString());
                sb.setLength(0);

                switch (sign) {
                    case "+" -> stack.push(num1 + num2);
                    case "-" -> stack.push(num1 - num2);
                    case "/" -> stack.push(num1 / num2);
                    case "*" -> stack.push(num1 * num2);
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("Something went wrong.");
        } else {
            System.out.println("Result of this expression is " + stack.peek());
        }
    }

    private static boolean isNum(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

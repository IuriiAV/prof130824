package com.telran.homework8.Calc;

import java.util.Scanner;
import java.util.Stack;

public class CalcApp {

    public static void main(String[] args) {
        System.out.println("Please, enter an expression: ");
        Scanner sc = new Scanner(System.in);
        String expr = sc.next();

        Stack<Double> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        int i = 0;
        while (i < expr.length()) {
            if (Character.isDigit(expr.charAt(i))) {
                StringBuilder sb = new StringBuilder();
                while (i < expr.length() && (Character.isDigit(expr.charAt(i)) || expr.charAt(i) == '.')) {
                    sb.append(expr.charAt(i));
                    i++;
                }
                numbers.push(Double.parseDouble(sb.toString()));
            } else if (!numbers.isEmpty() && (expr.charAt(i) == '*' || expr.charAt(i) == '/')) {
                Character operator = expr.charAt(i);
                StringBuilder sb = new StringBuilder();
                i++;
                while (i < expr.length() && (Character.isDigit(expr.charAt(i)) || expr.charAt(i) == '.')) {
                    sb.append(expr.charAt(i));
                    i++;
                }
                calcSimpleExpression(operator, numbers, numbers.pop(), Double.parseDouble(sb.toString()));
            } else {
                operators.push(expr.charAt(i));
                i++;
            }
        }
        while (numbers.size() != 1) {
            calcSimpleExpression(operators.pop(), numbers, numbers.pop(), numbers.pop());
        }

        sc.close();
        System.out.println("The answer is : " + numbers);
    }

    private static void calcSimpleExpression(Character operator, Stack<Double> stack, double first, double second) {
        switch (operator) {
            case '+':
                stack.push(first + second);
                break;
            case '-':
                stack.push(second - first);
                break;
            case '*':
                stack.push(first * second);
                break;
            case '/':
                stack.push(first / second);
                break;
        }
    }
}

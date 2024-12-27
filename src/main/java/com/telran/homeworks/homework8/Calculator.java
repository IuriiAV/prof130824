package com.telran.homeworks.homework8;

import java.util.Stack;

public class Calculator {

        public static void main(String[] args) {
            String expression = "100 + 5 * 2";
            System.out.println("Result: " + evaluate(expression));
        }

        public static int evaluate(String expression) {

            expression = expression.replaceAll("\s+", "");


            Stack<Integer> numbers = new Stack<>();

            Stack<Character> operators = new Stack<>();

            for (int i = 0; i < expression.length(); i++) {
                char c = expression.charAt(i);

                if (Character.isDigit(c)) {

                    int num = 0;
                    while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                        num = num * 10 + (expression.charAt(i) - '0');
                        i++;
                    }
                    i--;
                    numbers.push(num);
                } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                    // Обрабатываем операторы
                    while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(c)) {
                        int b = numbers.pop();
                        int a = numbers.pop();
                        char op = operators.pop();
                        numbers.push(applyOperator(a, b, op));
                    }
                    operators.push(c);
                }
            }


            while (!operators.isEmpty()) {
                int b = numbers.pop();
                int a = numbers.pop();
                char op = operators.pop();
                numbers.push(applyOperator(a, b, op));
            }

            return numbers.pop();
        }


        private static int precedence(char operator) {
            switch (operator) {
                case '+':
                case '-':
                    return 1;
                case '*':
                case '/':
                    return 2;
                default:
                    return -1;
            }
        }


        private static int applyOperator(int a, int b, char operator) {
            switch (operator) {
                case '+':
                    return a + b;
                case '-':
                    return a - b;
                case '*':
                    return a * b;
                case '/':
                    if (b == 0) throw new ArithmeticException("Division by zero");
                    return a / b;
                default:
                    throw new IllegalArgumentException("Invalid operator: " + operator);
            }
        }
    }



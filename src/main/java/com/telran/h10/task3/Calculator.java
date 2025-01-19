package com.telran.h10.task3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.Stack;

public class Calculator {

    public static void main(String[] args) {
        Path pathExpression = Paths.get("C:\\IT\\JAVA PRO\\Lesson\\src\\main\\java\\com\\telran\\h10\\task3\\expression.txt");
        Path pathAnswer = Paths.get("C:\\IT\\JAVA PRO\\Lesson\\src\\main\\java\\com\\telran\\h10\\task3\\answer.txt");

        String exp;
        try {
            exp = Files.readString(pathExpression);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Stack<Integer> queueNum = new Stack<>();
        Stack<Character> queueSimbol = new Stack<>();
        Stack<Integer> stackRes = new Stack<>();

        for (int i = exp.length() - 1; i >= 0; i--) {
            char ch = exp.charAt(i);

            if (ch == ')' || ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                queueSimbol.push(ch);
            }

            if (Character.isDigit(ch)) {
                queueNum.push(ch - '0');
            }
        }

        while (!queueSimbol.isEmpty()) {

            if (queueSimbol.peek() == ')' || queueSimbol.peek() == '(') {
                queueSimbol.pop();
            }
            stackRes.push(queueNum.pop());
            extractedResult(stackRes, queueSimbol);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(exp).append(" = ").append(stackRes);
        try {
            Files.write(pathAnswer, sb.toString().getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Your expression : " + exp + " = " + stackRes + "\n" + "Data has been written to a file " + pathAnswer);



    }

    private static void extractedResult(Stack<Integer> stackRes, Stack<Character> queueSimbol) {
        int result;
        if (stackRes.size() == 2) {
            switch (queueSimbol.pop()) {
                case '+':
                    result = stackRes.pop() + stackRes.pop();
                    stackRes.push(result);
                    break;
                case '-':
                    int num1 = stackRes.pop();
                    int num2 = stackRes.pop();
                    result = num2 - num1;
                    stackRes.push(result);
                    break;
                case '*':
                    result = stackRes.pop() * stackRes.pop();
                    stackRes.push(result);
                    break;
                case '/':
                    int num4 = stackRes.pop();
                    int num3 = stackRes.pop();
                    result = num3 / num4;
                    stackRes.push(result);
            }
        }
    }
}

package com.telran.h6;

import java.util.*;

public class CalculatorStack {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение в формате 1+2*3 :\n");
        String exp = "2*2+5";


        Stack<Integer> queueNum = new Stack<>();

        Stack<Character> queueSimbol = new Stack<>();

        Stack<Integer> stackRes = new Stack<>();

        for (int i = exp.length()-1; i >= 0; i--) {
            char ch = exp.charAt(i);

            if (ch == ')' || ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                queueSimbol.push(ch);
            }

            if (Character.isDigit(ch)) {
                queueNum.push(ch - '0');
            }
        }

        while (!queueSimbol.isEmpty()) {

            if (queueSimbol.peek() == ')' || queueSimbol.peek() == '(' ){
               queueSimbol.pop();
            }
            stackRes.push(queueNum.pop());
            extractedResult(stackRes, queueSimbol);
        }
        System.out.println(queueNum);
        System.out.println(queueSimbol);
        System.out.println("Ваше выражение " + exp + " = " + stackRes);
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


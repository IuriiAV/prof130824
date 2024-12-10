package com.telran.h6;

import lombok.ToString;

import java.util.*;

public class CalculatorStack {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение в формате 1+2*3 :\n");
        String exp = "2+(1*3)";


        Queue<Integer> queueNum = new LinkedList<>();

        Queue<Character> queueSimbol = new LinkedList<>();

        Stack<Integer> stackRes = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == ')' || ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                queueSimbol.add(ch);
            }

            if (Character.isDigit(ch)) {
                queueNum.add(ch - '0');
            }
        }

        while (!queueSimbol.isEmpty()) {
            stackRes.push(queueNum.poll());

            int result = 0;

            if (queueSimbol.poll() == '('){

            }

            if (stackRes.size() == 2) {
                switch (queueSimbol.poll()) {
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
        System.out.println(queueNum);
        System.out.println(queueSimbol);
        System.out.println("Ваше выражение " + exp + " = " + stackRes);
    }
}


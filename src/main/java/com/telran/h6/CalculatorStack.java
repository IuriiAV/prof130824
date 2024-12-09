package com.telran.h6;

import lombok.ToString;

import java.util.*;

public class CalculatorStack {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение в формате 1+2*3= :\n");
        String exp = "3+5-1";
        System.out.println("Ваше выражение : " + exp);


        LinkedList<Integer> stackNum = new LinkedList<>();

        LinkedList<Character> stackSimbol = new LinkedList<>();

        Stack<Integer> stackRes = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == ')' || ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                stackSimbol.addLast(ch);
            }

            if (Character.isDigit(ch)) {
                stackNum.addLast(ch - '0');
            }
        }

        int count = 0;
        int size = stackSimbol.size();

//        while (count != size) {
//
//            stackRes.push(stackNum.pop());
//
//            if (stackRes.size() == 2) {
//                int result = 0;
//                switch (stackSimbol.pop()) {
//                    case '+':
//                        result = stackRes.pop() + stackRes.pop();
//                        stackRes.push(result);
//                        break;
//                    case '-':
//                        result = stackRes.pop() - stackRes.pop();
//                        stackRes.push(result);
//                        break;
//                    case '*':
//                        result = stackRes.pop() * stackRes.pop();
//                        stackRes.push(result);
//                        break;
//                    case '/':
//                        result = stackRes.pop() / stackRes.pop();
//                        stackRes.push(result);
//                }
//                break;
//            }
//            count++;
//
//        char levelOper = '1';
//        while (levelOper != '=') {
//            int input = scanner.nextInt();
//            char inputOper = scanner.next().charAt(0);
//            // for (int i = 0; i < expression.length(); i++) {
//            if (inputOper == ')' || inputOper == '(' || inputOper == '+' || inputOper == '-' || inputOper == '*' || inputOper == '/') {
//                stackSimbol.push(inputOper);
//            }
//
//            stackNum.push(input);
//
//            if (stackNum.size() == 2) {
//                int result = 0;
//                switch (stackSimbol.pop()) {
//                    case '+':
//                        result = stackNum.pop() + stackNum.pop();
//                        stackNum.push(result);
//                        break;
//                    case '-':
//                        result = stackNum.pop() - stackNum.pop();
//                        stackNum.push(result);
//                        break;
//                    case '*':
//                        result = stackNum.pop() * stackNum.pop();
//                        stackNum.push(result);
//                        break;
//                    case '/':
//                        result = stackNum.pop() / stackNum.pop();
//                        stackNum.push(result);
//                }
//                break;
//            }
//
//            if (inputOper == '=') {
//                levelOper = inputOper;
//            }
//
//
//

            System.out.println(stackSimbol);
            System.out.println(stackNum);
            System.out.println("Result = " + stackRes);

        }
    }
//}


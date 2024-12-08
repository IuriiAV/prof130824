package com.telran.h6;

import java.util.Stack;

public class CalculatorStack {

    public static void main(String[] args) {


        String expression = "( 3 + 2 ) * 2 - 7";


        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <expression.length() ; i++) {

            char[] exp = new char[expression.length()];
            exp[i] = expression.charAt(i);

        }
    }
}

package com.telran.lesson11;

import java.util.Stack;

public class TaskExample {

    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();
        String txt = "kbceffecbh";

        for (int i = 0; i < txt.length(); i++) {
            char element = txt.charAt(i);

            if (stack.isEmpty()) {
                stack.push(element);
            } else {
                Character peek = stack.peek();
                if (peek == element) {
                    stack.pop();
                } else {
                    stack.push(element);
                }
            }
        }
        System.out.println(stack);
    }
}

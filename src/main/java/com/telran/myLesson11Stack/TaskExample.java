package com.telran.myLesson11Stack;

import java.util.Stack;

public class TaskExample {

    public static void main(String[] args) {
        //Short
        //kbceffecbh -> kbceecbh -> kbccbh -> kbbh -> kh

        //2 Soliter

        //3 Calculator (3+5)*2 - 7 - > stack and POLIZ
        //stack of numbers and stack of operations

        Stack<Character> stack = new Stack<>();
        String text = "kbceffecbh";

        for (int i = 0; i < text.length(); i++) {
            char element = text.charAt(i);
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

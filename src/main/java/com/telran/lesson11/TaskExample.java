package com.telran.lesson11;

import java.util.Stack;

public class TaskExample {
    public static void main(String[] args) {
        //1 Short
        //kbceffecbh  -> kbceecbh - > kbccbh - > kbbh - > kh

        //2
        // Soliter

        //3 Calculator (3+5)*2 - 7 POLIZ

        Stack<Character> stack = new Stack<>();
        String text = "kbceffecbh";
        for (int i = 0; i < text.length(); i++) { // 0,1,2
            char element = text.charAt(i); // k, b, c
            if (stack.isEmpty()) {
                stack.push(element); // +k
            } else {
                char peek = stack.peek(); // k,b
                if (peek == element) { // k!=b, b!=c
                    stack.pop();
                } else{
                    stack.push(element); // k, b, c
                }
            }

        }
        System.out.println(stack);
    }
}

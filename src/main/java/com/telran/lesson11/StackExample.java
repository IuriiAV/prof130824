package com.telran.lesson11;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("Java");
        stack.push("class");

        for (String str : stack) {
            System.out.println(str);
        }

    }
}

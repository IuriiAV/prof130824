package com.telran.lesson11;

import java.util.Stack;

/**
 * Stack LIFO - last input, first output
 *
 */
public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        //push - помещает элементы на вершину стека
        stack.push("Hello");
        stack.push("Java");
        stack.push("Class");

        System.out.println(stack);

        System.out.println("Index Java" + stack.search("Java"));
        System.out.println("Index Hello" + stack.search("Hello"));
        System.out.println("Index Class" + stack.search("Class"));
        System.out.println("Index SQL" + stack.search("SQL"));

        System.out.println("Top element (peek)is " + stack.peek());
        System.out.println("Top element (peek)is " + stack.peek());

        String topElement = stack.pop();
        System.out.println("Top element (pop) is " + topElement);
        System.out.println("Top element (peek)is " + stack.peek());

        System.out.println("Top element (pop) is " + stack.pop());
        System.out.println("Top element (pop) is " + stack.pop());
        if (!stack.isEmpty()) {
            System.out.println("Top element (pop) is " + stack.pop());
        }

    }
}

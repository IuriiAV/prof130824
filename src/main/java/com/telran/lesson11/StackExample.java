package com.telran.lesson11;

import java.util.Stack;

/**
 * Stack LIFO - last input, first output
 * Stack extends Vector - analog Dynamic Array
 * Vector медленнее чем ArrayList, за счет того что его методі синхронизированніе
 *
 * ArrayList - список (динамический массив), Vector  - аналог ArrayList, но с возможностью работать в многопоточной среде
 * Stack - тоже устроен как динамический массив, но он имеет три метода push,peek,pop которые позволяют работать с ним по принципу LIFO
 */
public class StackExample {
// Верхний элемент это вершина стэка Элементы всегда помезаются на вершину стека
// и извлекаются всегда только с вершины стека
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



        //peek - получает элементы с вершины стека, но не извлекает его
        System.out.println("Top element (peek)is " + stack.peek());
        System.out.println("Top element (peek)is " + stack.peek());

        //pop - извлекает элементы с вершины стека и извлекает его оттуда

        String topElement = stack.pop();
        System.out.println("Top element (pop) is " + topElement);
        System.out.println("Top element (peek)is " + stack.peek());

        System.out.println("Top element (pop) is " + stack.pop());
        System.out.println("Top element (pop) is " + stack.pop());

        System.out.println("Top element (pop) is " + topElement);
        if (!stack.isEmpty()) {
            System.out.println("Top element (pop) is " + stack.pop());
        }


    }
}

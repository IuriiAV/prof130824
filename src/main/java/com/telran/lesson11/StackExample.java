package com.telran.lesson11;

import java.util.Stack;

/**
 * Stack LIFO - last input, first output
 * Stack extends Vector, Vector - analog Dynamic Array
 * Vector медленнее чем ArrayList, за счет того что его методы
 * синхронизированные
 *
 * ArrayList - список (динамический массив), Vector аналог ArrayList,
 * но с возможностью работать в многопоточной среде, Stack тоже устроен
 * внутри как динамический массив, но он имеет три метода push, peek, pop,
 * которые позволяют работать с ним по принципу LIFO
 *
 */
public class StackExample {
    /*    Верхний элемент это вершина стека
    Элементы всегда помещаются на вершину стека и извлекаются
    всегда только с вершины стека

      |       |
      |       |
      | Java  |
      |_Hello_|

     */

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        //push - помещает элементы на вершину стека
        stack.push("Hello");
        stack.push("Java");
        stack.push("Class");

        System.out.println(stack);
        for (String str : stack) {
            System.out.println(str);
        }

        System.out.println("Index Java " + stack.search("Java"));
        System.out.println("Index Hello " + stack.search("Hello"));
        System.out.println("Index Class " + stack.search("Class"));
        System.out.println("Index SQL " + stack.search("SQL"));

        //peek - получает элемент с вершины стека, но не извлекает его
        System.out.println("Top element (peek) is " + stack.peek());
        System.out.println("Top element (peek) is " + stack.peek());

        //pop - получает элемент с вершины стека и извлекает его оттуда
        String topElement = stack.pop();
        System.out.println("Top element (pop)  is " + topElement);
        System.out.println("Top element (peek) is " + stack.peek());

        System.out.println("Top element (pop)  is " + stack.pop());
        System.out.println("Top element (pop)  is " + stack.pop());
        if (!stack.isEmpty()) {
            System.out.println("Top element (pop)  is " + stack.pop());
        }

    }
}

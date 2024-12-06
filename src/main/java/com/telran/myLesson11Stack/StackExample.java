package com.telran.myLesson11Stack;

import java.util.Stack;

public class StackExample {
    /**
     * Stack LIFO - last input, first output
     * Stack extends Vector, Vector - analog Dynamic Array
     * Vector медленнее, чем ArrayList, за счет того, что его методы синхронизированы
     * ArrayList - список (динамический массив), Vector аналог ArrayList,
     * но с возможностью работать в многопоточной среде, Stack тоже устроен
     * внутри, как динамический массив, но он имеет три метода push, peek, pop,
     * которые позволяют с ним работать по принципу LIFO
     */

    public static void main(String[] args) {
        /*
        |        |
        |  Class |
        |  Java  |
        |__Hello_|
         */

        Stack<String> stack = new Stack<>();
        //push - помещает элементы на вершину стека
        stack.push("Hello");
        stack.push("Java");
        stack.push("Class");

        //peek - получить элемент с вершины стека, но не извлекает его
        System.out.println("Top element (peek) is: " + stack.peek());

        //pop - получает элемент с вершины стека и извлекает его оттуда
        String topElement = stack.pop();
        System.out.println("Top element (pop) is " + topElement);
        System.out.println("Top element (peek) is: " + stack.peek());

        System.out.println(stack.search("Java"));



    }
}

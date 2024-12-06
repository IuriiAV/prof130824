package com.telran.myLesson11Stack;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExapmle {

    public static void main(String[] args) {
        Queue<String> strings = new LinkedList<>();

        //add element
        strings.offer("Java");
        strings.offer("Hello");

        //peek() (element()) - return, but not delete
        System.out.println(strings.peek());
        System.out.println(strings.peek());

        //poll(), (remove()) - return element and delete from queue

    }
}

package com.telran.lesson11;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {

    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        //Deque + Queue + Stack

        deque.addLast("Hello");
        deque.addLast("Java");
        // Java - > Hello ->
        deque.addFirst("SQL");

        System.out.println(deque.poll());
        System.out.println(deque.poll());
    }
}

package com.telran.lesson11;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<String> strings = new LinkedList<>();

        //offer - add element
        // ->
        strings.offer("Java");
        // Java ->
        strings.offer("Hello");
        // Hello -> Java ->

        //peek ,(element) - return element, but not delete
        System.out.println(strings.peek());
        System.out.println(strings.peek());

        //poll(), (remove) - return element and delete from queue
        System.out.println(strings.poll());

        System.out.println(strings.peek());
        System.out.println(strings.peek());

    }
}

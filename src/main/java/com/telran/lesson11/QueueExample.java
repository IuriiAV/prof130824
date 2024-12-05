package com.telran.lesson11;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String> str = new LinkedList<>();

        str.offer("Java");

        str.offer("Hello");

        System.out.println(str);

        System.out.println(str.peek());
    }
}

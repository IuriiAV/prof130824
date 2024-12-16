package com.telran.h4;


import java.util.Iterator;

public class CustomLinkedList implements Iterator<Integer> {

    private Node head;

    private Node tail;

    private Integer size = 0;

    private Integer index = 0;

    public int get(Integer index) {
        return getNode(index).getData();
    }

    private Node getNode(Integer index) {
        Integer diff = size - index;
        if (index < diff) {
            Node current = head;
            for (Integer i = 0; i < index; i++) {
                current = current.getNext();
            }
            return current;
        }
        Node current = tail;
        for (Integer i = size; i > diff; i--) {
            current = current.getPrevious();
        }
        return current;
    }

    public void remove(Integer index) {
        if (size == 1) {
            head = null;
            tail = null;
            size = 0;
            return;
        }
        if (index == 0) {
            Node next = getNode(1);
            next.setPrevious(null);
            head = next;
            size--;
            return;

        }
        if (index == size - 1) {
            Node previous = getNode(index - 1);
            previous.setNext(null);
            tail = previous;
            size--;
            return;
        }
        Node previous = getNode(index - 1);
        Node next = getNode(index + 1);
        previous.setNext(next);
        next.setPrevious(previous);
        size--;
    }

    public Integer size() {
        return size;
    }

    public void removeLast() {
        if (size == 1) {
            head = null;
            tail = null;
            size = 0;
            return;
        }

        Node previous = getNode(size - 1);
        previous.setNext(null);
        tail = previous;
        size--;
    }

    public void removeFirst() {
        if (size == 1) {
            head = null;
            tail = null;
            size = 0;
            return;
        }

        Node next = getNode(1);
        next.setPrevious(null);
        head = next;
        size--;
    }


    //Time complexity O(1)
    public void addFirst(int data) {
        size++;
        Node node = new Node(data, null);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        head.setPrevious(node);
        node.setNext(head);
        head = node;
    }

    //Time complexity O(n)
    public void addLast(int data) {
        size++;
        Node node = new Node(data, null);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

//        Node current = head;
//        while (current.getNext() != null) {
//            current = current.getNext();
//        }
//        current.setNext(node);
        tail.setNext(node);
        node.setPrevious(tail);
        tail = node;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print("" + current.getData() + " -> ");
            current = current.getNext();
        }
    }

    public void add(Integer index, Integer data) {
        if (index < 0 || index > size - 1) {
            throw new RuntimeException();
        }
        if (size == 0 || index == 0) {
            addFirst(data);
            return;
        }
        if (index == size - 1) {
            addLast(data);
            return;
        }
        Node previous = getNode(index - 1);
        Node next = getNode(index);
        Node current = new Node(data, next);
        previous.setNext(current);
        current.setPrevious(previous);
        size++;

    }


    @Override
    public boolean hasNext() {
        return index < size - 2;
    }

    @Override
    public Integer next() {
        this.index++;
        return get(index);
    }
}
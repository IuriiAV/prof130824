package com.telran.lesson8.custom;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomLinkedList implements Iterable<Integer> {

    private Node head;

    // Time complexity O(n)
    public boolean add(int index, int data) {
        if (index < 0) {
            throw new IllegalArgumentException("Index cannot be negative.");
        }

        Node node = new Node(data, null);
        if (index == 0) {
            node.setNext(head);
            head = node;
            return true;
        }

        Node current = head;
        Node prev = null;

        for (int i = 0; i < index; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + i);
            }
            prev = current;
            current = current.getNext();
        }

        prev.setNext(node);
        node.setNext(current);
        return true;
    }

    // Time complexity O(1)
    public void addFirst(int data) {
        Node node = new Node(data, null);
        if (head == null) {
            head = node;
            return;
        }

        node.setNext(head);
        head = node;
    }

    // Time complexity O(n)
    public void addLast(int data) {
        Node node = new Node(data, null);
        if (head == null) {
            head = node;
            return;
        }

        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(node);
    }

    //Time complexity O(n)
    public Integer get(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Index cannot be negative.");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + i);
            }
            current = current.getNext();
        }

        return current != null ? current.getData() : null;
    }

    // Time complexity O(n)
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
    }

    // Time complexity O(n)
    public Node remove(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Index cannot be negative.");
        }

        Node current = head;
        if (index == 0) {
            head = head.getNext();
            current.setNext(null);
            return current;
        }

        Node prev = null;
        for (int i = 0; i < index; i++) {
            prev = current;
            current = current.getNext();
            if (current == null) {
                throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + i);
            }
        }

        prev.setNext(current.getNext());
        current.setNext(null);
        return current;
    }

    // Time complexity O(1)
    public Node removeFirst() {
        if (head == null) return null;
        Node firstNode = head;
        head = head.getNext();
        firstNode.setNext(null);
        return firstNode;
    }

    // Time complexity O(n)
    public Node removeLast() {
        if (head == null) return null;

        if (head.getNext() == null) {
            Node lastNode = head;
            head = null;
            return lastNode;
        }

        Node current = head;
        Node prev = null;
        while (current.getNext() != null) {
            prev = current;
            current = current.getNext();
        }
        if (prev != null) {
            prev.setNext(null);
        }
        return current;
    }

    // Time complexity O(n)
    public int size() {
        int size = 0;
        Node current = head;
        while (current != null) {
            current = current.getNext();
            size++;
        }
        return size;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int index = -1;

            @Override
            public boolean hasNext() {
                return index + 1 < size();
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                index++;
                return get(index);
            }
        };
    }

}

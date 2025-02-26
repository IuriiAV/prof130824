package com.telran.lesson8.custom;

import java.util.NoSuchElementException;

public class CustomLinkedList {

    private Node head;

    private int size = 0;

    //Time complexity O(1)
    public void addFirst(int data) {
        Node node = new Node(data, null);
        if (head == null) {
            head = node;
            size++;
            return;
        }

        node.setNext(head);
        head = node;
        size++;
    }

    //Time complexity O(n)
    public void addLast(int data) {
        Node node = new Node(data, null);
        if (head == null) {
            head = node;
            size++;
            return;
        }

        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(node);
        size++;
    }

    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node previousNode = getNode(index - 1);
        Node currentNode = previousNode.getNext();
        Node newNode = new Node(data, currentNode);
        previousNode.setNext(newNode);
        size++;
    }

    public int get(int index) {
        return getNode(index).getData();
    }

    private Node getNode(int index) {
        if (index >= size) {
            throw new NoSuchElementException("No element with index " + index + " in the list");
        }
        Node current = head;
        int currentIndex = 0;
        while (currentIndex != index && current.getNext() != null) {
            current = current.getNext();
            currentIndex++;
        }
        return current;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print("" + current.getData() + " -> ");
            current = current.getNext();
        }
    }

    public int remove(int index) {
        if (index == 0) {
            int data = head.getData();
            head = head.getNext();
            size--;
            return data;
        }

        Node prev = getNode(index - 1);
        if (prev == null) {
            throw new NoSuchElementException("No such element");
        }

        Node curr = prev.getNext();
        if (curr == null) {
            throw new NoSuchElementException("No such element");
        }

        prev.setNext(curr.getNext());
        size--;

        return curr.getData();
    }

    public int removeFirst() {
        return remove(0);
    }

    public int removeLast() {
        return remove(size - 1);
    }

    public int size() {
        return size;
    }
}

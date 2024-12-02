package com.telran.h5.custom;

import java.util.Iterator;

public class CustomLinkedList implements Iterable<Node>  {

    private Node head;

    private Node tail;

    private int size = 0;

    public void addLast(int data) {
        Node node = new Node(data, null, null);

        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(node);
        size++;
    }

    public void addFirst(int data) {
        Node node = new Node(data, null, null);
        if (head == null) {
            tail= node;
            head = tail;
            size++;
            return;
        }

        node.setNext(head);
        node.setPrev(tail);
        head = node;
        size++;
    }



    public void addIndex(int index, int data) {
        Node current = head;
        Node node = new Node(data, null, null);
        int count = 0;
        while (current != null) {
            if (index == 0) {
                head = node;
                head.setNext(current);
                size++;
                return;
            }
            if (count == index - 1) {
                node.setNext(current.getNext());
                current.setNext(node);
            }

            current = current.getNext();
            count++;
        }
        size++;
    }

    public int get(int index) {
        Node current = head;

        if (index < 0) {
            System.out.println("Error");
        }

        int count = 0;
        while (current != null) {
            if (count == index) {
                return current.getData();
            }
            current = current.getNext();
            count++;
        }
        return current.getData();
    }

    public int size() {
        return size;
    }

    public void remove(int index) {
        Node current = head;
        int count = 0;

        if (index == 0) {
            head = head.getNext();
            size--;
            return;
        }

        while (current != null) {

            if (count == index - 1) {
                current.setNext(current.getNext().getNext());
                size--;
                break;
            }
            current = current.getNext();
            count++;
        }
    }

    public void removeFirst() {
        head = head.getNext();
        size--;
    }

    public void removeLast() {
        Node current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        size--;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(" " + current.getData() + "-> ");
            current = current.getNext();
        }
        System.out.println("\n");

    }

    @Override
    public String toString() {
        return "CustomLinkedList{" +
                "head=" + head +
                '}';
    }

    @Override
    public Iterator<Node> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<Node> {

        @Override
        public String toString() {
            return "CustomLinkedList{" +
                    "head=" + head;
        }

        @Override
        public boolean hasNext() {
            Node current = head;
            if (current.getNext() == null) {
                return false;
            }
            return true;
        }

        @Override
        public Node next() {
            Node current = head;
            current = current.getNext();
            return current;
        }

        @Override
        public void remove() {
            Iterator.super.remove();
        }
    }
}

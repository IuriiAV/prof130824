package com.telran.h5.custom;

import java.util.Iterator;

public class CustomLinkedList implements Iterable<Integer> {

    private Node head;

    private Node tail;

    private int size = 0;

    public void addLast(int data) {
        Node node = new Node(data, null, null);
        if (tail == null) {
            tail = node;
            head = node;
        }
        Node current = tail;

        current.setNext(node);
        node.setPrev(tail);
        tail = node;
        size++;
    }
//    public void addLast(int data) {
//        Node node = new Node(data, null, null);
//
//        Node current = head;
//        while (current.getNext() != null) {
//            current = current.getNext();
//        }
//        current.setNext(node);
//        size++;
//    }

    public void addFirst(int data) {
        Node node = new Node(data, null, null);
        if (head == null) {
            tail = node;
            head = tail;
            size++;
            return;
        }

        node.setNext(head);
        head.setPrev(node);
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
    public Iterator<Integer> iterator() {
        return new MyIterator();
    }


    private class MyIterator implements Iterator<Integer> {

        int count = -1;

        @Override
        public boolean hasNext() {
            return count + 1 <size();
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                System.out.println("No more elements in the list.");
            }
            count++;
            return get(count);
        }

        @Override
        public void remove() {
            Iterator.super.remove();
        }
    }
}

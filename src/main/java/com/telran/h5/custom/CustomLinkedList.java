package com.telran.h5.custom;


public class CustomLinkedList {

    private Node head;

    private int size = 0;

    public void addLast(int data) {
        Node node = new Node(data, null);

        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(node);
        size++;
    }

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

    public void addIndex(int index, int data) {
        Node current = head;
        Node node = new Node(data, null);
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
                "head=" + head;
    }


}

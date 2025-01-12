package com.telran.homework5.custom;

public class CustomLinkedList {

    private Node head;

    //Time complexity O(1)
    public void addFirst(int data) {
        Node node = new Node(data, null);
        if (head == null) {
            head = node;
            return;
        }

        node.setNext(head);
        head = node;
    }

    public int get(int index) {
        int count = 0;
        Node current = head;
        while (current != null) {
            if (count == index) {
                return current.getData();
            } else {
                count += 1;
                current = current.getNext();
            }
        }
        return -1;
    }
    public void remove(int index) {
        int count = 0;
        Node prev = null;
        Node current = head;
        while (current != null) {
            if (count == index) {
                prev.setNext(current.getNext());
            } else {
                count += 1;
                prev = current;
                current = current.getNext();
            }
        }
    }
    public void add(int index, int data) {
        int count = 0;
        Node prev = null;
        Node current = head;
        while (current != null) {
            if (count == index) {
                Node node = new Node(data, null);
                prev.setNext(node);
                node.setNext(current);
            } else {
                count += 1;
                prev = current;
                current = current.getNext();
            }
        }
    }
    public void removeFirst() {
        if (head != null && head.getNext() != null) {
            head = head.getNext();
        } else if (head != null) {
            head = null;
        }
    }
    public void removeLast() {
        Node prev = null;
        Node current = head;
        while (current.getNext() != null) {
            prev = current;
            current = current.getNext();
        }
        prev.setNext(null);
    }
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count += 1;
            current = current.getNext();
        }
        return count;
    }
}

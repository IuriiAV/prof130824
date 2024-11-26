package com.telran.lesson8.custom;

public class CustomLinkedList {

    private Node head;


    public void addLast(int data) {
        Node node = new Node(data, null);
        if (head == null){
            head = node;
            return;
        }

        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(node);
    }

    public void addFirst(int data){
        Node node = new Node(data, null);
        if (head == null){
            head = node;
            return;
        }

        node.setNext(head);
        head = node;
    }

    public void print(){
        Node current = head;
        while (current != null){
            System.out.print(" " + current.getData() + "-> " );
            current = current.getNext();
        }
    }



}

package com.telran.h5.custom;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node {

    private int data;

    private Node next;

    private Node prev;

    public Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

//    public Node getPrev() {
//        return prev;
//    }
//
//    public void setPrev(Node prev) {
//        this.prev = prev;
//    }
//
//    public int getData() {
//        return data;
//    }
//
//    public void setData(int data) {
//        this.data = data;
//    }
//
//    public Node getNext() {
//        return next;
//    }
//
//    public void setNext(Node next) {
//        this.next = next;
//    }

    @Override
    public String toString() {
        return data +" "+
                 next +" " + prev;
    }
}

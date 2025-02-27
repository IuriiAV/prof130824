package com.telran.lesson8.custommine;

import java.util.Iterator;
import java.util.NoSuchElementException;

 public class CustomIterator implements Iterator<Integer> {
    private Node current;

    public CustomIterator(Node head) {
        this.current = head;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int data = current.getData();
        current = current.getNext();
        return data;
    }
}

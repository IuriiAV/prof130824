package com.telran.lesson11.hw;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class CustomPriorityQueue<E> extends PriorityQueue<E> {

    public CustomPriorityQueue(int initialCapacity) {
        super(initialCapacity);
    }

    public CustomPriorityQueue(int initialCapacity, Comparator<? super E> comparator) {
        super(initialCapacity, comparator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<E> tempList = new ArrayList<>();
        while (!super.isEmpty()) {
            E poll = super.poll();
            sb.append(poll).append(" ");
            tempList.add(poll);
        }
        tempList.forEach(super::add);
        return sb.toString();
    }
}

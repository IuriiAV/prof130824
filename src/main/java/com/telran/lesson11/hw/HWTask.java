package com.telran.lesson11.hw;

import java.util.PriorityQueue;

public class HWTask {

    public static void main(String[] args) {
        PriorityQueue<Patient> objects = new PriorityQueue<>(10);

        objects.add(new Patient("Robert", "Mc'Adams", Priority.HIGH));
        objects.add(new Patient("Elizabet", "Swan", Priority.MEDIUM));
        objects.add(new Patient("Rachel", "Mc'Adams", Priority.HIGH));
        objects.add(new Patient("Robert", "Pattinson", Priority.LOW));
        objects.add(new Patient("Mathew", "Mc'Conaughey", Priority.CRITICAL));
        objects.add(new Patient("Sasha", "Sloan", Priority.LOW));
        objects.add(new Patient("Melinda", "Siblings", Priority.CRITICAL));
        objects.add(new Patient("Jenifer", "Watson", Priority.MEDIUM));
        objects.add(new Patient("Isabel", "Great", Priority.MEDIUM));
        objects.add(new Patient("Fridrich", "Lasso", Priority.HIGH));

        while (!objects.isEmpty()) {
            System.out.println(objects.poll());
        }
    }
}

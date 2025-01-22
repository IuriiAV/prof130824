package com.telran.lesson11.hw;

import java.util.Deque;
import java.util.PriorityQueue;

public class HWTask {

    public static void main(String[] args) {
        PriorityQueue<Patient> objects = new PriorityQueue<>(10, new PatientComparator());
        objects.add(new Patient("Anna", 25, true));
        objects.add(new Patient("Alona", 29, true));
        objects.add(new Patient("Oleg", 28, false));
        objects.add(new Patient("Peter", 45, true));
        objects.add(new Patient("Anastasia", 67, false));
        objects.add(new Patient("Irina", 4, false));
        objects.add(new Patient("Maria", 25, true));
        objects.add(new Patient("Inna", 26, false));
        objects.add(new Patient("Alex", 20, false));
        objects.add(new Patient("Nadia", 57, true));

        System.out.println(objects);
    }

}

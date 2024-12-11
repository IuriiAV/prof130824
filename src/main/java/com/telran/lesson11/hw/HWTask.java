package com.telran.lesson11.hw;

import java.util.PriorityQueue;

public class HWTask {

    public static void main(String[] args) {
        PriorityQueue<Patient> objects = new PriorityQueue<>(10);

        objects.add(new Patient("Babushka Silver", 65, 3));
        objects.add(new Patient("Babushka Gold", 65, 2));
        objects.add(new Patient("Lola", 22, 2));

        for (Patient patient : objects) {
            System.out.println(patient);
        }

    }
}

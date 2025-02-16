package com.telran.lesson11.hw;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HWTask {

    public static void main(String[] args) {
        Comparator<Patient> patientComparator = (o1, o2) -> o1.age - o2.age;

        PriorityQueue<Patient> objects = new CustomPriorityQueue<>(10, patientComparator);
        objects.add(new Patient(10));
        objects.add(new Patient(5));
        objects.add(new Patient(20));
        objects.add(new Patient(13));

        System.out.println(objects);
        System.out.println(objects);
        System.out.println(objects);
        System.out.println(objects);
    }
}

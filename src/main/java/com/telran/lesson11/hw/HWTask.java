package com.telran.lesson11.hw;

import java.util.Comparator;
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

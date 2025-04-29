package com.telran.homework.homework5;

import java.util.PriorityQueue;

public class HospitalQueue {

    public static void main(String[] args) {

        PriorityQueue<Patient> queue = new PriorityQueue<>(new PatientComparator());

        Patient patient1 = new Patient("Alex", 23, true);
        Patient patient2 = new Patient("Olga", 24, false);
        Patient patient3 = new Patient("Oleg", 43, true);
        Patient patient4 = new Patient("Max", 53, false);
        Patient patient5 = new Patient("Oxy", 29, true);

        queue.add(patient1);
        queue.add(patient2);
        queue.add(patient3);
        queue.add(patient4);
        queue.add(patient5);

        printQueue(queue);

    }

    public static void printQueue(PriorityQueue<Patient> queue) {
        while (!queue.isEmpty()) {
            Patient patient = queue.poll();
            String urgency = patient.isUrgent() ? "Срочный!" : "Очередной.";
            System.out.println("Имя : " + patient.getName() + ", Возраст : " +
                    patient.getAge() + ", Срочность : " + urgency);
        }
    }
}

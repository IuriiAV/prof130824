package com.telran.homeworks.homework6;

import java.util.PriorityQueue;

public class HospitalQueue {
    public static void main(String[] args) {

        PriorityQueue<Patient> patientQueue = new PriorityQueue<>(new PatientComparator());


        patientQueue.add(new Patient("John Doe", 2, false)); // обычный пациент
        patientQueue.add(new Patient("Jane Smith", 1, true)); // срочный пациент
        patientQueue.add(new Patient("Alex Brown", 4, false)); // обычный пациент
        patientQueue.add(new Patient("Emily Davis", 3, true)); // срочный пациент


        System.out.println("Patients attended in priority order:");
        while (!patientQueue.isEmpty()) {
            System.out.println(patientQueue.poll());
        }
    }
}


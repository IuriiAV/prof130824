package com.telran.h6;

import java.util.PriorityQueue;

public class HospitalApp {

    public static void main(String[] args) {

        PriorityQueue<Patient> queue = new PriorityQueue<>();

        Patient Wacho = new Patient("Nik", "Wacho", 36, Level.Intermediate);
        Patient Acho = new Patient("Alex", "Acho", 40, Level.Lowest);
        Patient Simer = new Patient("Nikolay", "Simer", 18, Level.Lowest);
        Patient Minin = new Patient("Andrey", "Minin", 22, Level.Highest);

        queue.offer(Acho);
        queue.offer(Simer);

        System.out.println(queue);
    }
}

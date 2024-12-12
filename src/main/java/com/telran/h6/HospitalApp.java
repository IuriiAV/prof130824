package com.telran.h6;

import java.util.PriorityQueue;

public class HospitalApp {

    public static void main(String[] args) {

        PriorityQueue<Patient> queue = new PriorityQueue<>(10);

        Patient wacho = new Patient("Nik", "Wacho", 12, Card.SILVER);
        Patient acho = new Patient("Alex", "Acho", 40, Card.SILVER);
        Patient moll = new Patient("moll", "frik", 40, Card.SILVER);
        Patient simer = new Patient("Nikolay", "Simer", 18, Card.GOLD);
        Patient maks = new Patient("Maks", "Smirnoff", 18, Card.GOLD);
        Patient minin = new Patient("Andrey", "Minin", 29, Card.PLATINUM);
        Patient danil = new Patient("Danil", "Danskoy", 48, Card.PLATINUM);


        queue.offer(wacho);
        queue.offer(simer);
        queue.offer(minin);
        queue.offer(acho);
        queue.offer(moll);
        queue.offer(maks);
        queue.offer(danil);

    while (!queue.isEmpty()){
        System.out.println(queue.poll());
    }







    }
}

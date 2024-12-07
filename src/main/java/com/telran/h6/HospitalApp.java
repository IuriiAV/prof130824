package com.telran.h6;

import java.util.PriorityQueue;

public class HospitalApp {

    public static void main(String[] args) {

        PriorityQueue<Patient> queue = new PriorityQueue<>();

        Patient wacho = new Patient("Nik", "Wacho", 36, Card.SILVER);
        Patient acho = new Patient("Alex", "Acho", 40, Card.SILVER);
        Patient moll = new Patient("moll", "frik", 40, Card.SILVER);
        Patient simer = new Patient("Nikolay", "Simer", 18, Card.GOLD);
        Patient maks = new Patient("Maks", "Smirnoff", 18, Card.GOLD);
        Patient minin = new Patient("Andrey", "Minin", 22, Card.PLATINUM);
        Patient danil = new Patient("Danil", "Danskoy", 48, Card.PLATINUM);


        queue.offer(wacho);
        queue.offer(acho);
        queue.offer(simer);
        queue.offer(maks);
        queue.offer(minin);
//       queue.offer(danil);

//        queue.offer(danil);





       queue.forEach(System.out::println);

    }
}

package com.telran.lesson25;

import java.time.LocalTime;

// только время
public class LocalTimeExample {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(" " + now.getHour() + " " + now.getMinute() + " " +
                now.getSecond() + " " + now.getNano());

        LocalTime time = now.plusHours(4);
        System.out.println(time);
        time = now.minusNanos(4445669874l);
        System.out.println(time);

        while (true) {
            System.out.println(LocalTime.now());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }
}
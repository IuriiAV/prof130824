package com.telran.lesson25;

import java.util.Date;

public class SystemCMExample {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());

        Date date = new Date(System.currentTimeMillis());
        System.out.println(date);
    }
}

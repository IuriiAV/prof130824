package com.telran.myLesson10.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PassportApp {

    public static void main(String[] args) {
        List<Passport> passports = Arrays.asList(
                new Passport(333245),
                new Passport(872345),
                new Passport(111111)
        );

        System.out.println("Before sort: " + passports);
        Collections.sort(passports);
        System.out.println("After sort: " + passports);
    }
}

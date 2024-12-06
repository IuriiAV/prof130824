package com.telran.lesson10.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PassportApp {

    public static void main(String[] args) {
        List<Passport> passports = Arrays.asList(
               new Passport(33334),
               new Passport(12323),
               new Passport(10010));
        System.out.println("Before sort :");
        printPassports(passports);
        Collections.sort(passports);
        System.out.println("After ");
        printPassports(passports);

    }

    private static void printPassports(List<Passport> passports) {
        passports.forEach(System.out::println);
    }
}

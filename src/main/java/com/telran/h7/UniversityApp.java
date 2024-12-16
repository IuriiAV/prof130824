package com.telran.h7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniversityApp {

    public static void main(String[] args) {

        System.out.println("Do you want to create a 10 student ? y/n");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Integer, String> studentMap = null;
        if (input.equals("y")) {
            studentMap = new HashMap<>();

            for (int i = 1; i <= 10; i++) {
                String name = "Student" + i;
                Student student = new Student(i, name);
                studentMap.put(student.getId(), student.getName());
            }

            printStudent(studentMap);
        }




    }

    private static void printStudent(Map<Integer,String> studentMap) {
        studentMap.forEach((k,v) -> System.out.println("Student ID = " + k + " , name =  " + v));
    }


}

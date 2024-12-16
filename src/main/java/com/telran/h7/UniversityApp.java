package com.telran.h7;

import java.util.*;

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

            printAllStudent(studentMap);
        }

        System.out.println("Do you need information about a student? y/n");
        input = scanner.nextLine();
        if (input.equals("y")) {
            System.out.print("Enter student ID  =  ");
            Integer studID = scanner.nextInt();
            assert studentMap != null;
            getStudent(studentMap, studID);
        }



//        Scanner scan = new Scanner(System.in);
//        System.out.println("Do you want to add a student? y/n");
//        String inputAdd = scan.nextLine();
//        if (inputAdd.equals("y")) {
            System.out.println("Enter Name student");

            String nameStudent = "kostya";
            List<Integer> list = new ArrayList<>(studentMap.keySet());

            int lastKey = list.size() ;
            lastKey++;
            studentMap.put(lastKey, nameStudent);
            System.out.println("Your student with Name " + nameStudent + " and ID " + lastKey + " add to university");
      //  }

        System.out.println("Print all students ? y/n");
        String input2 = scanner.nextLine();
        if (input2.equals("y")){
            assert studentMap != null;
            printAllStudent(studentMap);
        }


    }

    private static void addStudent(Map<Integer, String> studentMap) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        List<Integer> list = new ArrayList<>(studentMap.keySet());

        int lastKey = list.size() - 1;
        lastKey++;
        studentMap.put(lastKey, name);
        System.out.println("Your student with Name " + name + " and ID " + lastKey + " add to university");

    }

    private static void getStudent(Map<Integer, String> studentMap, Integer studID) {
        String studentValue = studentMap.get(studID);
        System.out.println("Your student with Name " + studentValue + " and ID " + studID);
    }

    private static void printAllStudent(Map<Integer, String> studentMap) {
        studentMap.forEach((k, v) -> System.out.println("Student ID = " + k + " , name =  " + v));
    }


}

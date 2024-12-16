package com.telran.h7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class UniversityApp {

    public static void main(String[] args) throws IOException {

        Map<Integer, String> studentMap = new HashMap<>();

        System.out.println("Do you want to create a 10 student ? y/n");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("y")) {
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
            if (!studentMap.isEmpty()) {
                System.out.print("Enter student ID  =  ");
                Integer studID = scanner.nextInt();
                getStudent(studentMap, studID);
            } else {
                System.out.println("There are no students at the institute");
            }
        }


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Do you want to add a student? y/n ");
        String inputAdd = reader.readLine();
        if (inputAdd.equals("y")) {
            addStudent(studentMap);
        }

        System.out.println("Print all students ? y/n");
        String input2 = scanner.nextLine();
        if (input2.equals("y")) {
            printAllStudent(studentMap);
        }


        System.out.println("Do you want to change the students name? y/n ");
        inputAdd = reader.readLine();
        if (inputAdd.equals("y")) {
            setStudentName(studentMap);
        }


    }

    private static void setStudentName(Map<Integer, String> studentMap) throws IOException {
        System.out.print("Which student do you want to change the name of? Enter ID : ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int inputID = Integer.parseInt(reader.readLine());
        System.out.print("Enter the name you want to change to : ");
        String inputName = reader.readLine();
        String oldName = studentMap.get(inputID);
        if (studentMap.containsKey(inputID)){
            System.out.println("You change name " + oldName + " to the name " + inputName);
            studentMap.put(inputID, inputName);
        } else {
            System.out.println("This student does not exist");
        }


    }

    private static void addStudent(Map<Integer, String> studentMap) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Name student");
        String nameStudent = reader.readLine();


        if (studentMap != null) {
            List<Integer> list = new ArrayList<>(studentMap.keySet());
            int lastKey = list.size();
            lastKey++;
            Student student = new Student(lastKey, nameStudent);
            studentMap.put(student.getId(), student.getName());
            System.out.println("Your student with name -> " + nameStudent + " and ID -> " + lastKey + " add to university \n");
        } else {
            Student student = new Student(1, nameStudent);
            studentMap.put(student.getId(), student.getName());
        }
    }


    private static void getStudent(Map<Integer, String> studentMap, Integer studID) {
        String studentValue = studentMap.get(studID);
        System.out.println("Your student with Name " + studentValue + " and ID " + studID + "\n");
    }

    private static void printAllStudent(Map<Integer, String> studentMap) {
        studentMap.forEach((k, v) -> System.out.println("Student ID = " + k + " , name =  " + v + "\n"));
    }


}

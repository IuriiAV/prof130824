package com.telran.h7.UniversityApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Utils {

    public void run() throws IOException {
        Map<Integer, String> studentMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String onemore = "y";
        while (onemore.equals("y")) {
            System.out.println("Select What you want : \n");
            System.out.println("1 - Create 10 students ");
            System.out.println("2 - Get information about student ");
            System.out.println("3 - Add a student to the university ");
            System.out.println("4 - Change name student ");
            System.out.println("5 - Print all students ");
            int switchNum = scanner.nextInt();
            switch (switchNum) {
                case 1 -> createTenStudent(studentMap);
                case 2 -> getInformationOfStudent(studentMap);
                case 3 -> addStudentCase(studentMap);
                case 4 -> changeNameCase(studentMap);
                case 5 -> printAllStudent(studentMap);
            }

            System.out.println("Do you want to continue? y/n");
            Scanner sc2 = new Scanner(System.in);
            onemore = sc2.nextLine();
        }


    }

    private void changeNameCase(Map<Integer, String> studentMap) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Do you want to change the students name? y/n ");
        String inputAdd = reader.readLine();
        if (inputAdd.equals("y")) {
            setStudentName(studentMap);
        }
    }


    private void addStudentCase(Map<Integer, String> studentMap) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to add a student? y/n ");
        String inputAdd = reader.readLine();
        if (inputAdd.equals("y")) {
            addStudent(studentMap);
        }
    }

    public void getInformationOfStudent(Map<Integer, String> studentMap) {
        System.out.println("Do you need information about a student? y/n");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("y")) {
            if (!studentMap.isEmpty()) {
                System.out.print("Enter student ID  =  ");
                Integer studID = scanner.nextInt();
                getStudent(studentMap, studID);
            } else {
                System.out.println("There are no students at the institute");
            }
        }
    }

    public void createTenStudent(Map<Integer, String> studentMap) {
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
    }

    public void setStudentName(Map<Integer, String> studentMap) throws IOException {
        System.out.print("Which student do you want to change the name of? Enter ID : ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer inputID = Integer.parseInt(reader.readLine());
        System.out.print("Enter the name you want to change to : ");
        String inputName = reader.readLine();
        String oldName = studentMap.get(inputID);
        if (studentMap.containsKey(inputID)) {
            System.out.println("You change name " + oldName + " to the name " + inputName);
            studentMap.put(inputID, inputName);
        } else {
            System.out.println("This student does not exist");
        }


    }

    public void addStudent(Map<Integer, String> studentMap) throws IOException {
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


    public void getStudent(Map<Integer, String> studentMap, Integer studID) {
        String studentValue = studentMap.get(studID);
        System.out.println("Your student with Name " + studentValue + " and ID " + studID + "\n");
    }

    public void printAllStudent(Map<Integer, String> studentMap) {
        if (studentMap.isEmpty()){
            System.out.println("There are no students at the institute");
        }else {
            studentMap.forEach((k, v) -> System.out.println("Student ID = " + k + " , name =  " + v + "\n"));
        }

    }

}

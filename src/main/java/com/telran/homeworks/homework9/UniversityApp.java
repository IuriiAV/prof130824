package com.telran.homeworks.homework9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniversityApp {
    public static void main(String[] args) {

        Map<Integer, Student> studentMap = new HashMap<>();


        studentMap.put(1, new Student(1, "John", "Smith"));
        studentMap.put(2, new Student(2, "Janifer", "Anniston"));
        studentMap.put(3, new Student(3, "Michael", "Johnson"));
        studentMap.put(4, new Student(4, "Emily", "Clark"));
        studentMap.put(5, new Student(5, "Chris", "Brown"));
        studentMap.put(6, new Student(6, "Sarah", "Conor"));
        studentMap.put(7, new Student(7, "David", "Taylor"));
        studentMap.put(8, new Student(8, "Laura", "Anderson"));
        studentMap.put(9, new Student(9, "James", "Black"));
        studentMap.put(10, new Student(10, "Anna", "White"));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Get student by ID");
            System.out.println("2. Add new student");
            System.out.println("3. List all students");
            System.out.println("4. Update student last name");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    Student student = studentMap.get(id);
                    if (student != null) {
                        System.out.println("Student found: " + student);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 2:
                    System.out.print("Enter new student ID: ");
                    int newId = scanner.nextInt();
                    scanner.nextLine();
                    if (studentMap.containsKey(newId)) {
                        System.out.println("Student with this ID already exists.");
                        break;
                    }
                    System.out.print("Enter first name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter last name: ");
                    String lastName = scanner.nextLine();
                    studentMap.put(newId, new Student(newId, firstName, lastName));
                    System.out.println("Student added.");
                    break;

                case 3:
                    System.out.println("List of all students:");
                    for (Student s : studentMap.values()) {
                        System.out.println(s);
                    }
                    break;

                case 4:
                    System.out.print("Enter student ID: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Student updateStudent = studentMap.get(updateId);
                    if (updateStudent != null) {
                        System.out.print("Enter new last name: ");
                        String newLastName = scanner.nextLine();
                        updateStudent.setLastName(newLastName);
                        System.out.println("Last name updated.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
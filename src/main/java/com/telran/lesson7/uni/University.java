package com.telran.lesson7.uni;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class University {
    // variables
    // list students
    // black list students

    //methods
    //generate 10 students on start
    //add student in uni, and check duplicate
    //remove students from uni and add to black list
    //up rate for all students (+1)

    private List<Student> students = new ArrayList<>();
    private List<Student> blackListStudents = new ArrayList<>();

    public void generate() {
        students.add(new Student("Ivan", 8, 1, Arrays.asList(new PhoneNumber("10", "789"))));
        students.add(new Student("Maria", 18, 1, Arrays.asList(new PhoneNumber("10", "799"))));
        students.add(new Student("Stepan", 35, 1, Arrays.asList(new PhoneNumber("10", "759"))));
        students.add(new Student("Ivan", 67, 1, Arrays.asList(new PhoneNumber("10", "489"))));
        students.add(new Student("Anna", 56, 1, Arrays.asList(new PhoneNumber("10", "289"))));
        students.add(new Student("Irina", 2, 1, Arrays.asList(new PhoneNumber("10", "749"))));
        students.add(new Student("Peter", 56, 1, Arrays.asList(new PhoneNumber("10", "786"))));
        students.add(new Student("Roman", 58, 1, Arrays.asList(new PhoneNumber("10", "769"))));
        students.add(new Student("Aleksey", 20, 1, Arrays.asList(new PhoneNumber("10", "709"))));
        students.add(new Student("Olga", 45, 1, Arrays.asList(new PhoneNumber("10", "769"))));

    }

    public void addStudent(Student student) {
        for (Student currentStudent : students) {
            if (currentStudent.equals(student)) {
                return;
            }
        }
        students.add(student);
    }

    public void removeStudents(List<Student> studentsToRemove) {
        for (Student currentStudent : studentsToRemove) {
            boolean hasStudent = false;
           if (students.contains(currentStudent)){
               students.remove(currentStudent);
           }
            
            if (!blackListStudents.contains(currentStudent)) {
                blackListStudents.add(currentStudent);
            }
        }

    }

    public void upRate() {
        for (Student currentStudent : students) {
            currentStudent.addRate(1);
        }
    }

    public void printStudents() {
        System.out.println("students: ");
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ") " + students.get(i).toString());

        }
    }

    public void printBlackListStudents() {
        System.out.println("blackListStudents: ");
        for (int i = 0; i < blackListStudents.size(); i++) {
            System.out.println((i + 1) + ") " + blackListStudents.get(i).toString());

        }
    }

}

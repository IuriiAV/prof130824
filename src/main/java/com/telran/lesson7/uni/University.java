/*package com.telran.lesson7.uni;

import java.util.ArrayList;
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

        private List<String> allStudents = new ArrayList<>();

        private List<String> blackListStudents;

        private void generateStudents() {
            for (int i = 1; i <= 10; i++) {
                List<String> phones = List.of("29464578" + i);
                Student student = new Student("Student" + i, 18 + i % 5, 4 + i%2, phones);
                allStudents.add("Alex");
                allStudents.add("John");
                allStudents.add("Lily");
                allStudents.add("Max");
                allStudents.add("Karen");
                allStudents.add("Bob");
                allStudents.add("Dahlan");
                allStudents.add("Kortny");
                allStudents.add("Melissa");
                allStudents.add("Charlotte");
            }
        }
        public boolean addStudent(Student student) {
            if (allStudents.contains(student)) {
                System.out.println("Student already exist: " + student.getName());
                return false;
            }
            allStudents.add("Student");
            return true;
        }

        public boolean removeStudent(Student student) {
            if (allStudents.remove(student)) {
                blackListStudents.add("Student");
                System.out.println("Student remove: " + student.getName());
                return true;
            }
            System.out.println("Student not found: " + student.getName());
            return false;
        }

        public boolean addRate(Student student) {




}*/


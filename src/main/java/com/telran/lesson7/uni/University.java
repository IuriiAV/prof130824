package com.telran.lesson7.uni;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<>();
    private List<Student> blackList = new ArrayList<>();

    public void generateTenStudents() {
        for (int i = 0; i < 10; i++) {
            Student student = new Student("Student-" + (i + 1), 19 + i, 3);
            student.setNumber("150", "123-455-67");
            student.setNumber("157", "222-887-23");
            students.add(student);
        }
    }

    public void addStudent(Student student) {
        if (blackList.contains(student)) {
            System.out.println("The student is in the black list.");
        }else if (!checkDuplicate(student)) {
            students.add(student);
        } else System.out.println("This student already exists.");
    }

    private boolean checkDuplicate(Student student) {
        return students.contains(student);
    }

    public void removeStudent(Student student) {
        if (students.contains(student)) {
            students.remove(student);
            blackList.add(student);
        } else System.out.println("You're trying to get not existing student.");
    }

    public void upRate() {
        for (Student student : students) {
            student.setRate(student.getRate() + 1);
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Student> getBlackList() {
        return blackList;
    }
}

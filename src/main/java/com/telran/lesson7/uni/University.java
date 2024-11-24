package com.telran.lesson7.uni;

import java.util.ArrayList;
import java.util.List;

public class University {
    //variables
    // list students
    // black list students

    //methods
    // generate 10 students on start

    // add student in uni, and check duplicate

    // remove student from uni and add to black list
    // up rate for all students(+1)

    private List<Student> students;
    private List<Student> blackList;

    public University() {
        this.students = new ArrayList<>();
        this.blackList = new ArrayList<>();
        generateStudents();
    }

    private void generateStudents() {
        for (int i = 1; i <= 10; i++) {
            Student student = new Student("Student" + i, 18 + i, 3.0 + i % 2);
            student.addPhoneNumber(new PhoneNumber("+1", "123456" + i));
            students.add(student);
        }
    }

    public void addStudent(Student student) {
        if (students.contains(student)) {
            System.out.println("Duplicate student: " + student.getInfo());
        } else {
            students.add(student);
        }
    }

    public void removeStudent(Student student) {
        if (students.remove(student)) {
            blackList.add(student);
        }
    }

    public void upgradeRates() {
        for (Student student : students) {
            student.upgradeRate();
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Student> getBlackList() {
        return blackList;
    }

}

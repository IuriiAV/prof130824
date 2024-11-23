package com.telran.h3.uni;

import java.util.ArrayList;

import java.util.List;

/**
 * variables
 * list students
 * black list students
 * //methods
 * *   generate 10 students on start
 * *   add student in uni, and check duplicate
 * *   remove students from uni and add to black list
 * *   up rate for all students (+1)
 */


public class University {

    private List<Student> studentList = new ArrayList<>();

    private List<Student> blackList = new ArrayList<>();

    public University() {
    }

    public void generateTenStudent() {
        for (int i = 1; i <= 10; i++) {
            String studentName = "Student" + i;
            int studentAge = 18 + i;
            int rate = i;

            List<Phone> listPhones = new ArrayList<>();
            for (int j = 1; j <= 2; j++) {
                String code = "+380";
                String number = "489" + i + j + "789";
                listPhones.add(new Phone(code, number));
            }

            Student student = new Student(studentName, studentAge, rate, listPhones);
            studentList.add(student);
        }
    }

    public void addStudent(Student student) {

        for (Student student1 : studentList) {
            if (student1.getName().equals(student.getName())) {
                System.out.println("Student " + student.getName() + " is already study");
                return;
            }
        }
        studentList.add(student);
    }

    public void removeStudents(Student student) {
        System.out.println("The student " + student.getName() + " was expelled and added to the blacklist");
        studentList.remove(student);
        blackList.add(student);
    }


    public void printAllStudents() {
        System.out.println("The all students:\n");
        for (Student student : studentList) {
            System.out.println("Student :" + student.getName() + ", age : " + student.getAge() + " , rate : " + student.getRate() +
                    " , phone numbers : " + student.getPhoneNumber());
        }

    }

    public void printBlackList() {
        System.out.println("Students in BLACK LIST:\n");
        for (Student student : blackList) {
            System.out.println("Student :" + student.getName() + ", age : " + student.getAge() + " , rate : " + student.getRate() +
                    " , phone numbers : " + student.getPhoneNumber());
        }

    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void upgradeRate(List<Student> listStudent) {
        for (Student student : listStudent) {
            int value = student.getRate();
            value = value + 1;
            student.setRate(value);
        }

    }


    @Override
    public String toString() {
        return "                  In university study :\n" +
                studentList +
                ",\nBLACKList = " + blackList;
    }
}









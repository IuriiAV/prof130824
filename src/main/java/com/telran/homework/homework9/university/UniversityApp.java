package com.telran.homework.homework9.university;

public class UniversityApp {

    public static void main(String[] args) {
        StudentList studentList = new StudentList();

        // print all students
        studentList.printStudents();

        // add new student
        Student student = new Student("Albert", "Camus");
        studentList.add(student.getId(), student);

        // get student by id
        System.out.println(studentList.get(student.getId()));

        // rename student
        Student studentWithNewLastName = studentList.changeLastName(student.getId(), "Einstein");
        System.out.println(studentWithNewLastName);
    }
}

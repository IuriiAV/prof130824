package com.telran.homework.homework3;

import java.util.ArrayList;
import java.util.List;

public class UniApp {
    //create Uni with 10 students
    //print all students
    //add 3 students (1 duplicate)
    //print all students(12 students)
    //remove 2 students
    //print all students(10)
    //print black list students(2)
    //upgrade rate
    //print all students(10)

    public static void main(String[] args) {

        University university = new University(new ArrayList<>(), new ArrayList<>());

        university.generateStudents();
        System.out.println("Все студенты после генерации: ");
        printStudents(university.getStudents());

        Student newStudent1 = new Student("Иван Иванов", 20, 3, new ArrayList<>());
        Student newStudent2 = new Student("Мария Петрова", 21, 2, new ArrayList<>());
        Student duplicateStudent = new Student("Студент1", 18, 1, new ArrayList<>());

        university.addStudent(newStudent1);
        university.addStudent(newStudent2);
        university.addStudent(duplicateStudent);

        System.out.println("Все студенты после добавления 3 студентов:");
        printStudents(university.getStudents());

        university.removeStudent("Студент3");
        university.removeStudent("Студент5");

        System.out.println("Все студенты после удаления двух студентов:");
        printStudents(university.getStudents());

        System.out.println("Студенты в черном списке:");
        printStudents(university.getBlackList());

        university.upgradeRate();
        System.out.println("Все студенты после повышения рейтинга:");
        printStudents(university.getStudents());
    }

    public static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
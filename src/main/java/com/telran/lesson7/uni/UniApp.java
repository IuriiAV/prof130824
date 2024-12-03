package com.telran.lesson7.uni;

public class UniApp {

    public static void main(String[] args) {
        University university = new University();
        university.generateTenStudents();
        System.out.println("Ten students:\n" + university.getStudents());
        System.out.println();

        Student student11 = new Student("John", 33, 4);
        Student student12 = new Student("Sarah", 23, 3);
        Student student13 = new Student("Sarah", 23, 3); // duplicated student

        university.addStudent(student11);
        university.addStudent(student12);
        university.addStudent(student13); //////////////////////////// add the same student twice
        System.out.println("Add two students:\n" + university.getStudents());
        System.out.println();

        university.removeStudent(student11);
        university.removeStudent(student12);
        university.removeStudent(student12); //////////////////////////// delete the same student twice
        System.out.println("Remove two students:\n" + university.getStudents());
        System.out.println();
        university.addStudent(student11); //////////////////////////// trying to add student from the black list

        System.out.println("Black list:\n" + university.getBlackList());
        System.out.println();

        university.upRate();
        System.out.println("All students:\n" + university.getStudents());
        System.out.println();
    }
    //create Uni with 10 students
    //print all students
    //add 3 students (1 duplicate)
    //print all students(12 students)
    //remove 2 students
    //print all students(10)
    //print black list students(2)
    //upgrade rate
    //print all students(10)
}

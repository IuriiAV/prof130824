package com.telran.lesson7.uni;

import java.util.Arrays;

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
        University university = new University();
        university.generate();
        university.printStudents();
        university.addStudent(new Student("Ivan", 8,1, Arrays.asList(new PhoneNumber("89", "45"))));
        university.addStudent(new Student("Maria", 8,1, Arrays.asList(new PhoneNumber("89", "45"))));
        university.addStudent(new Student("Stepan", 90,7, Arrays.asList(new PhoneNumber("78", "49"))));
        university.printStudents();
        university.removeStudents(Arrays.asList(new Student("Olga", 45, 1, Arrays.asList(new PhoneNumber("10", "769"))), new Student("Aleksey", 20, 1, Arrays.asList(new PhoneNumber("10", "709")))));
        university.printStudents();
        university.printBlackListStudents();
        university.upRate();
        university.printStudents();
    }
}

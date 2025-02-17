package com.telran.homework9.students;

public class Main {
    public static void main(String[] args) {

        StudentsApp studentsApp = new StudentsApp();
        studentsApp.addStudent(new Student("17", "Maria"));
        studentsApp.addStudent(new Student("10", "Olga"));
        studentsApp.addStudent(new Student("2", "Irina"));
        studentsApp.addStudent(new Student("56", "Lena"));
        studentsApp.addStudent(new Student("4", "Marina"));
        studentsApp.addStudent(new Student("45", "Olena"));
        studentsApp.addStudent(new Student("67", "Nadia"));
        studentsApp.addStudent(new Student("18", "Alexandra"));
        studentsApp.addStudent(new Student("49", "Vlada"));
        studentsApp.addStudent(new Student("12", "Rada"));

        System.out.println(studentsApp.getStudentById("17"));
        studentsApp.changeName("45", "Rada");

        System.out.println();

        studentsApp.printStudents();
    }
}

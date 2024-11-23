package com.telran.h3.uni;

import java.util.ArrayList;
import java.util.List;

public class UniApp {
    /**
     *
     *
     *
     *     //create Uni with 10 students
     *     //print all students
     *     //add 3 students (1 duplicate)
     *     //print all students(12 students)
     *     //remove 2 students
     *     //print all students(10)
     *     //print black list students(2)
     *     //upgrade rate
     *     //print all students(10)
     *
     *
     *
     *
     *
     */
    public static void main(String[] args) {


        University university = new University();

        university.generateTenStudent();

        university.printAllStudents();

        List<Phone> listPhonesIgor = new ArrayList<>();
        Student igor = new Student("Igor", 40, 4, listPhonesIgor);
        listPhonesIgor.add(new Phone("+380", "03699135"));
        listPhonesIgor.add(new Phone("+490", "45643165"));

        List<Phone> listPhonesAndrey = new ArrayList<>();
        Student andrey = new Student("Andrey", 21, 3, listPhonesAndrey);
        listPhonesAndrey.add(new Phone("+380", "03699135"));
        listPhonesAndrey.add(new Phone("+490", "45643165"));

        List<Phone> listPhones10 = new ArrayList<>();
        Student Student10 = new Student("Student10", 28, 10, listPhones10);
        listPhones10.add(new Phone("+380", "489101789"));
        listPhones10.add(new Phone("+380", "489102789"));

        university.addStudent(igor);
        university.addStudent(andrey);
        university.addStudent(Student10);
        university.printAllStudents();

        university.removeStudents(andrey);
        university.removeStudents(igor);
        university.printAllStudents();
        System.out.println();
        university.printBlackList();

        university.upgradeRate(university.getStudentList());

        university.printAllStudents();



    }
}

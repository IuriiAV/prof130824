package com.telran.lesson7.uni;

import java.util.ArrayList;

import java.util.List;

/**
 * variables
 * list students
 * black list students
 * //methods
 * *     //generate 10 students on start
 * *     //add student in uni, and check duplicate
 * *     //remove students from uni and add to black list
 * *     //up rate for all students (+1)
 */


public class University {

    private List<Student> studentList = new ArrayList<>();

    private List<Student> blackList = new ArrayList<>();

    public University() {
    }

    public List<Student> generateTenStudent() {

        List<Phone> listPhonesKost = new ArrayList<>();
        Student Kost = new Student("Kostya", 35, 1, listPhonesKost);
        listPhonesKost.add(new Phone("+380", "369878"));
        listPhonesKost.add(new Phone("+490", "258741"));
        studentList.add(Kost);

        List<Phone> listPhonesOlga = new ArrayList<>();
        Student Olga = new Student("Olga", 35, 2, listPhonesOlga);
        listPhonesOlga.add(new Phone("+380", "548955"));
        listPhonesOlga.add(new Phone("+490", "194999"));
        studentList.add(Olga);

        List<Phone> listPhonesMax = new ArrayList<>();
        Student max = new Student("Max", 35, 2, listPhonesMax);
        listPhonesMax.add(new Phone("+380", "323878"));
        listPhonesMax.add(new Phone("+490", "259741"));
        studentList.add(max);

        List<Phone> listPhonesGena = new ArrayList<>();
        Student gena = new Student("Gena", 35, 2, listPhonesGena);
        listPhonesGena.add(new Phone("+380", "5479135"));
        listPhonesGena.add(new Phone("+490", "45643165"));
        studentList.add(gena);

        List<Phone> listPhonesOleg = new ArrayList<>();
        Student oleg = new Student("Oleg", 37, 4, listPhonesOleg);
        listPhonesOleg.add(new Phone("+380", "03699135"));
        listPhonesOleg.add(new Phone("+490", "45643165"));
        studentList.add(oleg);

        return studentList;
    }

    public  void printAllStudents(){
        System.out.println(studentList);
    }


    @Override
    public String toString() {
        return "                  In university study :\n" +
                studentList +
                ",\nBLACKList = " + blackList;
    }
}









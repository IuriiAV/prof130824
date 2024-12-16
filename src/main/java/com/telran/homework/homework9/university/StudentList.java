package com.telran.homework.homework9.university;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public class StudentList {

    @Getter
    private Map<Integer, Student> studentMap = new HashMap<>();

    public StudentList() {
        init();
    }

    public void init() {
        Student student1 = new Student("John", "Lil");
        Student student2 = new Student("Hillary", "Clinton");
        Student student3 = new Student("Barak", "Obama");
        Student student4 = new Student("Donald", "Tramp");
        Student student5 = new Student("Gorge", "Washington");
        Student student6 = new Student("Joh", "Fiery");
        Student student7 = new Student("Nikolas", "Cage");
        Student student8 = new Student("Keanu", "Reeves");
        Student student9 = new Student("Milla", "Dave");
        Student student10 = new Student("Rebecca", "Hodges");

        studentMap.put(student1.getId(), student1);
        studentMap.put(student2.getId(), student2);
        studentMap.put(student3.getId(), student3);
        studentMap.put(student4.getId(), student4);
        studentMap.put(student5.getId(), student5);
        studentMap.put(student6.getId(), student6);
        studentMap.put(student7.getId(), student7);
        studentMap.put(student8.getId(), student8);
        studentMap.put(student9.getId(), student9);
        studentMap.put(student10.getId(), student10);
    }

    public void printStudents() {
        studentMap.forEach((id, student) -> System.out.println(student));
        System.out.println();
    }

    public void add(int id, Student student) {
        studentMap.put(id, student);
    }

    public Student get(int id) {
        return studentMap.get(id);
    }

    public Student changeLastName(int id, String newLastName) {
        Student student = studentMap.get(id);
        student.setLastName(newLastName);
        return student;
    }
}

package com.telran.homework9.Students;

import java.util.HashMap;
import java.util.Map;

/**
 * Используя хеш мап, написать мини приложение по работе со студентами в университете,
 * нужно хранить 10 студентов,
 * получать студента по айди,
 * добавлять студента,
 * выводить список студентов
 * и !! исправлять фамилию выбранного студента
 * (подсказка, в качестве ключа используйте айди студента)
 */
public class UniApp {

    public static void main(String[] args) {
        Map<Integer, Student> students = new HashMap<>();
        Student student1 = new Student(1, "Alex", "Alexandrov");
        Student student2 = new Student(2, "Ivan", "Ivanov");
        Student student3 = new Student(3, "Vasil", "Vasiliev");
        Student student4 = new Student(4, "Elena", "Elenskaya");
        Student student5 = new Student(5, "Max", "Maximov");
        Student student6 = new Student(6, "Igor", "Igorevski");
        Student student7 = new Student(7, "Petr", "Petrov");
        Student student8 = new Student(8, "Alla", "Allevskaya");
        Student student9 = new Student(9, "Olga", "Olesheva");
        Student student10 = new Student(10, "Inna", "Inochkina");

        University university = new University();
        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);
        university.addStudent(student4);
        university.addStudent(student5);
        university.addStudent(student6);
        university.addStudent(student7);
        university.addStudent(student8);
        university.addStudent(student9);
        university.addStudent(student10);

        System.out.println("The list of Students: " + university.findAllStudents());
        System.out.println("The student with id 9: " + university.findStudent(9).getLastName());
        university.updateLastName(9, "Maximova");
        System.out.println("The new lastname for student with id 9 is: " + university.findStudent(9).getLastName());
    }
}

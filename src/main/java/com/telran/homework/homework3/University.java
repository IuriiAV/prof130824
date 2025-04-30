package com.telran.homework.homework3;

import java.util.ArrayList;
import java.util.List;

public class University {
    // variables
    // list students
    // black list students

    //methods
    //generate 10 students on start
    //add student in uni, and check duplicate
    //remove students from uni and add to black list
    //up rate for all students (+1)

    List<Student> students = new ArrayList<>();
    List<Student> blackList = new ArrayList<>();

    public University(List<Student> students, List<Student> blackList) {
        this.students = students;
        this.blackList = blackList;
    }

    public void generateStudents() {
        for (int i = 1; i <= 10; i++) {
            // Создаем уникальные данные для каждого студента
            String name = "Студент" + i;
            int age = 18 + (i % 5); // Например, возраст от 18 до 22 лет
            int rate = i % 4; // Рейтинг, например, от 0 до 3

            // Генерация номеров телефонов
            List<PhoneNumber> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(new PhoneNumber("+7", "123456789" + i));

            // Создаем нового студента
            Student student = new Student(name, age, rate, phoneNumbers);

            // Добавляем студента в список
            students.add(student);
        }
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        } else {
            System.out.println("Студент " + student.getName() + " уже добавлен.");
        }
    }

    public void removeStudent(String studentName) {
        Student foundStudent = null;
        // Ищем студента по имени в списке студентов
        for (Student student : students) {
            if (student.getName().equals(studentName)) {
                foundStudent = student;
                break;
            }
        }
        // Если студент найден, удаляем его из списка и добавляем в чёрный список
        if (foundStudent != null) {
            students.remove(foundStudent);
            blackList.add(foundStudent);
            System.out.println("Студент " + studentName + " был удалён и добавлен в чёрный список.");
        } else {
            System.out.println("Студент с именем " + studentName + " не найден.");
        }
    }

    public void upgradeRate() {
        for (Student student : students) {
            student.setRate(student.getRate() + 1);
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getBlackList() {
        return blackList;
    }

    public void setBlackList(List<Student> blackList) {
        this.blackList = blackList;
    }
}

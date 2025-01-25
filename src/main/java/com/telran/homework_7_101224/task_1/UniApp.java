package com.telran.homework_7_101224.task_1;

import java.util.HashMap;
import java.util.Map;

public class UniApp {

    private static Map<String, Student> studentMap = new HashMap<>();

    // Метод для добавления студента
    public static void addStudent(Student student) {
        studentMap.put(student.getId(), student);
    }

    // Метод для получения студента по ID
    public static Student getStudentById(String id) {
        return studentMap.get(id);
    }

    // Метод для вывода списка студентов
    public static void printStudents() {
        for (Student student : studentMap.values()) {
            System.out.println("ID студента: " + student.getId() + ", Имя и фамилия: "
                    + student.getFirstName() + " " + student.getLastName());
        }
    }

    // Метод для обновления фамилии студента
    public static void updateLastName(String id, String newLastName) {
        Student student = studentMap.get(id);
        if (student != null) {
            student.setLastName(newLastName);
        } else {
            System.out.println("Студент с таким ID не найден");
        }
    }

    public static void main(String[] args) {

        // Создаём студентов
        Student student1 = new Student("1", "Иван", "Иванов");
        Student student2 = new Student("2", "Пётр", "Петров");
        Student student3 = new Student("3", "Василий", "Васильев");
        Student student4 = new Student("4", "Максим", "Максимов");
        Student student5 = new Student("5", "Александр", "Сашин");
        Student student6 = new Student("6", "Пётр", "Зайцев");
        Student student7 = new Student("7", "Ольга", "Самойлова");
        Student student8 = new Student("8", "Анфиса", "Чехова");
        Student student9 = new Student("9", "Николай", "Ветров");
        Student student10 = new Student("10", "Петр", "Иванов");

        // Добавляем студентов
        addStudent(student1);
        addStudent(student2);
        addStudent(student3);
        addStudent(student4);
        addStudent(student5);
        addStudent(student6);
        addStudent(student7);
        addStudent(student8);
        addStudent(student9);
        addStudent(student10);

        // Печатаем список студентов
        System.out.println("Список студентов:");
        printStudents();

        // Обновляем фамилию студента с ID 1
        System.out.println("Обновление фамилии студента с ID 1:");
        updateLastName("1", "Сидоров");

        // Печатаем обновлённый список студентов
        System.out.println("Обновлённый список студентов:");
        printStudents();
    }
}

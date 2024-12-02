package com.telran.myLesson7.uni;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class University {
    //variables:
    //list of students
    //black list

    //methods:
    //generate 10 students on start (при создании обьекта)
    //add a student in uni, and check that there's no student with the same name and age
    //remove students from uni and add him to black list
    //up rate for all students (+1)

    private final List<Student> students = new ArrayList<>();

    private final List<Student> blackList = new ArrayList<>();

    public University() {
        this(
                List.of(
                        new Student("Peter", 21),
                        new Student("Nana", 19),
                        new Student("Juju", 22),
                        new Student("Max", 19),
                        new Student("Claus", 21),
                        new Student("Mimi", 21),
                        new Student("Alex", 19),
                        new Student("TJ", 22),
                        new Student("Sara", 19),
                        new Student("Petra", 21)
                )
        );
    }

    public University(List<Student> students) {
        if (students != null) {
            this.students.addAll(students);
        }
    }

    public void addStudent(Student student) {
        if (students.contains(student)) {
            System.out.println("Such a student is already studying at the university.");
        } else {
            students.add(student);
        }
    }

    public void addToBlackListStudent(String name, int age) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getName().equals(name) && student.getAge() == age) {
                this.blackList.add(student);
                iterator.remove();
            }
        }
    }

    public void upRateForStudents() {
        for (Student student : students) {
            student.setRate(student.getRate() + 1);
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Student> getBlackList() {
        return blackList;
    }

    @Override
    public String toString() {
        return "University{" +
                "students=" + students +
                ", blackList=" + blackList +
                '}';
    }
}

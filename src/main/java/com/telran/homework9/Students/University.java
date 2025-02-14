package com.telran.homework9.Students;

import java.util.*;

public class University {

    private final Map<Integer, Student> storage = new HashMap<>();

    public void addStudent(Student student) {
        storage.put(student.getId(), student);
    }

    public Student findStudent(int id) {
        return storage.get(id);
    }

    public void updateLastName(int id, String newName){
        storage.get(id).setLastName(newName);
    }

    public Collection<Student> findAllStudents(){
        return storage.values();
    }
}

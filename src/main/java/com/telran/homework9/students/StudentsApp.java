package com.telran.homework9.students;

import com.telran.homework9.students.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentsApp {
    private Map<String, Student> map = new HashMap<>();

    public StudentsApp() {
    }
    public void addStudent(Student student){
        map.put(student.getId(), student);
    }

    public Student getStudentById(String id){
        return map.get(id);
    }

    public void printStudents(){
        for (Student student: map.values()) {
            System.out.println(student);
        }
    }

    public void changeName(String id, String name){
        if (map.containsKey(id)){
            map.get(id).setName(name);
        }
    }
}

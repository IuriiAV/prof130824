package com.telran.lesson20.example;

public class StudentConverter implements Converter<StudentDto, Student>{

    @Override
    public StudentDto toDto(Student student) {
        return null;
    }

    @Override
    public Student toEntity(StudentDto studentDto) {
        return null;
    }
}

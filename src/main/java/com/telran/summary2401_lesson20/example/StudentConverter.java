package com.telran.summary2401_lesson20.example;

public class StudentConverter implements Converter<StudentDto,Student> {


    @Override
    public StudentDto eoDto(Student student) {
        return null;
    }

    @Override
    public Student toEntity(StudentDto studentDto) {
        return null;
    }
}

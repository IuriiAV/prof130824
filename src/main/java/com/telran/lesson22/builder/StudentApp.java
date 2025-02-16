package com.telran.lesson22.builder;

import com.telran.lesson22.dryyagnikiss.Book;

public class StudentApp {

    public static void main(String[] args) {
        //name, surname
        Student student = Student.newBuilder()
                .name("Alex")
                .surname("Alexeev")
                .build();

        Student student1 = Student.newBuilder()
                .name("Oleg")
                .email("eeee@ddd.com")
                .surname("Olegov")
                .build();

        Student.Builder egor = Student.newBuilder()
                .name("Egor");

    }
}

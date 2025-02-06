package com.telran.myLesson22.builder;

import com.telran.summery0612.library.Book;

public class StudentApp {

    public static void main(String[] args) {

        Student.newBuilder()
                .addName("Alex")
                .addSurname("Alexeev")
                .addEmail("sss@ss.ss")
                .build();

        BookLombokExample.builder()
                .title("Oak")
                .author("JB")
                .pages(321)
                .build();
    }
    
}

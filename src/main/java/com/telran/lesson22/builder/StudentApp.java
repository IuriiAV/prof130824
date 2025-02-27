package com.telran.lesson22.builder;

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

            Book book = Book.builder()
                    .author("Duma")
                    .isbn("42342545345-34534")
                    .title("Haha")
                    .build();
            System.out.println(book);
        }
    }
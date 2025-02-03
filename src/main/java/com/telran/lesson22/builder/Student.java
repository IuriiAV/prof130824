package com.telran.lesson22.builder;

public class Student {

    private String name;

    private String surname;

    private int age;

    private String email;

    private String address;

    private String rate;

    private long id;

    private String phone;

    public Student() {
        //
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {

        private Student student = new Student();

        public Builder name(String name) {
            student.name = name;
            return this;
        }

        public Builder surname(String name) {
            student.surname = name;
            return this;
        }

        public Builder email(String email) {
            student.email = email;
            return this;
        }

        public Student build() {
            return student;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", rate='" + rate + '\'' +
                ", id=" + id +
                ", phone='" + phone + '\'' +
                '}';
    }
}
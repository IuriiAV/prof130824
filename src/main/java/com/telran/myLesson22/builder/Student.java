package com.telran.myLesson22.builder;

public class Student {

    private String name;

    private String surname;

    private int age;

    private String email;

    private String address;

    private String rating;

    private long id;

    public Student() {

    }

    public Student(String name, String surname, int age, String email, String address, String rating, long id) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.address = address;
        this.rating = rating;
        this.id = id;
    }

    public static Builder newBuilder(){
        return newBuilder();
    }

    public static class Builder {

        private Student student = new Student();

//        public Builder newBuilder() {
//            student = new Student();
//            return this;
//        }

        public Builder addName(String name){
            student.name = name;
            return this;
        }

        public Builder addSurname(String surname){
            student.surname = surname;
            return this;
        }

        public Builder addEmail(String email){
            student.email = email;
            return this;
        }

        public Student build(){
            return student;
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "student=" + student +
                    '}';
        }
    }
}

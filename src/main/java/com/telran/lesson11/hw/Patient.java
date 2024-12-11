package com.telran.lesson11.hw;

public class Patient implements Comparable<Patient> {

    private String name;

    private int age;

    private int status;

    public Patient(String name, int age, int status) {
        this.name = name;
        this.age = age;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getStatus() {
        return status;
    }

    @Override
    public int compareTo(Patient o) {
        int result = o.age - this.age;
        return result == 0 ? this.status - o.status : result;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                        ", age=" + age +
                        ", status=" + status +
                        '\n';
    }
}

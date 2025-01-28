package com.telran.myLesson20.example;

public class TestTwo<T,U> {

    private T obj1;

    private U obj2;

    private String title;

    public TestTwo(T obj1, U obj2, String title) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.title = title;
    }

    @Override
    public String toString() {
        return "TestTwo{" +
                "obj1=" + obj1 +
                ", obj2=" + obj2 +
                ", title='" + title + '\'' +
                '}';
    }
}

package com.telran.lesson20;

public class Test<T> {

    private T obj;

    public Test(T obj) {
        this.obj = obj;
    }

    public Test() {

    }

    public T getObj() {
        return obj;
    }
}

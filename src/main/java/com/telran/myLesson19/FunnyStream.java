package com.telran.myLesson19;

public class FunnyStream implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("ha-ha bye");
    }
}

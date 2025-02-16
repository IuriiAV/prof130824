package com.telran.lesson19;

public class FunnyStream implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Ha ha bye))");
    }
}

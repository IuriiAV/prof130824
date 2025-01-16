package com.telran.lesson19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CustomFileInputStream extends FileInputStream {
    public CustomFileInputStream(String name) throws FileNotFoundException{
        super(name);

    }

    @Override
    public int read() throws IOException {
        throw new IOException("Haaa");
    }
}

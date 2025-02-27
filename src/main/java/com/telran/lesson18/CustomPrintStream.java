package com.telran.lesson18;

import java.io.*;

public class CustomPrintStream extends PrintStream {

    private String path = "D:\\Starta\\Java\\prof130824\\src\\main\\java\\com\\telran\\lesson18\\one.txt";
    private FileOutputStream fileOutputStream = new FileOutputStream(path);

    public CustomPrintStream(OutputStream out) throws FileNotFoundException {
        super(out);
    }

    @Override
    public void write(byte[] buf, int off, int len) {
        super.write(buf, off, len);
        try {
            fileOutputStream.write(buf,off,len);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
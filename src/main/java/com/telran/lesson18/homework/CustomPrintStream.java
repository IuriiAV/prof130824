package com.telran.lesson18.homework;

import java.io.OutputStream;
import java.io.PrintStream;

public class CustomPrintStream extends PrintStream {

    public CustomPrintStream(OutputStream out) {
        super(out);
    }

    @Override
    public void write(byte[] buf, int off, int len) {
        int end = len - 1;
        for (int i = 0; i < len / 2; i++) {
            byte a = buf[i];
            buf[i] = buf[end];
            buf[end--] = a;
        }
        super.write(buf, off, len);
    }
}

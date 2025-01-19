package com.telran.homework10;

import java.io.OutputStream;
import java.io.PrintStream;

public class CustomPrintStream extends PrintStream {
    public CustomPrintStream(OutputStream out) {
        super(out, true);
    }

    @Override
    public void write(byte[] buf, int off, int len) {
        byte[] reverse = new byte[len];
        for (int i = 0; i < len; i++) {
            reverse[i] = buf[len - 1 - i];
        }
        super.write(reverse, 0, len);
    }
}

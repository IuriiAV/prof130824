package com.telran.h9;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;

public class CustomPrintStream extends PrintStream {

    public CustomPrintStream(OutputStream out) {
        super(out);
    }

    @Override
    public void write(byte[] buf, int off, int len) {
        Arrays.toString(buf).
        super.write(buf, off, len);
    }
}

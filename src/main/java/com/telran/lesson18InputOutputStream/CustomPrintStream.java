package com.telran.lesson18InputOutputStream;

import java.io.OutputStream;
import java.io.PrintStream;

public class CustomPrintStream extends PrintStream {
    public CustomPrintStream(OutputStream out) {
        super(out);
    }

}

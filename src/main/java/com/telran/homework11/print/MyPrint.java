package com.telran.homework11.print;

import java.io.OutputStream;
import java.io.PrintStream;

public class MyPrint extends PrintStream {
    public MyPrint(OutputStream out) {
        super(out, true);
    }

    @Override
    public void write(byte[] buf, int off, int len  ) {
        byte[] reverse = new byte[len];
        for (int i = 0; i < len ; i++) {
            reverse[i] = buf[len -1 -i];
        }
        super.write(reverse, 0, len);
    }

}


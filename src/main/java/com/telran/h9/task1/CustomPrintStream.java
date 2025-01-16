package com.telran.h9.task1;

import java.io.OutputStream;
import java.io.PrintStream;

public class CustomPrintStream extends PrintStream {

    public CustomPrintStream(OutputStream out) {
        super(out);
    }

    @Override
    public void write(byte[] buf, int off, int len) {
        byte[] arrCopy = new byte[len];
        System.arraycopy(buf, off, arrCopy, 0, len);
        swap(arrCopy);
        super.write(arrCopy, off, len);
    }

    private static void swap(byte[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            byte temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

}

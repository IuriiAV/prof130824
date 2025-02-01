package com.telran.lesson18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Arrays;

/**
 * InputStream - для чтения набора байт
 * OutputStream - для записи набора байт
 * <p>
 * Reader - для чтения символов
 * Writer - для записи символов
 *
 * FileInputStream
 * FileOutputStream
 * FileReader
 * FileWriter
 *
 * InputStreamReader - конвертер байтов в символы
 * OutputStreamWriter
 *
 */
public class FileExample {

    public static void main(String[] args) throws Exception {
        // InputStream - read, available
        // OutputStream - write

        String path = "/Users/iurii/Downloads/pro130824/src/main/java/com/telran/lesson18/test.txt";

        FileInputStream fileInputStream = new FileInputStream(path);
        //StringBuilder sb = new StringBuilder();
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            //sb.append((char) data);
            System.out.print(" " + data);
        }
        fileInputStream.close();
        //System.out.println(sb);

        String pathOut = "/Users/iurii/Downloads/pro130824/src/main/java/com/telran/lesson18/test2.txt";
        String example = "Привет Привет";
        FileOutputStream fileOutputStream = new FileOutputStream(pathOut);
        for(int i = 0; i < example.length(); i++) {
            char temp = example.charAt(i);
            fileOutputStream.write(temp);
        }
        fileOutputStream.close();
    }
}

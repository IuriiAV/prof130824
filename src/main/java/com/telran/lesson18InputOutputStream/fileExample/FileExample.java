package com.telran.lesson18InputOutputStream.fileExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileExample {

    public static void main(String[] args) throws Exception {
        // InputStream - read(), available() - чтение из файла
        // OutputStream - write()

        String path = "/Users/jmabra/Projects/Tel-Ran/Tel-Ran-JavaPro-Lessons/prof130824/src/main/java/com/telran/lesson18InputOutputStream/fileExample/test.txt";

        FileInputStream fileInputStream = new FileInputStream(path);
        StringBuilder sb = new StringBuilder();
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            sb.append((char) data);
        }
        fileInputStream.close();
        System.out.println(sb);

        String pathOut = "/Users/jmabra/Projects/Tel-Ran/Tel-Ran-JavaPro-Lessons/prof130824/src/main/java/com/telran/lesson18InputOutputStream/fileExample/test2.txt";
        String example = "Java Java";
        //кирилица - каждый символ 2 байта (для кириллицы такой способ не подойдет, использоваьт FileReader)
        FileOutputStream fileOutputStream = new FileOutputStream(pathOut);
        for (int i = 0; i < example.length(); i++) {
            char temp = example.charAt(i);
            fileOutputStream.write(temp);
        }
        fileOutputStream.close();
    }
}

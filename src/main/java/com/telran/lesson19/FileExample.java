package com.telran.lesson19;

import java.io.File;
import java.util.Arrays;

public class FileExample {

    public static void main(String[] args) {
        String path = "/Users/iurii/Downloads/pro130824/src/main/java/com/telran/lesson19";
        File file = new File(path);
        System.out.println("File exists ? " + file.exists());
        System.out.println("Is directory? " + file.isDirectory());
        System.out.println("Length = " + file.length());
        System.out.println("Name " + file.getName());
        System.out.println("Path " + file.getAbsolutePath());

        String[] fileNames = file.list();
        System.out.println(Arrays.toString(fileNames));

        File[] files = file.listFiles();
        for(File someFile : files) {
            System.out.println(someFile.getName());
        }
    }
}

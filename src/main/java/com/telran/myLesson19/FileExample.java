package com.telran.myLesson19;

import java.io.File;
import java.util.Arrays;

public class FileExample {

    public static void main(String[] args) {
        String path = "/Users/jmabra/Projects/Tel-Ran/Tel-Ran-JavaPro-Lessons/prof130824/src/main/java/com/telran/myLesson19/";
        File file = new File(path);
        System.out.println("File exist? " + file.exists());
        System.out.println("Is directory? " + file.isDirectory());
        System.out.println("Length is " + file.length());
        System.out.println("Name " + file.getName());
        System.out.println("Path " + file.getPath());
        System.out.println("Absolute Path " + file.getAbsolutePath());
        //список файлов в директории

        String[] list = file.list();
        System.out.println(Arrays.toString(list));

        File[] files = file.listFiles();
        for (File someFile : files) {
            System.out.println(someFile.getName());
        }
    }
}

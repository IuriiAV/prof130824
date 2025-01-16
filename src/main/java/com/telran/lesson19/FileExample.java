package com.telran.lesson19;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileExample {

    public static void main(String[] args) {

        String path = "C:\\IT\\JAVA PRO\\Lesson\\src\\main\\java\\com\\telran\\lesson19\\test.txt";
//        File file = new File(path);
//        System.out.println("File exist ? " + file.isFile());
//        System.out.println("IS directory ? " + file.isDirectory());
//        System.out.println("Length =" + file.length());
//        System.out.println(file.getName());


        //nio
        List<String> list = null;
        Path path1 = Paths.get(path);
        try {
            list = Files.readAllLines(path1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(list);



    }
}

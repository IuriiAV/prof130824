package com.telran.h9.task2;

import java.io.File;
import java.nio.file.Files;
import java.util.Arrays;

/**
 * 2) Написать программу для копирования файлов из одной директории в другую
 * На вход метода подается путь к директории с файлами и путь к пустой директории
 * результат - полная копия файлов в директории, включая содержимое и название
 */
public class Task2 {

    public static void main(String[] args) {

        String dirPath = "C:\\IT\\JAVA PRO\\Lesson\\src\\main\\java\\com\\telran\\h9\\task2\\resource";
        String dirPathNew = "C:\\IT\\JAVA PRO\\Lesson\\src\\main\\java\\com\\telran\\h9\\task2\\resourceNew";

        copyDirectoryFile(dirPath, dirPathNew);
    }

    private static void copyDirectoryFile(String dirPath, String dirPathNew) {
        File fileWithPath = new File(dirPath);
        File[] allFiles = fileWithPath.listFiles();

        File[] copy = new File[allFiles.length];
        System.arraycopy(allFiles,0,copy,0,allFiles.length);
        System.out.println(Arrays.toString(copy));

        for (int i = 0; i < copy.length; i++) {
            Files.c
        }

    }
}

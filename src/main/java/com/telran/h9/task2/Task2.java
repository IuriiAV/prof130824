package com.telran.h9.task2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

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

        assert allFiles != null;
        for (File allFile : allFiles) {
            Path pathOld = Paths.get(dirPath, allFile.getName());
            Path pathNew = Paths.get(dirPathNew, allFile.getName());
            try {
                Files.copy(pathOld, pathNew, StandardCopyOption.REPLACE_EXISTING);

            } catch (IOException e) {
                e.getStackTrace();
            }
        }
        System.out.println("The files were successfully copied to the directory " + dirPathNew);

    }
}

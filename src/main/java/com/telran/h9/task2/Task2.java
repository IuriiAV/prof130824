package com.telran.h9.task2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
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
        System.out.println(Arrays.toString(allFiles));

        for (int i = 0; i < allFiles.length; i++) {
            Path pathOld = Paths.get(dirPath);
            Path pathNew = Paths.get(dirPathNew);
            try {
                Files.copy(pathOld,pathNew, StandardCopyOption.REPLACE_EXISTING);

            } catch (IOException e) {
                e.getStackTrace();
            }
        }
        System.out.println("Файлы успешно скопированы!");

    }
}































//   private static void copyDirectoryFile(String sourceDir, String targetDir) {
//        File sourceFolder = new File(sourceDir);
//        File targetFolder = new File(targetDir);
//
//        if (!sourceFolder.exists()) {
//            System.out.println("Источник не найден: " + sourceDir);
//            return;
//        }
//
//        if (!targetFolder.exists()) {
//            targetFolder.mkdirs(); // Создать целевую папку, если она не существует
//        }
//
//        File[] files = sourceFolder.listFiles();
//        if (files != null) {
//            for (File file : files) {
//                Path sourcePath = file.toPath();
//                Path targetPath = Paths.get(targetFolder.getPath(), file.getName());
//                try {
//                    if (file.isDirectory()) {
//                        copyDirectoryFile(file.getAbsolutePath(), targetPath.toString());  // Рекурсивный вызов для папок
//                    } else {
//                        Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
//                    }
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        System.out.println("Файлы успешно скопированы!");
//    }

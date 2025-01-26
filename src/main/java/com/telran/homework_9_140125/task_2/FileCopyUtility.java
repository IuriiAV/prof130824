package com.telran.homework_9_140125.task_2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileCopyUtility {

    public static void copyDirectory(File sourceDir, File targetDir) {
        // Проверяем, что исходная и целевая директория не одинаковые
        if (sourceDir.getAbsolutePath().equals(targetDir.getAbsolutePath())) {
            System.out.println("Ошибка: исходная и целевая папки не могут быть одинаковыми.");
            return;
        }

        boolean isCopied = false; // Флаг успешного копирования хотя бы одного файла

        try {
            // Если целевая директория не существует, создаём её
            if (!targetDir.exists()) {
                targetDir.mkdirs();
            }

            // Получаем список файлов в исходной папке
            File[] files = sourceDir.listFiles();
            if (files != null) {
                for (File file : files) {
                    File targetFile = new File(targetDir, file.getName());
                    if (file.isDirectory()) {
                        // Если это папка, рекурсивно копируем её
                        copyDirectory(file, targetFile);
                    } else {
                        // Если это файл, копируем его
                        Files.copy(file.toPath(), targetFile.toPath());
                        isCopied = true; // Устанавливаем флаг, если файл был успешно скопирован
                    }
                }
            }
        } catch (IOException e) {
            // Ловим исключение, если произошла ошибка ввода-вывода
            System.out.println("Ошибка при копировании файлов: " + e.getMessage());
        } catch (Exception e) {
            // Ловим другие исключения
            System.out.println("Произошла неожиданная ошибка: " + e.getMessage());
        }

        // Выводим сообщение о успешном копировании, если хотя бы один файл был скопирован
        if (isCopied) {
            System.out.println("Файл(ы) скопированы успешно");
        } else {
            System.out.println("Не было файлов для копирования");
        }
    }

    public static void main(String[] args) {
        // Указываем исходную и целевую директории
        File sourceDir = new File("C:\\Git\\prof130824\\src\\main\\java\\com\\telran" +
                "\\homework_9_140125\\task_2\\testDirectoryOut");
        File targetDir = new File("C:\\Git\\prof130824\\src\\main\\java\\com\\telran" +
                "\\homework_9_140125\\task_2\\testDirectoryIn");

        // Запускаем метод копирования с обработкой ошибок
        copyDirectory(sourceDir, targetDir);
    }
}

package com.telran.homeworks.homework10.task2;
/**
 * 2) Написать программу для копирования файлов из одной директории в другую
 * На вход метода подается путь к директории с файлами и путь к пустой директории
 * результат - полная копия файлов в директории, включая содержимое и название
 */

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DirectoryCopy {
    public static void main(String[] args) {
        Path sourceDir = Paths.get ("D:\\Starta\\Java\\prof130824\\src\\main\\java\\com\\telran\\homeworks\\homework10\\task2\\sourcedirectory");
        Path targetDir = Paths.get ("D:\\Starta\\Java\\prof130824\\src\\main\\java\\com\\telran\\homeworks\\homework10\\task2\\targetdirectory");

        try {

            Files.walkFileTree(sourceDir, new SimpleFileVisitor<>() {
                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {

                    Path targetPath = targetDir.resolve(sourceDir.relativize(dir));
                    Files.createDirectories(targetPath);
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

                    Path targetPath = targetDir.resolve(sourceDir.relativize(file));
                    Files.copy(file, targetPath, StandardCopyOption.REPLACE_EXISTING);
                    return FileVisitResult.CONTINUE;
                }
            });

            System.out.println("Files copied successfully!");
        } catch (IOException e) {
            System.err.println("Error occurred while copying files: " + e.getMessage());
        }
    }
}
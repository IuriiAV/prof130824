package com.telran.homework_160125.taskOne;

import java.io.*;

public class Encoder {

    public static void encodeFile(String inputFile, String outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character + " "); // Записываем код символа + пробел
            }

            System.out.println("✅ Файл успешно закодирован!");

        } catch (IOException e) {
            System.err.println("❌ Ошибка при кодировании файла: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String folderPath = "C:\\Git\\prof130824\\src\\main\\java\\com\\telran\\homework_160125\\taskOne\\resources\\";
        String inputFile = folderPath + "input.txt";
        String encodedFile = folderPath + "encoded.txt";

        encodeFile(inputFile, encodedFile);
    }
}

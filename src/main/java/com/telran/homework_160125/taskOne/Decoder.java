package com.telran.homework_160125.taskOne;

import java.io.*;

public class Decoder {

    public static void decodeFile(String inputFile, String outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String[] codes = reader.readLine().split(" "); // Разбиваем строку по пробелу
            for (String code : codes) {
                if (!code.isEmpty()) {
                    writer.write((char) Integer.parseInt(code)); // Преобразуем код обратно в символ
                }
            }

            System.out.println("✅ Файл успешно декодирован!");

        } catch (IOException | NumberFormatException e) {
            System.err.println("❌ Ошибка при декодировании файла: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String folderPath = "src/main/java/com/telran/homework_160125/taskOne/resources/";
        String encodedFile = folderPath + "encoded.txt";
        String decodedFile = folderPath + "decoded.txt";

        decodeFile(encodedFile, decodedFile);
    }
}

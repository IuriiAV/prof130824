package com.telran.homework_160125.taskOne;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EncoderDecoderTest {

    public static void main(String[] args) {
        String folderPath = "src/main/java/com/telran/homework_160125/taskOne/resources/";

        // 1️⃣ Создаём папку, если её нет
        new File(folderPath).mkdirs();

        // 2️⃣ Создаём файлы, если их нет
        String[] files = {"input.txt", "encoded.txt", "decoded.txt"};
        for (String fileName : files) {
            File file = new File(folderPath + fileName);
            try {
                if (file.createNewFile()) {
                    System.out.println("Создан файл: " + file.getAbsolutePath());
                }
            } catch (IOException e) {
                System.err.println("Ошибка при создании файла: " + fileName);
            }
        }

        // 3️⃣ Пишем тестовый текст в input.txt
        String originalText = "Hello, World! Testing Encoding and Decoding.";
        String inputFile = folderPath + "input.txt";
        String encodedFile = folderPath + "encoded.txt";
        String decodedFile = folderPath + "decoded.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))) {
            writer.write(originalText);
        } catch (IOException e) {
            System.err.println("Ошибка при записи в input.txt: " + e.getMessage());
        }

        // 4️⃣ Кодируем и декодируем
        Encoder.encodeFile(inputFile, encodedFile);
        Decoder.decodeFile(encodedFile, decodedFile);

        // 5️⃣ Проверяем совпадение
        try {
            String decodedText = Files.readString(Paths.get(decodedFile));
            if (originalText.equals(decodedText)) {
                System.out.println("✅ Тест пройден: декодированный текст совпадает с оригиналом!");
            } else {
                System.out.println("❌ Ошибка: декодированный текст НЕ совпадает с оригиналом!");
                System.out.println("Оригинал: " + originalText);
                System.out.println("Результат: " + decodedText);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении декодированного файла: " + e.getMessage());
        }
    }
}

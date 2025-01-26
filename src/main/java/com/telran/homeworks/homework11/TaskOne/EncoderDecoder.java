package com.telran.homeworks.homework11.TaskOne;
/**
 * Написать кодировщик и декодировщик
 * Считывается текстовый файл с диска - все символы заменяются на их числовые коды
 * файл с числовыми кодам и разделителями между ними записывается на диск
 * И в обратную сторону считываем файл с кодами и получаем оригинальный текст
 */

import java.io.*;

public class EncoderDecoder {


    public static void encodeFile(String inputFilePath, String outputFilePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            int character;
            while ((character = reader.read()) != -1) {

                writer.write(Integer.toString(character));
                writer.write(" ");
            }
            System.out.println("The file has been successfully encoded and saved in " + outputFilePath);
        } catch (IOException e) {
            System.err.println("Error encoding file: " + e.getMessage());
        }
    }


    public static void decodeFile(String inputFilePath, String outputFilePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] codes = line.split(" ");
                for (String code : codes) {
                    if (!code.isEmpty()) {
                        int charCode = Integer.parseInt(code);
                        writer.write((char) charCode);
                    }
                }
            }
            System.out.println("The file has been successfully decoded and saved to " + outputFilePath);
        } catch (IOException e) {
            System.err.println("Error decoding file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {


        String inputTextFile = "D:\\Starta\\Java\\prof130824\\src\\main\\java\\com\\telran\\homeworks\\homework11\\TaskOne\\input.txt";

        String encodedFile = "D:\\Starta\\Java\\prof130824\\src\\main\\java\\com\\telran\\homeworks\\homework11\\TaskOne\\encoded.txt";

        String decodedTextFile = "D:\\Starta\\Java\\prof130824\\src\\main\\java\\com\\telran\\homeworks\\homework11\\TaskOne\\decoded.txt";



        encodeFile(inputTextFile, encodedFile);


        decodeFile(encodedFile, decodedTextFile);
    }
}


package com.telran.homeworks.homework11.TaskTwo;
/**
 * Калькулятор : в текстовый файл пишем выражение - запускаем калькулятор - в другом файле получаем
 */



import java.io.*;

public class SimpleCalculator {



    public static int Math(int num1, int num2, char sign) {
        return switch (sign) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero!!!");
                }
                yield num1 / num2;
            }
            default -> throw new ArithmeticException("Something is wrong with the math sign...");
        };
    }


    public static void calculateFromFile(String inputFilePath, String outputFilePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) {
                    continue;
                }

                try {

                    String[] parts = line.split(" ");
                    if (parts.length != 3) {
                        throw new IllegalArgumentException("Incorrect expression format " + line);
                    }

                    int num1 = Integer.parseInt(parts[0]);
                    char sign = parts[1].charAt(0);
                    int num2 = Integer.parseInt(parts[2]);

                    int result = Math(num1, num2, sign);
                    writer.write("Result expression \"" + line + "\": " + result + "\n");
                } catch (IllegalArgumentException | ArithmeticException e) {
                    writer.write("Error in expression \"" + line + "\": " + e.getMessage() + "\n");
                }
            }
            System.out.println("Results has successfully written in: " + outputFilePath);

        } catch (IOException e) {
            System.err.println("Error with the files: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        String inputFile = "D:\\Starta\\Java\\prof130824\\src\\main\\java\\com\\telran\\homeworks\\homework11\\TaskTwo\\expression.txt";
        String outputFile = "D:\\Starta\\Java\\prof130824\\src\\main\\java\\com\\telran\\homeworks\\homework11\\TaskTwo\\result.txt";


        calculateFromFile(inputFile, outputFile);
    }
}

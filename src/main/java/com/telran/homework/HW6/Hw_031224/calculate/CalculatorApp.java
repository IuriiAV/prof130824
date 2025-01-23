package com.telran.homework.HW6.Hw_031224.calculate;

import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {
        // Создаём объект Scanner для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите выражение: ");
        String expression = scanner.nextLine();   // Считываем введённое выражение

        // Создаём объект калькулятора и вычисляем результат
        Calculator calculator = new Calculator();
        int result = calculator.calculate(expression);  // Вычисляем результат

        // Выводим результат
        System.out.println("Результат: " + result);

        scanner.close(); // Закрываем Scanner
    }
}

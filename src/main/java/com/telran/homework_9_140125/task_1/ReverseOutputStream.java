package com.telran.homework_9_140125.task_1;  // Указываем пакет, в котором находится этот класс.

import java.io.IOException;  // Импортируем исключение для обработки ошибок ввода-вывода.
import java.io.OutputStream;  // Импортируем класс OutputStream для перенаправления потока вывода.
import java.io.PrintStream;  // Импортируем класс PrintStream для работы с выводом в консоль.

public class ReverseOutputStream {  // Объявляем класс с именем ReverseOutputStream.

    public static void main(String[] args) {
        // Основной метод main, с которого начинается выполнение программы.

        // Выводим в консоль обычные строки (это будет происходить в обычном потоке вывода).
        System.out.println("Hello, world!");
        System.out.println("This is reversed output.");
        System.out.println("----------------");

        StringBuilder sb = new StringBuilder();  // Создаем StringBuilder, чтобы собирать вывод в строку.

        PrintStream originalOut = System.out;  // Сохраняем оригинальный поток вывода в переменную originalOut.

        // Перенаправляем стандартный поток вывода в новый поток, который будет собирать вывод в StringBuilder.
        System.setOut(new PrintStream(new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                // Переопределяем метод write, который будет срабатывать на каждый символ.
                sb.append((char) b);  // Добавляем символ в StringBuilder (b преобразуем в символ).
            }
        }));

        // Печатаем несколько строк, они теперь будут записываться в StringBuilder.
        System.out.println("Hello, world!");
        System.out.println("This is reversed output.");

        // Переворачиваем собранный текст в StringBuilder и выводим его через оригинальный поток вывода.
        String reversed = sb.reverse().toString();  // Инвертируем строку в StringBuilder и преобразуем её в строку.
        originalOut.println(reversed);  // Выводим перевёрнутую строку в консоль с помощью оригинального потока вывода.
    }
}

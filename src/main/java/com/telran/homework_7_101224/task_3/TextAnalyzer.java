package com.telran.homework_7_101224.task_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TextAnalyzer {

    public static void main(String[] args) {

        // Указываем путь к файлу с текстом
        String filePath = "C:\\Git\\prof130824\\src\\main\\java\\com\\telran\\homework_7_101224\\task_3\\File.txt";
        StringBuilder text = new StringBuilder();  // Строка для хранения всего текста

        // Чтение файла
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                text.append(line).append("\n");  // Читаем файл построчно и добавляем в StringBuilder
            }
        } catch (IOException e) {
            e.printStackTrace();  // Обработка ошибок чтения файла
        }

        // Создаем набор стоп-слов (предлогов, союзов и т.п.), которые мы будем игнорировать
        Set<String> stopWords = Set.of("и", "в", "на", "с", "по", "к", "для", "от", "за", "что", "как", "бы", "о");

        // Разделяем текст на отдельные слова
        String[] words = text.toString().split("[\\s,.;!?()\"':-]+");  // Разделяем по пробелам и знакам препинания

        // Создаем Map для подсчета частоты появления слов
        Map<String, Integer> wordCount = new HashMap<>();

        // Проходим по каждому слову и увеличиваем счетчик его вхождений, если это не стоп-слово
        for (String word : words) {
            word = word.toLowerCase();  // Приводим слово к нижнему регистру для унификации

            // Если слово не в списке стоп-слов, увеличиваем его счетчик
            if (!stopWords.contains(word)) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                // Если слово новое, ставим 1, если уже есть - увеличиваем счетчик
            }
        }

        // Переменные для хранения самого популярного слова
        String mostPopularWord = null;
        int maxCount = 0;

        // Ищем самое популярное слово (с наибольшим количеством вхождений)
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {  // Если текущее слово встречается больше
                maxCount = entry.getValue();  // Обновляем максимальное количество
                mostPopularWord = entry.getKey();  // Запоминаем слово с максимальным количеством вхождений
            }
        }

        // Выводим результат
        System.out.println("Самое встречающееся слово: " + mostPopularWord + " (попадается " + maxCount + " раз.)");
    }
}

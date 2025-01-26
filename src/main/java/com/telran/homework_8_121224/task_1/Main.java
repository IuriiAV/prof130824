package com.telran.homework_8_121224.task_1;

public class Main {

    public static void main(String[] args) {
        // Создаем новое дерево
        BSTree tree = new BSTree();  // Создаем объект дерева

        // Вставляем элементы в дерево
        tree.insert(50);  // Вставляем 50
        tree.insert(30);  // Вставляем 30
        tree.insert(70);  // Вставляем 70
        tree.insert(20);  // Вставляем 20
        tree.insert(40);  // Вставляем 40
        tree.insert(60);  // Вставляем 60
        tree.insert(80);  // Вставляем 80

        // Ищем элемент 70 в дереве
        Node result = tree.searchRec(tree.getRoot(), 70);  // Вызов метода поиска

        // Если результат не равен null, значит элемент найден
        if (result != null) {
            System.out.println("Найдено значение: " + result.getValue());  // Выводим найденное значение
        } else {
            System.out.println("Значение не найдено");  // Если элемент не найден
        }
    }
}

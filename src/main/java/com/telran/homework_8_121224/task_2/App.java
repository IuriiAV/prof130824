package com.telran.homework_8_121224.task_2;

import com.telran.homework_8_121224.task_1.BSTree;  // Импортируем класс BSTree для работы с бинарным деревом

import java.util.Random;  // Импортируем Random для генерации случайных чисел

public class App {

    public static void main(String[] args) {
        // Создаем экземпляр дерева
        BSTree tree = new BSTree();

        // Создаем объект random для генерации случайных чисел
        Random random = new Random();

        // Вставляем элементы в дерево
        tree.insert(5);  // Вставляем значение 5
        tree.insert(3);  // Вставляем значение 3
        tree.insert(7);  // Вставляем значение 7
        tree.insert(2);  // Вставляем значение 2
        tree.insert(4);  // Вставляем значение 4
        tree.insert(6);  // Вставляем значение 6
        tree.insert(8);  // Вставляем значение 8

        // Создаем еще одно дерево для случайных чисел
        BSTree treeTwo = new BSTree();

        // Генерируем 15 случайных чисел от 0 до 49 и добавляем их в дерево
        for (int i = 0; i < 15; i++) {
            treeTwo.insert(random.nextInt(50));  // random.nextInt(50) генерирует случайное число от 0 до 49
        }

        // Выводим дерево 1 снизу вверх
        System.out.println("Дерево снизу вверх: ");
        tree.printTreeBottomUp();  // Выводим дерево 1 снизу вверх

        // Выводим сумму элементов каждого уровня для дерева 1
        System.out.println("Сумма элементов дерева на каждом уровне: ");
        tree.printLevelSums();  // Выводим суммы элементов каждого уровня для дерева 1

        System.out.println("------------------");  // Разделительная линия

        // Выводим дерево 2 снизу вверх
        System.out.println("Дерево снизу вверх: ");
        treeTwo.printTreeBottomUp();  // Выводим дерево 2 снизу вверх

        // Выводим сумму элементов каждого уровня для дерева 2
        System.out.println("Сумма элементов дерева на каждом уровне: ");
        treeTwo.printLevelSums();  // Выводим суммы элементов каждого уровня для дерева 2
    }
}

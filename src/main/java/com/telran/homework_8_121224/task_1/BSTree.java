package com.telran.homework_8_121224.task_1;

import lombok.Getter;  // Импортируем аннотацию Lombok для автоматической генерации геттеров
import lombok.Setter;  // Импортируем аннотацию Lombok для автоматической генерации сеттеров

import java.util.LinkedList;  // Импортируем класс LinkedList для использования в очереди
import java.util.Queue;  // Импортируем интерфейс Queue для создания очереди
import java.util.Stack;  // Импортируем класс Stack для хранения уровней дерева

@Setter  // Генерация сеттеров для всех полей класса
@Getter  // Генерация геттеров для всех полей класса
public class BSTree {
    private Node root;  // Корень дерева, типа Node

    // Конструктор класса BSTree. Инициализируем дерево с пустым корнем.
    public BSTree() {
        this.root = null;  // Изначально корень дерева равен null
    }

    // Метод для вставки элемента в дерево
    public void insert(int value) {
        root = insertRec(root, value);  // Вставляем элемент с помощью рекурсивного метода
    }

    // Рекурсивный метод для вставки элемента
    private Node insertRec(Node root, int value) {
        if (root == null) {  // Если корень пустой, создаем новый узел
            root = new Node(value, null, null);  // Новый узел с данным значением
            return root;
        }
        // Если значение меньше текущего узла, идем в левое поддерево
        if (value < root.getValue()) {
            root.setLeft(insertRec(root.getLeft(), value));  // Рекурсивно вставляем в левое поддерево
        } else if (value > root.getValue()) {  // Если больше, идем в правое поддерево
            root.setRight(insertRec(root.getRight(), value));  // Рекурсивно вставляем в правое поддерево
        }
        return root;  // Возвращаем корень дерева
    }

    // Метод для поиска элемента в дереве
    public Node searchRec(Node root, int value) {
        if (root == null || root.getValue() == value) {  // Если узел пустой или найден нужный элемент
            return root;
        }
        // Если значение меньше текущего узла, ищем в левом поддереве
        if (value < root.getValue()) {
            return searchRec(root.getLeft(), value);
        }
        // Иначе ищем в правом поддереве
        return searchRec(root.getRight(), value);
    }

    // Метод для вывода дерева снизу вверх
    public void printTreeBottomUp() {
        if (root == null) {  // Если дерево пустое
            System.out.println("Дерево пустое");
            return;
        }

        // Очередь для обхода дерева по уровням
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);  // Добавляем корень в очередь

        // Стек для хранения уровней дерева
        Stack<LinkedList<Integer>> levels = new Stack<>();

        // Проходим по всем уровням дерева
        while (!queue.isEmpty()) {
            int levelSize = queue.size();  // Получаем количество элементов на текущем уровне
            LinkedList<Integer> currentLevel = new LinkedList<>();  // Список для хранения элементов текущего уровня

            for (int i = 0; i < levelSize; i++) {  // Для каждого элемента на текущем уровне
                Node currentNode = queue.poll();  // Получаем узел из очереди
                currentLevel.add(currentNode.getValue());  // Добавляем значение узла в текущий уровень

                // Добавляем левого потомка в очередь, если он существует
                if (currentNode.getLeft() != null) {
                    queue.add(currentNode.getLeft());
                }
                // Добавляем правого потомка в очередь, если он существует
                if (currentNode.getRight() != null) {
                    queue.add(currentNode.getRight());
                }
            }

            levels.push(currentLevel);  // Добавляем текущий уровень в стек
        }

        // Выводим дерево снизу вверх
        while (!levels.isEmpty()) {
            LinkedList<Integer> level = levels.pop();  // Берем уровень из стека
            System.out.println(level);  // Выводим его на экран
        }
    }

    // Метод для вывода суммы элементов каждого уровня
    public void printLevelSums() {
        if (root == null) {  // Если дерево пустое
            System.out.println("Дерево пустое");
            return;
        }

        // Очередь для обхода дерева по уровням
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);  // Добавляем корень в очередь

        // Проходим по всем уровням дерева
        while (!queue.isEmpty()) {
            int levelSize = queue.size();  // Получаем количество элементов на текущем уровне
            int levelSum = 0;  // Переменная для хранения суммы на текущем уровне

            // Для каждого элемента на текущем уровне
            for (int i = 0; i < levelSize; i++) {
                Node currentNode = queue.poll();  // Получаем узел из очереди
                levelSum += currentNode.getValue();  // Добавляем значение узла в сумму

                // Добавляем левого потомка в очередь, если он существует
                if (currentNode.getLeft() != null) {
                    queue.add(currentNode.getLeft());
                }
                // Добавляем правого потомка в очередь, если он существует
                if (currentNode.getRight() != null) {
                    queue.add(currentNode.getRight());
                }
            }

            // Выводим сумму элементов на текущем уровне
            System.out.println("Сумма элементов на уровне: " + levelSum);
        }
    }
}

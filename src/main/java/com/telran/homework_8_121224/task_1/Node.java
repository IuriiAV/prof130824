package com.telran.homework_8_121224.task_1;

import lombok.Getter;  // Импортируем аннотацию Lombok для автоматической генерации геттеров
import lombok.Setter;  // Импортируем аннотацию Lombok для автоматической генерации сеттеров

@Setter  // Генерация сеттеров для всех полей класса
@Getter  // Генерация геттеров для всех полей класса
public class Node {

    private int value;  // Значение узла дерева
    private Node left;  // Ссылка на левое поддерево (левый потомок)
    private Node right; // Ссылка на правое поддерево (правый потомок)

    // Конструктор для создания узла с заданным значением и потомками
    public Node(int value, Node left, Node right) {
        this.value = value;    // Инициализация значения узла
        this.left = left;      // Инициализация левого потомка
        this.right = right;    // Инициализация правого потомка
    }
}

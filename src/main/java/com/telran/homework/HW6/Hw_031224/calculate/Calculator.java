package com.telran.homework.HW6.Hw_031224.calculate;

import java.util.ArrayDeque;
import java.util.Deque;


public class Calculator {

    public int calculate(String s) {
        Deque<Integer> stack = new ArrayDeque<>(); // стек для хранения чисел
        int num = 0; // текущее число
        char lastOperator = '+';  // Переменная для хранения последнего оператора, по умолчанию это сложение

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);  // Берём текущий символ строки

            if (Character.isDigit(currentChar)) {  // Если символ является цифрой
                num = num * 10 + (currentChar - '0');  // Собираем число, если цифры идут подряд
            }
            // Если текущий символ не цифра или это пробел, или мы дошли до конца строки
            if (!Character.isDigit(currentChar) && currentChar != ' ' || i == s.length() - 1) {
                // В зависимости от последнего оператора, выполняем соответствующую операцию

                if (lastOperator == '+') {
                    stack.push(num); // Если последний оператор был +, добавляем число в стек
                } else if (lastOperator == '-') {
                    stack.push(-num);   // Если последний оператор был -, добавляем отрицательное число в стек
                } else if (lastOperator == '*') {
                    stack.push(stack.pop() * num); // Если последний оператор был *, умножаем верхнее число стека на текущее число
                } else if (lastOperator == '/') {
                    stack.push(stack.pop() / num); // Если последний оператор был /, делим верхнее число стека на текущее число
                }
                num = 0;  // Сбрасываем текущую переменную для следующего числа
                lastOperator = currentChar;  // Обновляем оператор на текущий
            }
        }
        // После того как все символы обработаны, суммируем все числа в стеке
        int result = 0;  // Инициализируем переменную для результата
        while (!stack.isEmpty()){  // Пока стек не пуст
            result+=stack.pop();   // Снимаем числа со стека и добавляем их к результату
        }
        return result;  // Возвращаем итоговый результат
    }
}

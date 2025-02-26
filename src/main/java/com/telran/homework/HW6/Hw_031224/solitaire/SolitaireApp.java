package com.telran.homework.HW6.Hw_031224.solitaire;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.List;

// Основной класс, который запускает пасьянс
public class SolitaireApp {

    public static void main(String[] args) {
        Deck deck = new Deck(); // Создаём объект колоды карт
        deck.shuffleDeck(); // Перемешиваем карты
        layOutCards(deck.getCards()); // Запускаем метод выкладывания карт
    }

    // Метод для выкладывания карт и проверки на совпадение мастей
    private static void layOutCards(List<Card> cards) {
        Deque<Card> stack = new ArrayDeque<>(); // Стопка карт для пасьянса

        // Проходим по картам колоды
        for (Card card : cards) {
            // Если стопка не пуста и масть карты совпадает с мастью верхней карты в стопке
            if (!stack.isEmpty() && stack.peek().suit() == card.suit()){
                // Убираем пару карт
                System.out.println("Удалены: " + stack.pop() + " и " + card);
            } else {
                // Если масти не совпадают, кладём карту в стопку
                stack.push(card);
            }
        }

        // Проверяем, сколько карт осталось в стопке
        if (stack.size() == 4) {
            System.out.println("Пасьянс сошелся!");
        } else {
            System.out.println("Пасьянс не сошелся.");
        }
    }
}

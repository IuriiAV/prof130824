package com.telran.homework.HW6.Hw_031224.solitaire;

import lombok.Getter;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

// Класс Deck представляет колоду карт
@Getter
public class Deck {

    // Геттер для колоды
    // Возвращаем колоду карт
    // Список для хранения карт
    private List<Card> cards;

    // Конструктор колоды
    public Deck() {
        cards = new ArrayList<>(); // Инициализируем пустой список
        initializeDeck(); // Инициализируем колоду карт
    }

    // Метод для наполнения колоды картами
    private void initializeDeck() {
        // Для каждой масти
        for (Suit suit : Suit.values()) {
            // Для каждого ранга
            for (Rank rank : Rank.values()) {
                // Создаем новую карту и добавляем её в список
                cards.add(new Card(suit, rank));
            }
        }
    }

    // Метод для перемешивания карт
    public void shuffleDeck() {
        Collections.shuffle(cards); // Перемешиваем карты с помощью стандартной библиотеки
    }

}
package com.telran.homework.HW6.Hw_031224.solitaire;

/**
 * @param suit Масть карты
 * @param rank Ранг карты
 */
public record Card(Suit suit, Rank rank) {
    // Конструктор для инициализации карты

    // Переопределение toString для красивого вывода
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

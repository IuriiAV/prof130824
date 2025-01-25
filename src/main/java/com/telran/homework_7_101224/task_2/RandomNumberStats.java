import java.util.HashMap;  // Импортируем класс для работы с хеш-таблицей
import java.util.Map;      // Импортируем интерфейс Map для работы с парами ключ-значение
import java.util.Random;   // Импортируем класс Random для генерации случайных чисел

public class RandomNumberStats {

    public static void main(String[] args) {

        Random random = new Random();  // Создаем объект для генерации случайных чисел

        Map<Integer, Integer> numberCount = new HashMap<>();  // Создаем коллекцию для хранения статистики (сколько раз каждое число было сгенерировано)

        // Инициализируем значения в Map: для каждого числа от 0 до 50 ставим начальное количество генераций = 0
        for (int i = 0; i <= 50; i++) {
            numberCount.put(i, 0);  // Добавляем в Map пару (число, 0)
        }

        // Генерация 10000 случайных чисел от 0 до 50
        for (int i = 0; i < 10000; i++) {
            int randomNumber = random.nextInt(51);  // Генерируем случайное число от 0 до 50
            // Увеличиваем количество сгенерированных чисел для этого randomNumber
            numberCount.put(randomNumber, numberCount.get(randomNumber) + 1);
        }

        // Выводим статистику: для каждого числа выводим, сколько раз оно было сгенерировано
        for (Map.Entry<Integer, Integer> entry : numberCount.entrySet()) {
            System.out.println("Число " + entry.getKey() + " было сгенерировано " + entry.getValue() + " раз.");
        }
    }
}

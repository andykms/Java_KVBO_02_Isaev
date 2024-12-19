// Обобщенный класс с тремя параметрами T, V, K
package utn;
//ЗАДАНИЕ 1
class Triple<T, V, K> {
    private T first;  // Первое значение
    private V second; // Второе значение
    private K third;  // Третье значение

    // Конструктор
    public Triple(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    // Метод для получения первого значения
    public T getFirst() {
        return first;
    }

    // Метод для получения второго значения
    public V getSecond() {
        return second;
    }

    // Метод для получения третьего значения
    public K getThird() {
        return third;
    }

    // Переопределение метода toString для удобного отображения
    @Override
    public String toString() {
        return "Triple{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        // Создание экземпляра обобщенного класса Triple
        Triple<Integer, String, Double> triple = new Triple<>(1, "rvr", 3.14);

        // Получение значений
        Integer firstValue = triple.getFirst();
        String secondValue = triple.getSecond();
        Double thirdValue = triple.getThird();

        // Вывод значений
        System.out.println("Первое значение: " + firstValue);
        System.out.println("Второе значение: " + secondValue);
        System.out.println("Третье значение: " + thirdValue);

        // Вывод всего объекта
        System.out.println(triple);
    }
}

/*Описание кода:
Класс Triple<T, V, K>: Обобщенный класс, который принимает три параметра типа T, V и K. Он содержит три приватных поля для хранения значений этих типов.

Конструктор: Конструктор класса принимает три аргумента и инициализирует соответствующие поля.

Методы доступа: Методы getFirst(), getSecond() и getThird() позволяют получить значения, хранящиеся в объекте.

Переопределение метода toString(): Этот метод возвращает строковое представление объекта Triple, что позволяет легко выводить его содержимое.

Пример использования: В классе Main создается экземпляр класса Triple, который хранит значения различных типов (целое число, строку и число с плавающей запятой). Затем выводятся значения и сам объект.

Этот код демонстрирует, как можно использовать обобщенные классы для хранения значений различных типов в одном объекте.*/
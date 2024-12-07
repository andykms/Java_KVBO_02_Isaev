// Обобщенный класс с тремя параметрами T, V, K
class Triple2<T, V, K> {
    private T first;  // Первое значение
    private V second; // Второе значение
    private K third;  // Третье значение

    // Конструктор
    public Triple2(T first, V second, K third) {
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

    // Метод для вывода имен классов переменных
    public void printClassNames() {
        System.out.println("Тип первого значения: " + first.getClass().getName());
        System.out.println("Тип второго значения: " + second.getClass().getName());
        System.out.println("Тип третьего значения: " + third.getClass().getName());
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
public class Main2 {
    public static void main(String[] args) {
        // Создание экземпляра обобщенного класса Triple
        Triple2<Integer, String, Double> triple = new Triple2<>(1, "Hello", 3.14);

        // Получение значений
        Integer firstValue = triple.getFirst();
        String secondValue = triple.getSecond();
        Double thirdValue = triple.getThird();

        // Вывод значений
        System.out.println("Первое значение: " + firstValue);
        System.out.println("Второе значение: " + secondValue);
        System.out.println("Третье значение: " + thirdValue);

        // Вывод имен классов переменных
        triple.printClassNames();

        // Вывод всего объекта
        System.out.println(triple);
    }
}

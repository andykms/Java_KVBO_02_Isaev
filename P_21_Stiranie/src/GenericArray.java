import java.util.Arrays;

public class GenericArray<T> {
    private T[] array;
    private int size;

    // Конструктор класса
    public GenericArray(int capacity) {
        // Используем массив Object для хранения данных любого типа
        array = (T[]) new Object[capacity];
        size = 0;
    }

    // Метод для добавления элемента в массив
    public void add(T element) {
        if (size < array.length) {
            array[size] = element;
            size++;
        } else {
            System.out.println("Массив полон. Не удалось добавить элемент: " + element);
        }
    }

    // Метод для получения элемента по индексу. ЗАДАНИЕ 3
    public T get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Индекс вне диапазона: " + index);
        }
    }

    // Метод для получения текущего размера массива
    public int size() {
        return size;
    }

    // Метод для вывода содержимого массива
    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(array, size));
    }

    public static void main(String[] args) {
        // Пример использования класса для хранения массива целых чисел
        GenericArray<Integer> intArray = new GenericArray<>(5);
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        System.out.println("Массив целых чисел: " + intArray);
        //Получение значения, задание 3
        System.out.println("Нулевой элемент:" + intArray.get(0));
        // Пример использования класса для хранения массива строк
        GenericArray<String> stringArray = new GenericArray<>(3);
        stringArray.add("apple");
        stringArray.add("banana");
        System.out.println("Массив строк: " + stringArray);

        // Пример использования класса для хранения массива длинных чисел
        GenericArray<Long> longArray = new GenericArray<>(4);
        longArray.add(10000000000L);
        longArray.add(20000000000L);
        System.out.println("Массив длинных чисел: " + longArray);
    }
}


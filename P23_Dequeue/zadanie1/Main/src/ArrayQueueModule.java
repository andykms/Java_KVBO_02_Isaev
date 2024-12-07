public class ArrayQueueModule {
    private static Object[] elements;
    private static int head;
    private static int tail;
    private static int size;
    private static final int CAPACITY = 10;

    static {
        elements = new Object[CAPACITY];
        head = 0;
        tail = 0;
        size = 0;
    }

    // Добавляет элемент в очередь
    public static void enqueue(Object element) {
        // Предусловие: размер очереди меньше размера массива
        if (size >= elements.length) {
            throw new IllegalStateException("Очередь полна");
        }
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
        // Постусловие: элемент добавлен, размер увеличен на 1
    }

    // Возвращает первый элемент очереди
    public static Object element() {
        // Предусловие: очередь не пустая
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return elements[head];
        // Постусловие: возвращает первый элемент без удаления
    }

    // Удаляет и возвращает первый элемент очереди
    public static Object dequeue() {
        // Предусловие: очередь не пустая
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        Object element = elements[head];
        elements[head] = null; // Удаляем ссылку для сборщика мусора
        head = (head + 1) % elements.length;
        size--;
        // Постусловие: первый элемент удален и возвращен, размер уменьшен на 1
        return element;
    }

    // Возвращает текущий размер очереди
    public static int size() {
        return size;
        // Постусловие: возвращает текущее количество элементов
    }

    // Проверяет, является ли очередь пустой
    public static boolean isEmpty() {
        return size == 0;
        // Постусловие: возвращает true, если очередь пуста
    }

    // Удаляет все элементы из очереди
    public static void clear() {
        while (!isEmpty()) {
            dequeue();
        }
        // Постусловие: все элементы удалены, размер равен 0
    }
}


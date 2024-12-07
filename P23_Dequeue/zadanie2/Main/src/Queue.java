public interface Queue<E> {
    void enqueue(E element); // Добавляет элемент в очередь
    E dequeue(); // Удаляет и возвращает первый элемент очереди
    E element(); // Возвращает первый элемент очереди без удаления
    int size(); // Возвращает текущее количество элементов в очереди
    boolean isEmpty(); // Проверяет, является ли очередь пустой
    void clear(); // Удаляет все элементы из очереди
}

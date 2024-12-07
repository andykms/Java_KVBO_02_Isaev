public abstract class AbstractQueue<E> implements Queue<E> {
    protected int size; // Общий размер очереди

    @Override
    public int size() {
        return size; // Возвращаем текущий размер
    }

    @Override
    public boolean isEmpty() {
        return size == 0; // Проверяем, пустая ли очередь
    }

    @Override
    public void clear() {
        size = 0; // Обнуляем размер
    }
}

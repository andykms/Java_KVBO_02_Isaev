public class LinkedQueue<E> extends AbstractQueue<E> {
    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
        }
    }

    private Node<E> head; // Указывает на первый элемент
    private Node<E> tail; // Указывает на последний элемент

    public LinkedQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void enqueue(E element) {
        Node<E> newNode = new Node<>(element);
        if (tail != null) {
            tail.next = newNode; // Присоединяем новый узел к последнему
        }
        tail = newNode; // Обновляем tail на новый узел
        if (head == null) {
            head = tail; // Если очередь была пустой, head указывает на новый узел
        }
        size++; // Увеличиваем размер
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        E data = head.data; // Получаем данные из первого узла
        head = head.next; // Перемещаем head на следующий узел
        if (head == null) {
            tail = null; // Если очередь стала пустой, обновляем tail
        }
        size--; // Уменьшаем размер
        return data;
    }

    @Override
    public E element() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return head.data; // Возвращаем данные первого узла
    }
}


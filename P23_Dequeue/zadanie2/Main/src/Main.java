//ЗАДАНИЕ 2 - Очередь на связанном списке


public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedQueue<>();

        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

        System.out.println("Первый элемент: " + queue.element());
        System.out.println("Удаленный элемент: " + queue.dequeue());
        System.out.println("Размер очереди: " + queue.size());

        queue.clear();
        System.out.println("Очередь очищена. Пустая: " + queue.isEmpty());
    }
}

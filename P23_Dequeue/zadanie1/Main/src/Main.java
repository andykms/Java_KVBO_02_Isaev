public class Main {
    public static void main(String[] args) {
        // Использование ArrayQueueModule
        System.out.println("ArrayQueueModule:");
        ArrayQueueModule.enqueue("A");
        ArrayQueueModule.enqueue("B");
        System.out.println("Первый элемент: " + ArrayQueueModule.element());
        System.out.println("Удаленный элемент: " + ArrayQueueModule.dequeue());
        System.out.println("Размер очереди: " + ArrayQueueModule.size());
        ArrayQueueModule.clear();
        System.out.println("Очередь очищена. Пустая: " + ArrayQueueModule.isEmpty());

        // Использование ArrayQueueADT
        System.out.println("\nArrayQueueADT:");
        ArrayQueueADT queueADT = new ArrayQueueADT();
        queueADT.enqueue("X");
        queueADT.enqueue("Y");
        System.out.println("Первый элемент: " + queueADT.element());
        System.out.println("Удаленный элемент: " + queueADT.dequeue());
        System.out.println("Размер очереди: " + queueADT.size());
        queueADT.clear();
        System.out.println("Очередь очищена. Пустая: " + queueADT.isEmpty());

        // Использование ArrayQueue
        System.out.println("\nArrayQueue:");
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue("1");
        queue.enqueue("2");
        System.out.println("Первый элемент: " + queue.element());
        System.out.println("Удаленный элемент: " + queue.dequeue());
        System.out.println("Размер очереди: " + queue.size());
        queue.clear();
        System.out.println("Очередь очищена. Пустая: " + queue.isEmpty());
    }
}


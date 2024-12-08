import java.util.PriorityQueue;

class PriorityQueueExample {
    public static void main(String[] args) {
        HashTable<String, String> hashTable = new HashTable<>(10);

        // Добавление 10 элементов
        hashTable.add("key1", "value1");
        hashTable.add("key2", "value2");
        hashTable.add("key3", "value3");
        hashTable.add("key4", "value4");
        hashTable.add("key5", "value5");
        hashTable.add("key6", "value6");
        hashTable.add("key7", "value7");
        hashTable.add("key8", "value8");
        hashTable.add("key9", "value9");
        hashTable.add("key10", "value10");

        // Поиск элемента
        System.out.println("Lookup key3: " + hashTable.lookup("key3")); // value3

        // Удаление элемента
        hashTable.delete("key3");
        System.out.println("Lookup key3 after deletion: " + hashTable.lookup("key3")); // null
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Добавление 10 элементов в очередь с приоритетом
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(3);
        priorityQueue.add(7);
        priorityQueue.add(2);
        priorityQueue.add(8);
        priorityQueue.add(4);
        priorityQueue.add(10);
        priorityQueue.add(6);
        priorityQueue.add(9);

        // Извлечение и вывод нескольких элементов
        System.out.println("Извлечение элементов из очереди с приоритетом:");
        for (int i = 0; i < 5; i++) {
            System.out.println(priorityQueue.poll()); // Выводит элементы в порядке их приоритета
        }

    }
}